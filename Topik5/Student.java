/** 
 * @author Leona Rose (1972034)
 */
public class Student extends Person{
    private int studentNumber;

    public Student(){
    }

    public Student(int studentNumber, String name){
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public void writeOutput(){
        System.out.printf("%-20s", "Name: "+ getName());
        System.out.println();
        System.out.printf("%-20s", "Student number: "+ getStudentNumber());
        System.out.println();
    }
}