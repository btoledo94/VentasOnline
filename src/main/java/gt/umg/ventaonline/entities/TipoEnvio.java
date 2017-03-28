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
public class TipoEnvio implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @ManyToOne()
    @JoinColumn()
    private EnvioCargo envioCargo;
    
    private String Tipo;

    public TipoEnvio() {
    }

    public TipoEnvio(Integer Id, EnvioCargo envioCargo, String Tipo) {
        this.Id = Id;
        this.envioCargo = envioCargo;
        this.Tipo = Tipo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public EnvioCargo getEnvioCargo() {
        return envioCargo;
    }

    public void setEnvioCargo(EnvioCargo envioCargo) {
        this.envioCargo = envioCargo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}