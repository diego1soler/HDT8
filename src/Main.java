import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Main {

	public static void Main(String[] args) throws FileNotFoundException {
		
		
		
		String archivo = "pacientes.txt";
		String[] pacientesTemp; //
		BufferedReader br = new BufferedReader(new FileReader(archivo));
	    String linea;
	    
	    Paciente Paciente = new Paciente();
	    Vector<Paciente> listaPacientes = new Vector<Paciente>();
	    
        try {
			while ((linea = br.readLine()) != null) {
			    pacientesTemp=linea.split(",");
			    Paciente.setName(pacientesTemp[0]);
			    Paciente.setDescription(pacientesTemp[2]);
			    Paciente.setLevel(pacientesTemp[2]);
			    listaPacientes.add(Paciente);
			}
		} catch (IOException e) {
			System.out.println("error");
		}
        
        
        //Se muestra la lista de pacientes originalmente.
        
        System.out.println("La lista de pacientes que se deben cubrir en el área de emergencias el día de hoy es:\n");
        for(int i=0; i<listaPacientes.size(); i++){
            System.out.println(listaPacientes.get(i));
		}
        
	}
	
}
        