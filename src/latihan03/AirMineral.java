package latihan03;

public class AirMineral {
    private String merk;
    private String jenis;
    private double berat;
    private double harga;
    
    void cetakinfo(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Merek Air Mineral \t : "+merk+"\n"+
                "Jenis Air Mineral \t : "+jenis+"\n"+"Berat Kemasan \t         : "
                +berat+" gram"+"\n"+"Harga/Dus \t         : "+harga);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
