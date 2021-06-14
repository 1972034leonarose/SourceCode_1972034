/** 
 * @author Leona Rose (1972034)
 */

import java.util.ArrayList;

public class FacultyMember {
    private ArrayList<Person> persons;

    public FacultyMember(){
        persons = new ArrayList<>();
    }

    public void showAll(){
        persons.forEach(Person::writeOutput);
    }

    public boolean addPerson(Person person){
        return persons.add(person);
    }

    public void showAllLecturer(){
        persons.forEach(person -> {
            if(person instanceof Lecturer){
                System.out.println(((Lecturer) person).getName());
                System.out.println(((Lecturer) person).getNidn());
            }
        });
    }

}
