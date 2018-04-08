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
}
