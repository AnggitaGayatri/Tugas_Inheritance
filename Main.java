package ProgramInheritance;

// program untuk memanggil
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 =
                new Kendaraan("motor vario", "Pertalite", 2);
        kendaraan1.display();
        Mobil mobil1 =
                new Mobil("Ayla", "Pertamax", 4, 4, 5, "matic");
        mobil1.display();
        Mobil mobil3 =
                new Mobil("Avansa", "pertamax", 4, 4, 8, "matic");
        mobil3.display();
        Kendaraan kendaraan2 =
                new Kendaraan("Bus", "BBG", 6);
        kendaraan2.display();
        Mobil mobil4 =
                new Mobil("Fortuner", " Pertamax", 4, 4, 8, "matic");
        mobil4.display();
    }
}
