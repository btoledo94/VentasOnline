/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.inte;

import gt.umg.ventaonline.entities.Sesion;
import gt.umg.ventaonline.entities.Usuario;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BYRON TOLEDO
 */
@RestController()
@RequestMapping(value = "/api/Usuario",produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public interface UsuarioInt {
    
    @Transactional(readOnly = true)
    @RequestMapping(value={"","/"},method=RequestMethod.GET)
    public ResponseEntity<Usuario> findAll() throws Exception;

     @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity<Usuario> create(
            @RequestBody Usuario usuario
    ) throws Exception;
    
    @Transactional(readOnly = true)
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Sesion> login(
            @RequestParam(value="correo",defaultValue="") String correo,
            @RequestParam(value="password",defaultValue="") String password
    ) throws Exception;
}