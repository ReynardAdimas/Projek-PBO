import java.lang.Math;

public class Segitiga implements BangunGeometri{
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    // getter
    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getSisiA(){
        return sisiA;
    }
    public double getSisiB(){
        return sisiB;
    }
    public double getSisiC(){
        return sisiC;
    }

    // setter
    public  void setAlas(double alas){
        this.alas = alas;
    }
    public  void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public  void setSisiA(double sisiA){
        this.sisiA = sisiA;
    }
    public  void setSisiB(double sisiB){
        this.sisiB = sisiB;
    }
    public  void setSisiC(double sisiC){
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas() {
        double s = (sisiA+sisiB+sisiC)/2;
        return Math.sqrt(s*(s-sisiA)*(s-sisiB)*(s-sisiC));
    }

    @Override
    public double hitungKeliling() {
        return sisiA+sisiB+sisiC;
    }
}
