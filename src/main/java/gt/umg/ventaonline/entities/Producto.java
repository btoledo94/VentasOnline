
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
    
    private String nombreProducto;
    private String marca;
    
   @ManyToOne()
   @JoinColumn()
    private Categoria categoria;
   
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

    public Producto(Integer id, String nombreProducto, String marca, Categoria categoria, Usuario usuario, BigDecimal precio, Date fechaIngreso, String descripcion, EstadoProducto estadoproducto, boolean activo) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.categoria = categoria;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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