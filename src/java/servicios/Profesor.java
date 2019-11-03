
package servicios;


public class Profesor 
{

    private String numEco;
    private String nombre;
    private String genero;
    private int edad;
    
     public Profesor(){
         
     }

    public Profesor(String numEco, String nombre, String genero, int edad) {
        this.numEco = numEco;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNumEco() {
        return numEco;
    }

    public void setNumEco(String numEco) {
        this.numEco = numEco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
