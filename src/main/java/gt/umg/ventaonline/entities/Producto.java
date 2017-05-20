
package gt.umg.ventaonline.entities;

import java.math.BigDecimal;
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
public class Producto implements java.io.Serializable{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
   @ManyToOne()
   @JoinColumn()
    private Catalogo catalogo;
   
   @ManyToOne()
   @JoinColumn()
   private Usuario usuario;
        
   private BigDecimal precio;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    
    private String descripcion;
    
    @ManyToOne()
    @JoinColumn()
    private EstadoProducto estadoproducto;
    
    private boolean activo;
    
    public Producto() {
    }

    public Producto(Integer id, Catalogo catalogo, Usuario usuario, BigDecimal precio, Date fechaIngreso, String descripcion, EstadoProducto estadoproducto, boolean activo) {
        this.id = id;
        this.catalogo = catalogo;
        this.usuario = usuario;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.estadoproducto = estadoproducto;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoProducto getEstadoproducto() {
        return estadoproducto;
    }

    public void setEstadoproducto(EstadoProducto estadoproducto) {
        this.estadoproducto = estadoproducto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
       
}