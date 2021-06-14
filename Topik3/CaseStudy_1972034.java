import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author Leona Rose (1972034)
 */

public class CaseStudy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("## Proses Input angka ##");
        for (int i=0; i<arr.length; i++){
            System.out.print("Input array ke-" + (i+1) + ": ");
            int number = scanner.nextInt();
            arr[i] = number;
            scanner.nextLine();
        }

        System.out.println("## Angka Hasil Input ##");
        for (int val : arr){
            System.out.println(val);
        }

        System.out.println("## Array setelah diurutkan ##");
        Arrays.sort(arr);
        for (int val : arr){
            System.out.println(val);
        }
    }
}
