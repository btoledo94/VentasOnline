package gt.umg.ventaonline.entities;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table()
public class CostosEnvio implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private BigDecimal precio;
    
    @ManyToOne()
    @JoinColumn()
    private Pais pais;
    
    @ManyToOne()
    @JoinColumn()
    private TipoEnvio tipoEnvio;
    

    public CostosEnvio() {
    }

    public CostosEnvio(Integer id, BigDecimal precio, Pais pais, TipoEnvio tipoEnvio) {
        this.id = id;
        this.precio = precio;
        this.pais = pais;
        this.tipoEnvio = tipoEnvio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
  
        
}