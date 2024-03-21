import java.util.HashMap;

public class TugasDua {
    public static void main(String[] args) {
        // Membuat objek HashMap untuk menyimpan data siswa (nama sebagai kunci, umur sebagai nilai)
        HashMap<String, Integer> dataSiswa = new HashMap<>();

        // Menambahkan data siswa ke dalam HashMap
        dataSiswa.put("Alice", 20);
        dataSiswa.put("Bob", 22);
        dataSiswa.put("Charlie", 21);

        // Menghitung jumlah data siswa dalam HashMap
        int jumlahSiswa = dataSiswa.size();
        System.out.println("Jumlah data siswa dalam HashMap: " + jumlahSiswa);

        // Mengakses umur siswa berdasarkan nama
        int umurBob = dataSiswa.get("Bob");
        System.out.println("Umur Bob: " + umurBob);

        // Memeriksa apakah data siswa dengan nama tertentu ada dalam HashMap
        boolean adaAlice = dataSiswa.containsKey("Alice");
        System.out.println("Apakah Alice ada dalam data siswa? " + adaAlice);

        // Menghapus data siswa dari HashMap
        dataSiswa.remove("Charlie");
        System.out.println("Setelah menghapus, jumlah data siswa dalam HashMap: " + dataSiswa.size());
    }
}
