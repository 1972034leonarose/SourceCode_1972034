// Nama: Leona Rose
// NRP: 1972034
// Soal 5
import java.util.Scanner;
public class NumberConvertorDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        NumberConvertor convert = new NumberConvertor();
        
        System.out.println("===============================");
        System.out.println("Number Converter");
        System.out.println("===============================");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hex");
        System.out.println("4. Exit");
        
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        while(choice != 4){
            System.out.print("Number to convert: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                String hasil = convert.convertToBinary(number);
                System.out.printf("Converted number is "+ hasil);
                System.out.println("");
            } 
            else if(choice == 2){
                String hasil = convert.convertToOctal(number);
                System.out.printf("Converted number is "+ hasil);
                System.out.println("");
            }
            else if(choice == 3){
                String hasil = convert.convertToHex(number);
                System.out.printf("Converted number is "+ hasil);
                System.out.println("");
            }
            System.out.println("===============================");
            System.out.println("Number Converter");
            System.out.println("===============================");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Hex");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}