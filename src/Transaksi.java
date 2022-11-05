import java.util.Scanner;
public class Transaksi extends BahanPokok{
    int jumlah;
    int harga;

    @Override
    public int Hitung(int total){
        return total;
    }
    @Override
    public int Jenis_BahanPokok(){
        int pil;
        int lama = 0;
        int a = 0;
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" 1. Beras");
        System.out.println(" 2. Minyak Goreng");
        System.out.println(" 3. Gula Pasir");
        System.out.println("Masukkan pilihan anda : ");
        pil=in.nextInt();
        switch (pil){
            case 1:
                a = 11000;
                System.out.println("Beras");
                System.out.println("Masukkan jumlah pembelian : ");
                lama = in.nextInt();
                setJumlah(lama);
                setHarga(a);
                total = a*lama;
                break;
            case 2:
                a = 14000;
                System.out.println("Minyak Goreng");
                System.out.println("Masukkan jumlah pembelian : ");
                lama = in.nextInt();
                setJumlah(lama);
                setHarga(a);
                total = a*lama;
                break;
            case 3:
                a = 14000;
                System.out.println("Gula Pasir");
                System.out.println("Masukkan jumlah pembelian : ");
                lama = in.nextInt();
                setJumlah(lama);
                setHarga(a);
                total = a*lama;
                break;
        }
        return total;
    }
    public void bayar(){
        System.out.println("");
    }

    public int getJumlah() {
        return jumlah;
    }

    public int setJumlah(int jumlah) {
        this.jumlah = jumlah;
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int setHarga(int harga) {
        this.harga = harga;
        return harga;
    }
}