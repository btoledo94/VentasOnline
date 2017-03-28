package gt.umg.ventaonline.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table()
public class Factura implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    
    @ManyToOne()
    @JoinColumn()
    private Usuario usuario;

    public Factura() {
 
    }

    public Factura(Integer Id, Date fechaIngreso, Usuario usuario) {
        this.Id = Id;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
            
}