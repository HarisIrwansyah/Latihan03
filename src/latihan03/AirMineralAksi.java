package latihan03;
    public class AirMineralAksi {
        public static void main(String[] args) {
             AirMineral am = new AirMineral();
             
             am.setMerk("Vit");
             am.setJenis("Gelas");
             am.setBerat(240);
             am.setHarga(18000);
             
             am.cetakinfo();
             
             System.out.print("Merek Air Minum \t : ");
             System.out.println(am.getMerk());
             System.out.print("Jenis Air Minum \t : ");
             System.out.println(am.getJenis());
             System.out.print("Berat Air Minum \t : ");
             System.out.println(am.getBerat());
             System.out.print("Harganya        \t : ");
             System.out.println(am.getHarga());
             
             
             AirMinumKemasan amk = new AirMinumKemasan();
             amk.setMerk("AURA");
             amk.setJenis("Botol");
             amk.setBerat(4);
             amk.setHarga(28000);
             amk.setJenisAirMinum("Kemasan");
             amk.cetakinfo();
             System.out.println("Jenis \t   : "+amk.getJenisAirMinum());
             amk.throttle();
             
    }
}
