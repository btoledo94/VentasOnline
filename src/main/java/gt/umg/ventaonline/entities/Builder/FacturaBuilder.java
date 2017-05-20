/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.entities.Builder;

import gt.umg.ventaonline.entities.CostosEnvio;
import gt.umg.ventaonline.entities.Factura;
import gt.umg.ventaonline.entities.Usuario;
import java.util.Date;

/**
 *
 * @author BYRON TOLEDO
 */

public class FacturaBuilder {
    private Usuario usuario;
    private CostosEnvio costosEnvio;

    public FacturaBuilder() {
    }
    
   public FacturaBuilder setUsuario(Usuario usuario) {
        this.usuario = usuario; 
        return this;
    }

    public FacturaBuilder setCostosEnvio(CostosEnvio costosEnvio) {
        this.costosEnvio = costosEnvio; 
        return this;
    }
    
    public Factura build(){
    
        if(usuario == null){
            return null;
        }
        
        return new Factura(new Date(), usuario, costosEnvio);        
    }
    
}
