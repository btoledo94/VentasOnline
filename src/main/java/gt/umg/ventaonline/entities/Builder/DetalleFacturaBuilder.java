/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.entities.Builder;

import gt.umg.ventaonline.entities.DetalleFactura;
import gt.umg.ventaonline.entities.Factura;
import gt.umg.ventaonline.entities.Producto;

/**
 *
 * @author BYRON TOLEDO
 */
public class DetalleFacturaBuilder {
    private Factura factura;
    private Producto producto;

    public DetalleFacturaBuilder() {
    }

     public DetalleFacturaBuilder setFactura(Factura factura) {
        this.factura = factura; 
        return this;
    }

    public DetalleFacturaBuilder setProducto(Producto producto) {
        this.producto = producto; 
        return this;
    } 
    
    
    public DetalleFactura build() {
        if(factura==null||producto==null){
        return null;
        }
        
        return new DetalleFactura(factura,producto);
    }
       
}
