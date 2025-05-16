package Bangun2D;

import java.lang.Math;

public class Lingkaran implements BangunGeometri {
    private double r;

    public Lingkaran(double r){
        this.r = r;
    }

    // getter
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }

    @Override
    public double hitungLuas(){
        return Math.PI*r*r;
    }

    @Override
    public double hitungKeliling(){
        return 2*Math.PI*r;
    }

}
