/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.inte;

/**
 *
 * @author BYRON TOLEDO
 */
import gt.umg.ventaonline.entities.DetalleFactura;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/DetalleFactura",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface DetalleFacturaInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/"},method=RequestMethod.GET)
    public ResponseEntity<DetalleFactura> create(
        @RequestBody DetalleFactura detalleFactura
    ) throws Exception;
    
}