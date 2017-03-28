package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table()
public class Pais implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPais;
    
    private String NombrePais;

    public Pais() {
    }

    public Pais(Integer IdPais, String NombrePais) {
        this.IdPais = IdPais;
        this.NombrePais = NombrePais;
    }

    public Integer getIdPais() {
        return IdPais;
    }

    public void setIdPais(Integer IdPais) {
        this.IdPais = IdPais;
    }

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String NombrePais) {
        this.NombrePais = NombrePais;
    }
    
}
