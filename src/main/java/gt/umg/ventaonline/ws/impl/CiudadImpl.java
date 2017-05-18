/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Ciudad;
import gt.umg.ventaonline.ws.inte.CiudadInt;
import gt.umg.ventaonline.ws.repo.CiudadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class CiudadImpl implements CiudadInt{

    @Autowired
    private CiudadRepo ciudadRepo;
    
    @Override
    public ResponseEntity<Ciudad> findAll(Integer estadoId) throws Exception {
      return new ResponseEntity(ciudadRepo.findByEstadoId(estadoId), HttpStatus.OK);  
    }
    
    
    
}
