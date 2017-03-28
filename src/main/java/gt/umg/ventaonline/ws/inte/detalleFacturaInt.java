package gt.umg.ventaonline.ws.inte;

import gt.umg.ventaonline.entities.detalleFactura;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/detalleFactura",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface detalleFacturaInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/"},method=RequestMethod.GET)
    public ResponseEntity<detalleFactura> findAll() throws Exception;
    
}
