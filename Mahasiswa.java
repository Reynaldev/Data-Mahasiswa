import java.util.ArrayList;

public class Mahasiswa {
    // Buat arraylist nama
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<Integer> nim = new ArrayList<Integer>();

    // Fungsi tambah data
    public void tambahData(String _nama, int _nim) {
        nama.add(_nama);
        nim.add(_nim);
    }

    // Fungsi untuk mereturn data berdasarkan index arraylist
    public String ambilData(int _index) {
        String output = "Nama: " + nama.get(_index) + "\nNIM: " + nim.get(_index).toString();

        return output;
    }

    public int jumlahData() {
        return nim.size();
    }
}
