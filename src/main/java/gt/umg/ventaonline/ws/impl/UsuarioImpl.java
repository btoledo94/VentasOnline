/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Builder.UsuarioBuilder;
import gt.umg.ventaonline.entities.Usuario;
import gt.umg.ventaonline.ws.inte.UsuarioInt;
import gt.umg.ventaonline.ws.repo.UsuarioRepo;
import gt.umg.ventaonline.ws.security.Md5Encrypt;
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
    
    @Override
    public ResponseEntity<Usuario> create(Usuario usuario) throws Exception {
        
        Usuario usuarioEntity = new UsuarioBuilder()
                .setCiudad(usuario.getCiudad())
                .setCorreo(usuario.getCorreo())
                .setPassword(Md5Encrypt.get_md5(usuario.getPassword()))
                .setNombre(usuario.getNombre())
                .setApellido(usuario.getApellido())
                .setFechaNacimiento(usuario.getFechaNacimiento())
                .setDireccion(usuario.getDireccion())
                .build();
        
        if(usuarioEntity == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if(usuarioRepo.countByCorreo(usuario.getCorreo()) > 0){
            return new ResponseEntity(HttpStatus.FOUND);
        }
        
        return new ResponseEntity(usuarioRepo.save(usuarioEntity), HttpStatus.OK);
    }
}
