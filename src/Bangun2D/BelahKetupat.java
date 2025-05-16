package Bangun2D;

public class BelahKetupat implements BangunGeometri {
    private double diagonal;
    private double sisi;

    public BelahKetupat(double diagonal, double sisi) {
        this.diagonal = diagonal;
        this.sisi = sisi;
    }

    // getter
    public double getDiagonal() {
        return diagonal;
    }
    public double getSisi() {
        return sisi;
    }

    // setter
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return 0.5 * diagonal * diagonal;
    }
    public  double hitungKeliling(){
        return 4*sisi;
    }
}
