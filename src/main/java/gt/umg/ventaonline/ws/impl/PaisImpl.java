/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Pais;
import gt.umg.ventaonline.ws.inte.PaisInt;
import gt.umg.ventaonline.ws.repo.PaisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class PaisImpl implements PaisInt {
    
    @Autowired()
    private PaisRepo paisRepo;
    
    @Override
    public ResponseEntity<Pais> findAll() throws Exception {
        return new ResponseEntity(paisRepo.findAll(), HttpStatus.OK);
    }
    
}
