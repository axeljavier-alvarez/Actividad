

package conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Docente extends Persona {

    public static TableModel leer;
    private int id_persona;
    conexion_db cn;
    
    public Docente(){}
    public Docente(int id_persona, String nit, String nombres, String apellidos, String direccion, String telefono, String nacimiento, Double salario, String codigo, String fecha_labores) {
        super(nit, nombres, apellidos, direccion, telefono, nacimiento, salario, codigo, fecha_labores);
        this.id_persona = id_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
     @Override
public void crear() {
    try {
        PreparedStatement parametro;
        cn = new conexion_db();
        cn.abrir_conexion();
        
        // Modificar la consulta para que "fecha_ingreso_registro" se complete con CURRENT_TIMESTAMP
        String query = "INSERT INTO persona(nit,nombres,apellidos,direccion,telefono,fecha_nacimiento,codigo_docente,salario,fecha_ingreso_laborar,fecha_ingreso_registro) "
                     + "VALUES(?,?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP);";
        
        // Preparar el Statement
        parametro = (PreparedStatement) cn.conectar_db.prepareStatement(query);
        
        // Asignar valores a los placeholders
        parametro.setString(1, getNit());
        parametro.setString(2, getNombres());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getNacimiento());
        parametro.setString(7, getCodigo());
        parametro.setDouble(8, getSalario());
        parametro.setString(9, getFecha_labores());  // Solo se pasan 9 valores
        
        // Ejecutar la consulta
        int executar = parametro.executeUpdate();
        System.out.println("Ingreso exitoso.. " + Integer.toString(executar));
        
        // Cerrar la conexión
        cn.cerrar_conexion();
        
    } catch (SQLException ex) {
        System.out.println("Error en crear: " + ex.getMessage());
    }
}
    
    
    @Override
    public DefaultTableModel leer(){
        DefaultTableModel tabla = new DefaultTableModel();
        
        try{
            cn = new conexion_db();
            cn.abrir_conexion();
            String query = "select *from persona";
            ResultSet consulta = cn.conectar_db.createStatement().executeQuery(query);
            String encabezado []= {"ID", "NIT", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO", "F. NACIMIENTO", "CODIGO DOCENTE", "SALARIO", "F. I. LABORES", "F. I. REGISTRO"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[]= new String[11];
            while(consulta.next()){
                datos[0] = consulta.getString("id_persona");
                datos[1] = consulta.getString("nit");
                datos[2] = consulta.getString("nombres");
                datos[3] = consulta.getString("apellidos");
                datos[4] = consulta.getString("direccion");
                datos[5] = consulta.getString("telefono");
                datos[6] = consulta.getString("fecha_nacimiento");
                datos[7] = consulta.getString("codigo_docente");
                datos[8] = consulta.getString("salario");
                datos[9] = consulta.getString("fecha_ingreso_laborar");
                datos[10] = consulta.getString("fecha_ingreso_registro");
                tabla.addRow(datos);
                
            }
            cn.cerrar_conexion();
        }catch(SQLException ex){
            cn.cerrar_conexion();
            System.out.println("Error leer: "+ ex.getMessage());
        }
        return tabla;
    }
    
    @Override
    public void actualizar(){
       try {
        PreparedStatement parametro;
        cn = new conexion_db();
        cn.abrir_conexion();

        // Consulta SQL para actualizar los datos del empleado
        String query = "UPDATE persona SET nit = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, codigo_docente = ?, salario = ?, fecha_ingreso_laborar  = ? WHERE id_persona = ?;";

        parametro = (PreparedStatement) cn.conectar_db.prepareStatement(query);

        // Asignación de valores a los parámetros de la consulta
        parametro.setString(1, getNit());
        parametro.setString(2, getNombres());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getNacimiento());
        parametro.setString(7, getCodigo());
        parametro.setDouble(8, getSalario());
        parametro.setString(9, getFecha_labores());
        parametro.setInt(10, getId_persona());

        // Ejecutar la actualización
        int executar = parametro.executeUpdate();
        System.out.println("Modificación exitosa: " + executar);

        // Cerrar la conexión
        cn.cerrar_conexion();
        } catch (SQLException ex) {
            System.out.println("Error en actualizar: " + ex.getMessage());
        }
    }
    
    @Override
    public void borrar(){
        try {
            PreparedStatement parametro;
            cn = new conexion_db();
            cn.abrir_conexion();
            String query = "DELETE FROM persona WHERE id_persona = ?;";

            // Inicializar 'parametro' con un PreparedStatement válido
            parametro = cn.conectar_db.prepareStatement(query); 

            // Establecer el valor para el parámetro 'id_clientes'
            parametro.setInt(1, getId_persona());

            int executar = parametro.executeUpdate();
            System.out.println("Borrado exitoso: " + executar);

            // Cerrar la conexión y el PreparedStatement
            parametro.close();
            cn.cerrar_conexion();
        } catch (SQLException ex) {
            System.out.println("Error en borrar: " + ex.getMessage());
            }
        }
    
}