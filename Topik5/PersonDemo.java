/** 
 * @author Leona Rose (1972034)
 */

import java.util.*;

public class PersonDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        FacultyMember facmember = new FacultyMember();

        int choice; 
        do{
            System.out.println("==================================");
            System.out.println("1. Show all data");
            System.out.println("2. Add new lecturer");
            System.out.println("3. Add new student");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.println("This is lecturer");
                facmember.showAll();
            }
            else if(choice == 2){
                System.out.print("Name : ");
                String nameL = scanner.nextLine();

                System.out.print("Nidn : ");
                String nidn = scanner.nextLine();
                System.out.println("Insert success");

                
                facmember.addPerson(new Lecturer(nidn, nameL));
            }
            else if(choice == 3){
                System.out.print("Name : ");
                String nameS = scanner.nextLine();

                System.out.print("NRP : ");
                int nrp = scanner.nextInt();
                scanner.nextLine();

                facmember.addPerson(new Student(nrp, nameS));
                System.out.println("Insert success");
            } 

        }while(choice != 4);
    }
}


