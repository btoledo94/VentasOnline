/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.ventaonline.entities.Builder;

import gt.umg.ventaonline.entities.Ciudad;
import gt.umg.ventaonline.entities.Usuario;
import java.util.Date;

/**
 *
 * @author wilver
 */
public class UsuarioBuilder {
    
    private Ciudad ciudad;
    private String correo;
    private String password;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String direccion;

    public UsuarioBuilder() {
    }    

    public UsuarioBuilder setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public UsuarioBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public UsuarioBuilder setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public UsuarioBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    
    public Usuario build(){
        if(ciudad == null || correo == null || nombre == null || password == null || apellido == null || fechaNacimiento == null || direccion == null){
            return null;
        }
        
        return new Usuario(ciudad, correo, password, nombre, apellido, fechaNacimiento, new Date(), direccion, true);
    }
    
}
