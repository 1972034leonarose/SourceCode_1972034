/**
 * @author Leona (1972034)
 */

public class Segitiga {
    // meth
    private double alas;
    private double tinggi;

    public Segitiga(){
    }

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getLuasSegitiga(){
        double luas = 0.5*this.alas*this.tinggi;
        return luas;
    }
}
