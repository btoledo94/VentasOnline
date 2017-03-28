
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
    private Integer idProducto;
    
   @ManyToOne()
   @JoinColumn()
    private Catalogo catalogo;
   
   @ManyToOne()
   @JoinColumn()
   private Usuario usuario;
   
   @ManyToOne()
   @JoinColumn()
   private Categoria categoria;
   
   private BigDecimal precio;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    
    private String descripcion;
    
    @ManyToOne()
    @JoinColumn()
    private EstadoProducto estadoproducto;
    
    private boolean activo;
    
    private String marca;
    
    private String serie;
    
    private String urlImagen;
    
    public Producto() {
    }

    public Producto(Integer idProducto, Catalogo catalogo, Usuario usuario, Categoria categoria, BigDecimal precio, Date fechaIngreso, String descripcion, EstadoProducto estadoproducto, boolean activo, String marca, String serie, String urlImagen) {
        this.idProducto = idProducto;
        this.catalogo = catalogo;
        this.usuario = usuario;
        this.categoria = categoria;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.estadoproducto = estadoproducto;
        this.activo = activo;
        this.marca = marca;
        this.serie = serie;
        this.urlImagen = urlImagen;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    

   
}