import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


/** 
* Clase: Main.java
* @author Diego Soler, Dieter de Wit
* @version 01/10/16
*/

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//Se prepara para leer del archivo de texto
		String archivo = "pacientes.txt";
		String[] pacientesTemp; //
		BufferedReader br = new BufferedReader(new FileReader(archivo));
	    String linea;
	    
	   //Se crea un vector de Pacientes que se ingresan a la sala de Emergencias
	    Vector<Paciente> listaPacientes = new Vector<Paciente>();
	 	    
	    
        try {
			while ((linea = br.readLine()) != null) {
			    pacientesTemp=linea.split(","); //Se dividen los atributos de cada paciente, y se agrega el paciente al Vector
			    listaPacientes.add(new Paciente(pacientesTemp[0], pacientesTemp[1], pacientesTemp[2]));
			    
			}
			
		} catch (IOException e) {
			System.out.println("error");
		}
        
        
        //Se muestra la lista de pacientes originalmente.
        
        System.out.println("La lista de pacientes que se deben cubrir en el área de emergencias el día de hoy es:\n");
        for(int i=0; i<listaPacientes.size(); i++){
            System.out.println(listaPacientes.get(i));
		}
        

        //Se muestra la lista de pacientes ordenados por prioridad
		System.out.println("\nLa lista de pacientes se ha ordenado, por prioridad de atención, de la siguiente manera:\n");
		
		VectorHeap<Paciente> vector = new VectorHeap<Paciente>(listaPacientes); //Creacion del VectorHeap
		int contador = vector.size();
		
		for(int i=0; i<contador; i++){
			Paciente pacienteTemp = vector.remove(); //Se remueve cada paciente por orden de prioridad, para mostrarlo en la lista de atencion
			System.out.println(pacienteTemp.toString()); //Se imprime la lista de prioridad
		}
		
		
		
		
		
		
		
        
	}
	
}
        