
package practicamicharlotte26;


public class Empleado extends Persona{
    //atributos
    private int CodEmpleado;
    private String Cargo;
    private double Sueldo;
    private String TurnoLaboral;
  
    //constructor
    public Empleado(String Nombre, String Apellido, String Genero, int Edad, String Nacionalidad, double AlturaCM, int CodEmpleado, String Cargo, double Sueldo, String TurnoLaboral){
        super(Nombre,Apellido,Genero,Edad,Nacionalidad,AlturaCM);
        this.CodEmpleado = CodEmpleado;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
        this.TurnoLaboral = TurnoLaboral;
    }
    
    
    // En clase Empleado crear método solicitudPermiso y ReporteHorasExtra.
    
        public String solicitudPermiso(){
            return getNombre()+ " ha solicitado un permiso...";
        }
        
        public String reporteHorasExtra(){
            return getNombre()+ " ha reportado horas extras...";
        }
}
