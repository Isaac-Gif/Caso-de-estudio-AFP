
package ClasesHijos;

import SistemaAfpPadre.RegistroEmpleado;


 
public class EmpleadoHora extends RegistroEmpleado {
    int HorasTrabaja;
    double PagoPorHoras;
    
    public EmpleadoHora(String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);
    }

    public int getHorasTrabaja(int getHorasTrabaja) {
        return HorasTrabaja*1;
    }

    public double getPagoPorHoras() {
        return getPagoPorHoras()* 10;
                
    }
    
    
}
