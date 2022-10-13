// Import library
import java.util.Scanner;

public class Main {
    // Panggil dan buat kelas Mahasiswa
    static Mahasiswa mhs = new Mahasiswa();

    // Jalan kah?
    static boolean isRunning = true;

    public static void main(String[] args) {
        // Kenapa pakai Try? Gatau tanya aja sama Oracle
        // Input 
        try (Scanner input = new Scanner(System.in)) {
            // Selama dia jalan
            while (isRunning) {
                // Main menu
                System.out.println("-- Data Mahasiswa --");
                System.out.println("Command: ");
                System.out.println("[1] Input data Mahasiswa");
                System.out.println("[2] Output data Mahasiswa");
                System.out.println("[3] Keluar");
                System.out.print(">> ");
                int command = input.nextInt();
                
                // Jika inputnya sama dengan dibawah ini
                switch (command) {
                    case 1:
                        // Input data Mahasiswa
                        System.out.print("Masukkan nama: ");
                        String nama = input.next();

                        System.out.print("Masukkan nim: ");
                        int nim = input.nextInt();

                        System.out.println("\n\n\n----------");
                        mhs.tambahData(nama, nim);
                        break;
                
                    case 2:
                        // Output data Mahasiswa
                        int jmlData = mhs.jumlahData() - 1;
                
                        System.out.print("Pilih data [0-" + jmlData + "]: ");
                        int pilih = input.nextInt();

                        System.out.println("\n\n\n----------");
                        System.out.println(mhs.ambilData(pilih));
                        break;
    
                    case 3:
                        // Keluar
                        System.out.println("\n\n\n----------");
                        System.out.println("Keluar...");
                        return;
    
                    default:
                        // Input tidak valid
                        System.out.println("\n\n\n----------");
                        System.out.println("Input invalid");
                        break;
                }
            }
        }
    }
}