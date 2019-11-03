package Utils;


public class Alumno 
{
    private String matricula;
    private String nombre;
    private String genero;
    private int edad;

    public Alumno(String matricula, String nombre, String genero, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
