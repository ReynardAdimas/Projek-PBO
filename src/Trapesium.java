public class Trapesium implements BangunGeometri{
    protected double sisiAtas;
    protected double sisiBawah;
    protected double tinggi;
    protected double sisiMiringKiri;
    protected double sisiMiringKanan;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiMiringKiri, double sisiMiringKanan){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiMiringKiri = sisiMiringKiri;
        this.sisiMiringKanan = sisiMiringKanan;
    }

    @Override
    public double hitungLuas(){
        return 0.5*(sisiAtas+sisiBawah)*tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiAtas+sisiBawah+sisiMiringKiri+sisiMiringKanan;
    }
}
