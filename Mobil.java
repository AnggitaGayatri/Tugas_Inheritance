package ProgramInheritance;

// sub class
public class Mobil extends Kendaraan{
    // variabel
    int pintu;
    int tempatduduk;
    String tipe;

        // constructor
    Mobil(String inputNama, String inputBB, int inputRoda,int inputPintu,  int inputTempat, String inputTipe){
        super(inputNama, inputBB, inputRoda);
        this.pintu = inputPintu;
        this.tempatduduk = inputTempat;
        this.tipe = inputTipe;
    }
    //
    @Override
    void display(){
        System.out.println("\n--------------------------------------");
        System.out.println("\t MOBIL");
        super.display();
        System.out.println("Jumlah Pintu: " + this.pintu);
        System.out.println("Jumlah tempat duduk: "+ this.tempatduduk);
        System.out.println("Tipe mobil: " + this.tipe);
        System.out.println("\n--------------------------------------");
    }
}
