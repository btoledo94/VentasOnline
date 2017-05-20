/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Builder.FacturaBuilder;
import gt.umg.ventaonline.entities.Factura;
import gt.umg.ventaonline.ws.inte.FacturaInt;
import gt.umg.ventaonline.ws.repo.FacturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class FacturaImpl implements FacturaInt{
    
    @Autowired()
    private FacturaRepo facturaRepo;
    
    @Override
    public ResponseEntity<Factura> facturar(Factura factura){
    
        Factura facturaEntity = new FacturaBuilder()
                .setUsuario(factura.getUsuario())
                .setCostosEnvio(factura.getCostosEnvio())
                .build();
        
        if(facturaEntity == null){
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        return new ResponseEntity(facturaRepo.save(facturaEntity),HttpStatus.OK);
        
    }
    
}
