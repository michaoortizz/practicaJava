
package practicamicharlotte26;


public class Cliente extends Persona{
    //atributos
    private int codCliente;
    private String correoElectronico;
    
    //constructor
    public Cliente(String Nombre, String Apellido, String Genero, int Edad, String Nacionalidad, double AlturaCM, int codCliente, String correoElectronico){
        super(Nombre, Apellido, Genero,Edad,Nacionalidad,AlturaCM);
        this.codCliente = codCliente;
        this.correoElectronico = correoElectronico;
    }
    
    //En clase Cliente crear método ContactarRepresentante y SolicitarInformación.

    public String contactarRepresentante(){
        return getNombre()+ " quiere contactar al representante...";
    }
    
    public String solicitarInformacion(){
        return getNombre()+ " está solicitando información...";
    }
}
