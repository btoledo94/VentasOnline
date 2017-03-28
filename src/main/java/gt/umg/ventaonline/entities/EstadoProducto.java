package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table()
public class EstadoProducto implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    private String descripcion;
    
    private boolean activo;

    public EstadoProducto() {
    }

    public EstadoProducto(Integer Id, String descripcion, boolean activo) {
        this.Id = Id;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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