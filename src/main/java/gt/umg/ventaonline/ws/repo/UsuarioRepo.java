/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.ws.repo;

import gt.umg.ventaonline.entities.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface UsuarioRepo extends JpaRepository<Usuario,Integer>{
    
    @Override()
    List<Usuario> findAll();
    
    Usuario findById(Integer id);
    
    List<Usuario> findByNombresAndApellidosAndActivoTrue(String nombres, String apellidos);
    
    Usuario findByCorreo(String correo);
    
}
