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
public class Ciudad implements java.io.Serializable{
  
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer IdLugarU;
    
    @ManyToOne()
   @JoinColumn()
    private Estado estadoProvincia;
    
    private String NombreLugarU;

    public Ciudad() {
    }

    public Ciudad(Integer IdLugarU, Estado estadoProvincia, String NombreLugarU) {
        this.IdLugarU = IdLugarU;
        this.estadoProvincia = estadoProvincia;
        this.NombreLugarU = NombreLugarU;
    }

    public Integer getIdLugarU() {
        return IdLugarU;
    }

    public void setIdLugarU(Integer IdLugarU) {
        this.IdLugarU = IdLugarU;
    }

    public Estado getEstadoProvincia() {
        return estadoProvincia;
    }

    public void setEstadoProvincia(Estado estadoProvincia) {
        this.estadoProvincia = estadoProvincia;
    }

    public String getNombreLugarU() {
        return NombreLugarU;
    }

    public void setNombreLugarU(String NombreLugarU) {
        this.NombreLugarU = NombreLugarU;
    }
 
}