/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Estado;
import gt.umg.ventaonline.ws.inte.EstadoInt;
import gt.umg.ventaonline.ws.repo.EstadoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author wilver
 */
@Component()
public class EstadoImpl implements EstadoInt {
    
    @Autowired()
    private EstadoRepo estadoRepo;

    @Override
    public ResponseEntity<Estado> findAll(Integer paisId) throws Exception {
        return new ResponseEntity(estadoRepo.findByPaisId(paisId), HttpStatus.OK);
    }
    
}
