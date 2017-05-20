/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Sesion;
import gt.umg.ventaonline.entities.Usuario;
import gt.umg.ventaonline.ws.inte.SesionInt;
import gt.umg.ventaonline.ws.repo.UsuarioRepo;
import gt.umg.ventaonline.ws.security.Md5Encrypt;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import gt.umg.ventaonline.ws.repo.SesionRepo;

/**
 *
 * @author wilver
 */
@Component()
public class SesionImpl implements SesionInt {
    
    @Autowired()
    private UsuarioRepo usuarioRepo;
    
    @Autowired()
    private SesionRepo sesionRepo;
    
    @Override
    public ResponseEntity<Sesion> login(String correo, String password) throws Exception {
        
        Usuario usuarioEntity = usuarioRepo.findByCorreo(correo);
        
        if(usuarioEntity == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
        if(!usuarioEntity.getPassword().equals(Md5Encrypt.get_md5(password))){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        
        Sesion sesion = new Sesion();
        sesion.setFechaInicio(new Date());
        sesion.setUsuario(usuarioEntity);
        sesion.setToken(Md5Encrypt.get_md5(usuarioEntity.getId().toString() + new Date().getTime()));
        
        return new ResponseEntity(sesionRepo.save(sesion), HttpStatus.OK);
    }
    
}
