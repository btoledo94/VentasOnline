/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Producto;
import gt.umg.ventaonline.ws.inte.ProductoInt;
import gt.umg.ventaonline.ws.repo.ProductoRepo;
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
    private ProductoRepo productoRepo;
     
     @Override
    public ResponseEntity<Producto> findAll(Integer categoriaId) throws Exception {
      return new ResponseEntity(productoRepo.findByCategoriaId(categoriaId),HttpStatus.OK);
 }
}