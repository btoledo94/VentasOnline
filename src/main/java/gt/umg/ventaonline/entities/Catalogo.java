
package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table()
public class Catalogo implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCatalogo;
    
    private String descripcion;
    
    private boolean activo;

    public Catalogo() {
        
    }

    public Catalogo(Integer idCatalogo, String descripcion, boolean activo) {
        this.idCatalogo = idCatalogo;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
      
}
