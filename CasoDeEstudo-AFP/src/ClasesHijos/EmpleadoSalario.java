
package ClasesHijos;
import java.util.*;

import SistemaAfpPadre.RegistroEmpleado;


public class EmpleadoSalario extends RegistroEmpleado {
    int SalarioFIjo;
    int HorasTrabajadas = 8;
    int PagoPorHoras = 10;
   
    public EmpleadoSalario(String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);
    }

    public int getSalarioFIjo() {
        return HorasTrabajadas*PagoPorHoras;
    }
    

   
    }
    

    
    
        
    
    

