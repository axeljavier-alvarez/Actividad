/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author robin
 */
abstract class Persona {
    private String  nit, nombres, apellidos, direccion, telefono, nacimiento, codigo, fecha_labores;
    private Double salario;
        
    public Persona(){}
    public Persona(String nit, String nombres, String apellidos, String direccion, String telefono, String nacimiento, Double salario, String codigo, String fecha_labores) {
        this.nit = nit;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.codigo = codigo;
        this.salario = salario;
        this.fecha_labores = fecha_labores;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_labores() {
        return fecha_labores;
    }

    public void setFecha_labores(String fecha_labores) {
        this.fecha_labores = fecha_labores;
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    protected void crear(){}
    protected DefaultTableModel leer(){return null;}
    protected void actualizar(){}
    protected void borrar(){}
}
