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
public class Estado implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEstadoP;
    
    private String NombreEstadoP;
    
   @ManyToOne()
   @JoinColumn()
    private Pais pais;

    public Estado() {
    }

    public Estado(Integer IdEstadoP, String NombreEstadoP, Pais pais) {
        this.IdEstadoP = IdEstadoP;
        this.NombreEstadoP = NombreEstadoP;
        this.pais = pais;
    }

    public Integer getIdEstadoP() {
        return IdEstadoP;
    }

    public void setIdEstadoP(Integer IdEstadoP) {
        this.IdEstadoP = IdEstadoP;
    }

    public String getNombreEstadoP() {
        return NombreEstadoP;
    }

    public void setNombreEstadoP(String NombreEstadoP) {
        this.NombreEstadoP = NombreEstadoP;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
            
}
