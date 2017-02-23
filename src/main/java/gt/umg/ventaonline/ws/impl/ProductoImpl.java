/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Producto;
import gt.umg.ventaonline.ws.inte.ProductoInt;
import gt.umg.ventaonline.ws.repo.ProductoRepo;
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
public class ProductoImpl implements ProductoInt {
     @Autowired()
    private ProductoRepo usuarioRepo;
     
     @Override
    public ResponseEntity<Producto> findAll() throws Exception {
      List<Producto> usuarios = usuarioRepo.findAll();
      return new ResponseEntity(usuarios,HttpStatus.OK);
 }
}