
package SistemaAfpPadre;


public class RegistroEmpleado {
    protected String Nombre;
    protected String Apellido;
    protected int Edad;

    public RegistroEmpleado(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }
    
}