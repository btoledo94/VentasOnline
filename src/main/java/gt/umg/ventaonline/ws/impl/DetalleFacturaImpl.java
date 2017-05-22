/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.impl;

import gt.umg.ventaonline.entities.Builder.DetalleFacturaBuilder;
import gt.umg.ventaonline.entities.DetalleFactura;
import gt.umg.ventaonline.ws.inte.DetalleFacturaInt;
import gt.umg.ventaonline.ws.repo.DetalleFacturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author BYRON TOLEDO
 */
public class DetalleFacturaImpl implements DetalleFacturaInt{
    
    @Autowired()
    private DetalleFacturaRepo detalleFacturaRepo;
    
    @Override
    public ResponseEntity<DetalleFactura> create(DetalleFactura detalleFactura) throws Exception{
    
        DetalleFactura detalleFacturaEntity = new DetalleFacturaBuilder()
                .setFactura(detalleFactura.getFactura())
                .setProducto(detalleFactura.getProducto())
                .build();  
        
        if(detalleFacturaEntity == null){
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        return new ResponseEntity(detalleFacturaRepo.save(detalleFacturaEntity), HttpStatus.OK);
    }
    
}
