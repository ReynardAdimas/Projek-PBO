public class Persegi implements BangunGeometri{
    protected double sisi;

    public Persegi(double sisi) {
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
