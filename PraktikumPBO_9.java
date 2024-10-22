package praktikum9;

// Definisi kelas abstrak
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

//  Kelas turunan dari kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}

class Motor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Motor sedang berjalan dengan santai.");
    }
}
// Kode untuk menguji
public class PraktikumPBO_9 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan motor = new Motor();

        mobil.berjalan();
        mobil.info();

        sepeda.berjalan();
        sepeda.info();
        
        motor.berjalan();
        motor.info();
    }
}