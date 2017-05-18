/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.inte;

import gt.umg.ventaonline.entities.Sesion;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilver
 */
@RestController()
@RequestMapping(value = "/api/Sesion", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface SesionInt {
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity<Sesion> login(
            @RequestParam(value = "correo", defaultValue = "") String correo,
            @RequestParam(value = "password", defaultValue = "") String password
    ) throws Exception;
    
}
