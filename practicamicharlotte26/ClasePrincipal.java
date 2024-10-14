

package practicamicharlotte26;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
       // instancias
        Empleado empleado = new Empleado("Elsa","Juarez","Femenino",25,"Uruguaya",1.61,123,"Cajera",20000,"Nocturno");
        Cliente cliente = new Cliente ("Jorge","Morán","Masculino", 43,"Costarriquense",1.83,004, "jorgecitomora@gmail.com");
        Scanner lectura = new Scanner (System.in);
        
        //menu
        int opcion= 0;
        System.out.println("Seleccione una opción:");
        System.out.println("1. Solicitar un permiso como Empleado");
        System.out.println("2. Reportar horas extras como Empleado");
        System.out.println("3. Contactar un representante como Cliente");
        System.out.println("4. Solicitar información como Cliente");
        opcion = lectura.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println(empleado.solicitudPermiso());
                break;
            case 2:
                System.out.println(empleado.reporteHorasExtra());
                break;
            case 3:
                System.out.println(cliente.contactarRepresentante());
                break;
            case 4:
                System.out.println(cliente.solicitarInformacion());
                break;
            default:
                System.out.println("No válido");
            
        }  
    
    } 
    
}
