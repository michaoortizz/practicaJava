

package practicamicharlotte26;

public class Persona {
   //atributos
   private String Nombre;
   private String Apellido;
   private String Genero;
   private int Edad;
   private String Nacionalidad;
   private double AlturaCM;
   
   //metodo
   public Persona (String Nombre, String Apellido, String Genero, int Edad, String Nacionalidad, double AlturaCM){
       this.Nombre = Nombre; 
       this.Apellido = Apellido;
       this.Genero = Genero;
       this.Edad = Edad;
       this.Nacionalidad = Nacionalidad;
       this.AlturaCM = AlturaCM;
   }
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getAlturaCM() {
        return AlturaCM;
    }

    public void setAlturaCM(double AlturaCM) {
        this.AlturaCM = AlturaCM;
    }
   
   
   
   

   

}

    

