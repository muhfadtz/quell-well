
public class Kucing {
    private String nama;
    private int usia;
    private String warnaBulu;
    private boolean tidur;

    public Kucing(String nama, int usia, String warnaBulu) {
        this.nama = nama;
        this.usia = usia;
        this.warnaBulu = warnaBulu;
        this.tidur = false;
    }

    public void tidur() {
        this.tidur = true;
        System.out.println(nama + " sedang tidur.");
    }

    public void bangun() {
        this.tidur = false;
        System.out.println(nama + " bangun tidur.");
    }

    public void ulangTahun() {
        this.usia++;
        System.out.println("Selamat ulang tahun, " + nama + "! Usiamu sekarang " + usia + " tahun.");
    }

    public void informasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Warna Bulu: " + warnaBulu);
        if (tidur) {
            System.out.println("Sedang tidur.");
        } else {
            System.out.println("Tidak sedang tidur.");
        }
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Momo", 3, "Coklat");
        kucing1.informasi();
        kucing1.tidur();
        kucing1.bangun();
        System.out.println();

        Kucing kucing2 = new Kucing("Kiki", 2, "Putih");
        kucing2.informasi();
        kucing2.tidur();
        kucing2.bangun();
        System.out.println();

        Kucing kucing3 = new Kucing("Tommy", 5, "Hitam");
        kucing3.informasi();
        kucing3.tidur();
        kucing3.bangun();
    }
}
