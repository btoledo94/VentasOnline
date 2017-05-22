/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.repo;

import gt.umg.ventaonline.entities.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author BYRON TOLEDO
 */
public interface DetalleFacturaRepo extends JpaRepository<DetalleFactura,Integer>{
    
}
