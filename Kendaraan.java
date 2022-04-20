package ProgramInheritance;

// sub class
public class Kendaraan {
    String nama;
    String bahan_bakar;
    int roda;

    // constructor
    Kendaraan(String inputNama, String inputBahanBakar, int inputRoda){
        this.nama = inputNama;
        this.bahan_bakar = inputBahanBakar;
        this.roda = inputRoda;
    }

    // method
    void display(){
        System.out.println("Nama: "+ this.nama);
        System.out.println("Bahan bakar: " + this.bahan_bakar);
        System.out.println("roda: " + this.roda);
    }
}
