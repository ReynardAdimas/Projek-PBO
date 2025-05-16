package Bangun3D;

import Bangun2D.Segitiga;

public class LimasSegitiga extends Segitiga {
    private double tinggiLimas;
    private double tinggiA;
    private double tinggiB;
    private double tinggiC;

    public LimasSegitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC, double tinggiLimas, double tinggiA, double tinggiB, double tinggiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
        this.tinggiA = tinggiA;
        this.tinggiB = tinggiB;
        this.tinggiC = tinggiC;
    }

    // getter
    public double getTinggiLimas() {
        return tinggiLimas;
    }
    public double getTinggiA() {
        return tinggiA;
    }
    public double getTinggiB() {
        return tinggiB;
    }
    public double getTinggiC() {
        return tinggiC;
    }

    // setter
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
    public void setTinggiA(double tinggiA) {
        this.tinggiA = tinggiA;
    }
    public void setTinggiB(double tinggiB) {
        this.tinggiB = tinggiB;
    }
    public void setTinggiC(double tinggiC) {
        this.tinggiC = tinggiC;
    }

    public double hitungVolume() {
        return (1.0/3.0) * hitungLuas() * tinggiLimas;
    }
    public double hitungLuasPermukaan(){
        double luasAlas = hitungLuas();
        double luasSisiTegakA = 0.5 * getSisiA() * tinggiA;
        double luasSisiTegakB = 0.5 * getSisiB() * tinggiB;
        double luasSisiTegakC = 0.5 * getSisiC() * tinggiC;

        return luasAlas + luasSisiTegakA + luasSisiTegakB + luasSisiTegakC;

    }
}
