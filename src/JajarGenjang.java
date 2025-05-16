public class JajarGenjang implements BangunGeometri{
    private double sisiMiring;
    private double alas;
    private double tinggi;

    public JajarGenjang(double sisiMiring, double alas, double tinggi) {
        this.sisiMiring = sisiMiring;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // getter
    public double getSisiMiring() {
        return sisiMiring;
    }
    public double getAlas() {
        return alas;
    }
    public double getTinggi() {
        return tinggi;
    }

    // setter
    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return alas*tinggi;
    }

    @Override
    public double hitungKeliling(){
        return 2*(sisiMiring+alas);
    }
}
