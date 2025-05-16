public class PersegiPanjang implements BangunGeometri{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }

    // setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }

    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
}
