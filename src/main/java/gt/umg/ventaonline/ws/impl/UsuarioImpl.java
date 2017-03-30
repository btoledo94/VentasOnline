/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Sesion;
import gt.umg.ventaonline.entities.Usuario;
import gt.umg.ventaonline.ws.inte.UsuarioInt;
import gt.umg.ventaonline.ws.repo.SesionRepo;
import gt.umg.ventaonline.ws.repo.UsuarioRepo;
import gt.umg.ventaonline.ws.security.Md5Encrypt;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class UsuarioImpl implements UsuarioInt {
    
    @Autowired()
    private UsuarioRepo usuarioRepo;
    
    @Autowired()
    private SesionRepo sesionRepo;
    
    @Override
    public ResponseEntity<Usuario> findAll() throws Exception {
        List<Usuario> usuarios = usuarioRepo.findAll();
        
        return new ResponseEntity(usuarios, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Usuario> create(Usuario usuario) throws Exception {
        
        if("".equals(usuario.getNombre()) || usuario.getNombre()==null){
        
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if("".equals(usuario.getApellido()) || usuario.getApellido()==null){
        
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if("".equals(usuario.getCorreo()) || usuario.getCorreo()==null){
        
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if("".equals(usuario.getPassword()) || usuario.getPassword()==null){
        
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
                
        usuario.setFechaIngreso(new Date());
        usuario.setPassword(Md5Encrypt.get_md5(usuario.getPassword()));
        
        usuarioRepo.save(usuario);
        
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Sesion> login(String correo, String password) throws Exception {
        
        Usuario usuario= usuarioRepo.findByCorreo(correo);
         
        if(usuario==null){
           return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
        if(!usuario.getPassword().equals(Md5Encrypt.get_md5(password))){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);            
        }
        
        Sesion sesion = new Sesion();
        Date fechaActual= new Date();
        String Token= usuario.getCorreo() + fechaActual.getTime();
        
        Token = Md5Encrypt.get_md5(Token);
        
        sesion.setFecha(fechaActual);
        sesion.setToken(Token);
        sesion.setUsuario(usuario);
        
        sesionRepo.save(sesion);
        
        return new ResponseEntity(sesion,HttpStatus.OK);
    }
}
