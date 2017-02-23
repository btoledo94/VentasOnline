/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity()
@Table()
public class Producto implements java.io.Serializable{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    
    
    private String deascripcion;
    
    private String ESTADO_DESCRIP;
    
    private String SERIE;
    
    private Integer VALOR_PRENDA;

    public Producto() {
    }

    public Producto(Integer id_producto, String deascripcion, String ESTADO_DESCRIP, String SERIE, Integer VALOR_PRENDA) {
        this.id_producto = id_producto;
        this.deascripcion = deascripcion;
        this.ESTADO_DESCRIP = ESTADO_DESCRIP;
        this.SERIE = SERIE;
        this.VALOR_PRENDA = VALOR_PRENDA;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getDeascripcion() {
        return deascripcion;
    }

    public void setDeascripcion(String deascripcion) {
        this.deascripcion = deascripcion;
    }

    public String getESTADO_DESCRIP() {
        return ESTADO_DESCRIP;
    }

    public void setESTADO_DESCRIP(String ESTADO_DESCRIP) {
        this.ESTADO_DESCRIP = ESTADO_DESCRIP;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public Integer getVALOR_PRENDA() {
        return VALOR_PRENDA;
    }

    public void setVALOR_PRENDA(Integer VALOR_PRENDA) {
        this.VALOR_PRENDA = VALOR_PRENDA;
    }

    

    
}
