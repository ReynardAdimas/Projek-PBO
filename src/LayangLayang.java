public class LayangLayang implements BangunGeometri{
    private double diagonalPanjang;
    private double diagonalPendek;
    private double sisiPanjang;
    private double sisiPendek;

    public LayangLayang(double diagonalPanjang, double diagonalPendek, double sisiPanjang, double sisiPendek) {
        this.diagonalPanjang = diagonalPanjang;
        this.diagonalPendek = diagonalPendek;
        this.sisiPanjang = sisiPanjang;
        this.sisiPendek = sisiPendek;
    }

    // getter
    public double getDiagonalPanjang() {
        return diagonalPanjang;
    }
    public double getDiagonalPendek() {
        return diagonalPendek;
    }
    public double getSisiPanjang() {
        return sisiPanjang;
    }
    public double getSisiPendek() {
        return sisiPendek;
    }

    // setter
    public void setDiagonalPanjang(double diagonalPanjang) {
        this.diagonalPanjang = diagonalPanjang;
    }
    public void setDiagonalPendek(double diagonalPendek) {
        this.diagonalPendek = diagonalPendek;
    }
    public void setSisiPanjang(double sisiPanjang) {
        this.sisiPanjang = sisiPanjang;
    }
    public void setSisiPendek(double sisiPendek) {
        this.sisiPendek = sisiPendek;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonalPanjang * diagonalPendek;
    }

    @Override
    public double hitungKeliling() {
        return 2*(sisiPanjang+sisiPendek);
    }
}
