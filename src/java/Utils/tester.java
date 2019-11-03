
package Utils;

import org.semanticweb.owlapi.model.OWLOntologyStorageException;


public class tester 
{
    public static void main(String [] args) throws OWLOntologyStorageException
    {
        String ontoArch = "Ontologia/Academico.owl";
        
        OnologyManagement util = new OnologyManagement();
        
        Profesor prof = new Profesor("12456","Rogoberto Lopez","masculino",45);
        util.creaIndividuoProfesor(ontoArch,prof);
        
        Alumno alu = new Alumno("2345678","Mariana Montes","femenino",24);
        util.creaIndividuoAlumno(ontoArch, alu);
    }
    
}
