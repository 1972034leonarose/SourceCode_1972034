// Nama: Leona Rose
// NRP: 1972034
// Soal 5
public class NumberConvertor { 
    public String convertToBinary(int number){
        String biner = Integer.toBinaryString(number);
        return biner;
    }
    public String convertToOctal(int number){
        String octal = Integer.toOctalString(number);
        return octal;
    }
    public String convertToHex(int number){
        String hexa = Integer.toHexString(number);
        return hexa;
    }
}
