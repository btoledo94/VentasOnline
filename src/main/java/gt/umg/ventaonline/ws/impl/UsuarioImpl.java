/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Usuario;
import gt.umg.ventaonline.ws.inte.UsuarioInt;
import gt.umg.ventaonline.ws.repo.UsuarioRepo;
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
public class UsuarioImpl implements UsuarioInt{
    
    @Autowired()
    private UsuarioRepo usuarioRepo;

    @Override
    public ResponseEntity<Usuario> findAll() throws Exception {
      List<Usuario> usuarios = usuarioRepo.findAll();
      return new ResponseEntity(usuarios,HttpStatus.OK);
    }
    
    
   
}
