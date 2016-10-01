/** 
* Clase: Paciente.java
* @author Diego Soler, Dieter de Wit
* @version 01/10/16
*/

public class Paciente {
    
	//Atributos
    private String name;
    private String description;
    private String level;
    
    public Paciente(){
        
        name = "";
        description = "";
        level = "E";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param nivel the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
    
    
    
}