/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.File;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
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

/**
 *
 * @author Alumno
 */
@WebService(serviceName = "ServiciosOntologiaAcademico")
public class ServiciosOntologiaAcademico {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "creaIndividuoProfesor")
    public void creaIndividuoProfesor(@WebParam(name = "arch") String arch, @WebParam(name = "prof") Profesor prof) throws OWLOntologyStorageException {
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
            //Logger.getLogger(OnologyManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "creaIndividuoAlumno")
    public void creaIndividuoAlumno(@WebParam(name = "arch") String arch, @WebParam(name = "alu") Alumno alum)throws OWLOntologyStorageException {
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "creaIndividuoMateria")
    public void creaIndividuoMateria(@WebParam(name = "arch") String arch, @WebParam(name = "mat") Materia mat) throws OWLOntologyStorageException{
        try{
            OWLOntologyManager man = OWLManager.createOWLOntologyManager();
            IRI ontologyIRI = IRI.create("http://www.semanticweb.org/alumno/ontologies/2019/9/Academico");
            
           
            OWLOntology ontology = man.loadOntologyFromOntologyDocument(new File(arch));
            System.out.println(ontology);
            
            OWLDataFactory factory = man.getOWLDataFactory();
            OWLClass materia = factory.getOWLClass(IRI.create(ontologyIRI + "#Materia"));
            OWLIndividual nuevoMat = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#" + mat.getClave()));
        }
        catch (OWLOntologyCreationException ex)
        {
            //Logger.getLogger(OnologyManagement.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
}
