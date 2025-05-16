package Bangun2D;

public class Persegi implements BangunGeometri {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }


    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }

    @Override
    public double hitungKeliling() {
        return 2*(sisi+sisi);
    }
}
