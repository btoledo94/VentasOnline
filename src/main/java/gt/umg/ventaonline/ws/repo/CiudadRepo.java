/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.repo;

import gt.umg.ventaonline.entities.Ciudad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author wilver
 */
public interface CiudadRepo extends JpaRepository<Ciudad , Integer>{
    
    @Query("from Ciudad as c where c.estado.id = :estadoId")
    List<Ciudad> findByEstadoId(@Param("estadoId") Integer estadoId);
    
    
}
