
package Utils;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OnologyManagement      
{
    
    public void creaIndividuoProfesor(String arch, Profesor prof) throws OWLOntologyStorageException
    {
        try
        { 
            OWLOntologyManager man = OWLManager.createOWLOntologyManager();
            IRI ontologyIRI = IRI.create("http://www.semanticweb.org/alumno/ontologies/2019/9/Academico");
            
           
            OWLOntology ontology = man.loadOntologyFromOntologyDocument(new File(arch));
            System.out.println(ontology);
            
            OWLDataFactory factory = man.getOWLDataFactory();
            OWLClass profesor = factory.getOWLClass(IRI.create(ontologyIRI + "#Profesor"));
            OWLIndividual nuevoProf = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#" + prof.getNumEco()));
            
            OWLDataProperty tieneNumEco = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneNumEco"));
            OWLAxiom axiomNumEco = factory.getOWLDataPropertyAssertionAxiom(tieneNumEco, nuevoProf, prof.getNumEco());
            man.applyChange(new AddAxiom(ontology, axiomNumEco));
            
            OWLDataProperty tieneNombre = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneNombrePersona"));
            OWLAxiom axiomNombre = factory.getOWLDataPropertyAssertionAxiom(tieneNombre, nuevoProf, prof.getNombre());
            man.applyChange(new AddAxiom(ontology, axiomNombre));
            
            OWLDataProperty tieneGenero = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneGenero"));
            OWLAxiom axiomGenero = factory.getOWLDataPropertyAssertionAxiom(tieneGenero, nuevoProf, prof.getGenero());
            man.applyChange(new AddAxiom(ontology, axiomGenero));
            
            OWLDataProperty tieneEdad = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneEdad"));
            OWLAxiom axiomEdad = factory.getOWLDataPropertyAssertionAxiom(tieneEdad, nuevoProf, prof.getEdad());
            man.applyChange(new AddAxiom(ontology, axiomEdad));
            
            OWLClassAssertionAxiom classAssertionAx = factory.getOWLClassAssertionAxiom(profesor, nuevoProf);
            man.applyChange(new AddAxiom(ontology,classAssertionAx));
            man.saveOntology(ontology);
        }
        catch (OWLOntologyCreationException ex)
        {
            Logger.getLogger(OnologyManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
  public void creaIndividuoAlumno(String arch, Alumno alum) throws OWLOntologyStorageException
    {
        try
        { 
            OWLOntologyManager man = OWLManager.createOWLOntologyManager();
            IRI ontologyIRI = IRI.create("http://www.semanticweb.org/alumno/ontologies/2019/9/Academico");
            
           
            OWLOntology ontology = man.loadOntologyFromOntologyDocument(new File(arch));
            System.out.println(ontology);
            
            OWLDataFactory factory = man.getOWLDataFactory();
            OWLClass profesor = factory.getOWLClass(IRI.create(ontologyIRI + "#Alumno"));
            OWLIndividual nuevoAlum = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#" + alum.getMatricula()));
            
            OWLDataProperty tieneMatricula = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneMatricula"));
            OWLAxiom axiomMatricula = factory.getOWLDataPropertyAssertionAxiom(tieneMatricula, nuevoAlum, alum.getMatricula());
            man.applyChange(new AddAxiom(ontology, axiomMatricula));
            
            OWLDataProperty tieneNombre = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneNombrePersona"));
            OWLAxiom axiomNombre = factory.getOWLDataPropertyAssertionAxiom(tieneNombre, nuevoAlum, alum.getNombre());
            man.applyChange(new AddAxiom(ontology, axiomNombre));
            
            OWLDataProperty tieneGenero = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneGenero"));
            OWLAxiom axiomGenero = factory.getOWLDataPropertyAssertionAxiom(tieneGenero, nuevoAlum, alum.getGenero());
            man.applyChange(new AddAxiom(ontology, axiomGenero));
            
            OWLDataProperty tieneEdad = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#tieneEdad"));
            OWLAxiom axiomEdad = factory.getOWLDataPropertyAssertionAxiom(tieneEdad, nuevoAlum, alum.getEdad());
            man.applyChange(new AddAxiom(ontology, axiomEdad));
            
            OWLClassAssertionAxiom classAssertionAx = factory.getOWLClassAssertionAxiom(profesor, nuevoAlum);
            man.applyChange(new AddAxiom(ontology,classAssertionAx));
            man.saveOntology(ontology);
        }
        catch (OWLOntologyCreationException ex)
        {
            //Logger.getLogger(OnologyManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
   public void creaIndividuoMateria(String arch, Materia mat) throws OWLOntologyStorageException, OWLOntologyCreationException{
       OWLOntologyManager man = OWLManager.createOWLOntologyManager();
            IRI ontologyIRI = IRI.create("http://www.semanticweb.org/alumno/ontologies/2019/9/Academico");
            
           
            OWLOntology ontology = man.loadOntologyFromOntologyDocument(new File(arch));
            System.out.println(ontology);
            
            OWLDataFactory factory = man.getOWLDataFactory();
            OWLClass profesor = factory.getOWLClass(IRI.create(ontologyIRI + "#Materia"));
            OWLIndividual nuevoMat = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#" + mat.getClave()));
            
       
   }
   
   //Mwtodos para listar profesores alumnos y materias  
    
    
}
