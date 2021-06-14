/**
 * @author Leona Rose (1972034)
 */

 import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        //Shape s = new Shape();

        System.out.println("=================================");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Exit");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        do{
            if(choice == 1){
                System.out.print("Length: ");
                double pjg = scanner.nextDouble();
                r.setLength(pjg);
                scanner.nextLine();

                System.out.print("Width: ");
                double lbr = scanner.nextDouble();
                r.setWidth(lbr);
                scanner.nextLine();

                System.out.print("Area: ");
                System.out.println(r.getArea());
            }
            else if(choice == 2){
                System.out.print("Radius: ");
                double rad = scanner.nextDouble();
                c.setRadius(rad);
                scanner.nextLine();

                System.out.print("Area: ");
                System.out.println(c.getArea()); 
            }
            System.out.println("=================================");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Exit");
    
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }while(choice != 3);
    }
}
