/**
 * @author Leona Rose (1972034)
 */

package com.leona.data;
import com.leona.exceptions.ArrayException;
import java.util.Arrays;

public class ArrayOfNumber{
    private int[] numbers;

    public void constructArray() throws ArrayException {
        if(numbers != null){
            throw new ArrayException("Array sudah dibuat");
        }
        System.out.println("Creating new array");
        numbers = new int[0];
    }

    public void increaseArrayIndex(){
        try {
            numbers = Arrays.copyOf(numbers, numbers.length+1);
            numbers[numbers.length-1] = 0;
            System.out.println("Array berhasil ditambah");
        }
        catch(NullPointerException e){
            System.out.println("Array belum dibuat");
        }
    }

    public void addValueToArray(int index, int value){
        try{
            numbers[index] = value;
        }
        catch(NullPointerException e){
            System.out.println("Array belum dibuat");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index yang dimasukkan tidak ada pada array");
        }
    }

    public void showArray(){
        try{
            for(int i = 0; i<numbers.length; i++){
                if(i == 0){
                    System.out.print("Isian array : [");
                }

                if(i != numbers.length-1){
                    System.out.print(numbers[i]+", ");
                }
                else{
                    System.out.print(numbers[i]+"]");
                }
            }
            System.out.println();
        }
        catch(NullPointerException e){
            System.out.println("Array belum dibuat");
        }
    }
}
