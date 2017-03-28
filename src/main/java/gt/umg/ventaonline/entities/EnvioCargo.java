package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table()
public class EnvioCargo implements java.io.Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEnvio;
    
    private String nombreEmpresa;

    public EnvioCargo() {
    }

    public EnvioCargo(Integer IdEnvio, String nombreEmpresa) {
        this.IdEnvio = IdEnvio;
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getIdEnvio() {
        return IdEnvio;
    }

    public void setIdEnvio(Integer IdEnvio) {
        this.IdEnvio = IdEnvio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
}
