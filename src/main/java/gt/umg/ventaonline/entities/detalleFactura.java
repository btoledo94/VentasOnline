package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table()
public class detalleFactura implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @ManyToOne()
   @JoinColumn()
    private Factura factura;

   @ManyToOne()
   @JoinColumn()
   private Producto producto;
   
   @ManyToOne()
   @JoinColumn()
   private CostosEnvio costoEnvio;

    public detalleFactura() {
    }

    public detalleFactura(Integer Id, Factura factura, Producto producto, CostosEnvio costoEnvio) {
        this.Id = Id;
        this.factura = factura;
        this.producto = producto;
        this.costoEnvio = costoEnvio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public CostosEnvio getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(CostosEnvio costoEnvio) {
        this.costoEnvio = costoEnvio;
    }
   
}