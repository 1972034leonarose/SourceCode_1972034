/** 
 * @author Leona Rose (1972034)
 */

public class Lecturer extends Person{
    private String nidn;

    public Lecturer(){
    }

    public Lecturer(String nidn, String name){
        super(name);
        this.nidn = nidn;
    }

    public String getNidn(){
        return this.nidn;
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    
    public void writeOutput(){
        System.out.printf("%-20s", "Name: "+ getName());
        System.out.println();
        System.out.printf("%-20s", "Nidn: "+ getNidn());
        System.out.println();
    }
}