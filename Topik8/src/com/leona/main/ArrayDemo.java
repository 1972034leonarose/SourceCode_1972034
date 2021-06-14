/**
 * @author Leona Rose (1972034)
 */

package com.leona.main;
import com.leona.data.ArrayOfNumber;
import com.leona.exceptions.ArrayException;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOfNumber arrOfNum = new ArrayOfNumber();

        int choice;
        do {
            System.out.println("==================================");
            System.out.println("1. Make array");
            System.out.println("2. Add length to array");
            System.out.println("3. Insert new data to array");
            System.out.println("4. Show array");
            System.out.println("5. Exit");
            System.out.print("Choice : ");

            choice = scanner.nextInt();

            if(choice == 1){
                try {
                    arrOfNum.constructArray();
                }
                catch(ArrayException e){
                    System.out.println(e.getMessage());
                }
            }
            else if(choice == 2){
                arrOfNum.increaseArrayIndex();
            }
            else if(choice == 3){
                try{
                    System.out.print("Index = ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Number = ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    arrOfNum.addValueToArray(index, value);
                }
                catch(InputMismatchException e){
                    System.out.println("Input harus bilangan");
                    scanner.nextLine();
                }
            }
            else if(choice == 4) {
                arrOfNum.showArray();
            }
        }while(choice != 5);
    }
}
