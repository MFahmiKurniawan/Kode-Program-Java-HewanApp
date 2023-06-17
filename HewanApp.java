import java.util.ArrayList;

public class HewanApp {
    public static void main(String[] args) {
        ArrayList<Hewan> hewanList = new ArrayList<>();

        Pipit pipit1 = new Pipit("Pipit Sawah", 2);
        Ular ular1 = new Ular("Python", 5);
        Kucing kucing1 = new Kucing("Persia", 1);
        Sapi sapi1 = new Sapi("Simental", 3);

        hewanList.add(pipit1);
        hewanList.add(ular1);
        hewanList.add(kucing1);
        hewanList.add(sapi1);

        System.out.println("=============>Daftar Hewan<=============\n" );

        for (Hewan animal : hewanList) {
            System.out.println("Nama\t\t: " + animal.getNama() + "\nUmur\t\t: " + animal.getUmur() + " tahun");
            System.out.println("Tipe Hewan\t: " + animal.getType());
            System.out.print("Suara Hewan\t: ");
            animal.suaraHewan();
            System.out.println("");
        }

        System.out.println("========================================");
    }
}
