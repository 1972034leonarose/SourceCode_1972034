/**
 * @author Leona Rose (1972034)
 */

import java.util.Scanner;
public class SegitigaDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("1. Input tinggi segitiga");
        System.out.println("2. Input alas segitiga"); 
        // System.out.println("3. Lihat tinggi segitiga");
        // System.out.println("4. Lihat alas segitiga");
        System.out.println("3. Hitung luas segitiga");
        System.out.println("0. Exit");

        Segitiga tri = new Segitiga();

        System.out.print("Pilihan: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        do{
            if(pilih == 1){
                System.out.print("Input tinggi segitiga: ");
                int t = scanner.nextInt();
                scanner.nextLine();
                tri.setTinggi(t);
            }
            else if(pilih == 2){
                System.out.print("Input alas segitiga: ");
                int a = scanner.nextInt();
                scanner.nextLine();
                tri.setAlas(a);
            }
            // else if(pilih == 3){
            //     double t = tri.getTinggi();
            //     System.out.print("Tinggi segitiga: " + t);
            //     System.out.println("");
            // }
            // else if(pilih == 4){
            //     double a = tri.getAlas();
            //     System.out.print("Alas segitiga: " + a);
            //     System.out.println("");    
            // }
            else if(pilih == 3){
                double luas = tri.getLuasSegitiga();
                System.out.print("Luas segitiga: " + luas);
                System.out.println("");
            }
            System.out.println("==================================");
            System.out.println("1. Ubah tinggi segitiga");
            System.out.println("2. Ubah alas segitiga");
            // System.out.println("3. Lihat tinggi segitiga");
            // System.out.println("4. Lihat alas segitiga");
            System.out.println("3. Hitung luas segitiga");
            System.out.println("0. Exit");

            System.out.print("Pilihan: ");
            pilih = scanner.nextInt();
            scanner.nextLine();
        }
        while(pilih != 0);
    }
}
