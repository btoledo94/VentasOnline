/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.repo;

import gt.umg.ventaonline.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface UsuarioRepo extends JpaRepository<Usuario,Integer>{
    
    Usuario findByCorreo(String correo);
    
    @Query(" select count(u.correo) from Usuario as u where u.correo = :correo ")
    Long countByCorreo(@Param("correo") String correo);
    
}
