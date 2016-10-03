/** 
* Clase: VectorHeapTest.java
* @author Diego Soler, Dieter de Wit
* @version 02/10/16
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorHeapTest 
{

	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	
	
 	/**
     * Test add method, class VectorHeap.
     * Prueba de Failure con FailureTest JUnit
     */
	 @Test
	    public void testAdd() 
	 {
	        System.out.println("add");
	        Paciente persona = new Paciente ("Juan Perez", "fractura de pierna", "C");
	        VectorHeap<Paciente> instancia = new VectorHeap<Paciente>();
	        instancia.add(persona);
	        Paciente expResult = instancia.get(persona);
	        assertEquals(expResult, persona);
	        // TODO review the generated test code and remove the default call to fail.
	    }

	 	/**
	     * Test add method, class VectorHeap.
	     * Prueba Success con Trace JUnit
	     */
	    @Test
	    public void testGet() 
	    {
	        System.out.println("get");
	        Paciente persona = new Paciente ("Juan Perez", "fractura de pierna", "C");
	        VectorHeap<Paciente> instancia = new VectorHeap<Paciente>();
	        instancia.add(persona);
	        Paciente expResult = instancia.get(persona);
	        assertEquals(expResult, persona);
	        // TODO review the generated test code and remove the default call to fail.
	    }
}
