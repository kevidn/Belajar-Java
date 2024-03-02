import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Judul.
        System.out.println("----- Program Sederhana Menghitung Luas & Volume -----");

        // Membuat objek angka dan kata.
        Scanner angka = new Scanner(System.in);
        Scanner kata = new Scanner(System.in);
        
        // Mendeklarasikan variabel.
        int a, b, c, e, f;
        String d;

        // Meminta dan menerima input angka dari user untuk panjangnya.
        System.out.print("Masukkan panjang : ");
        a = angka.nextInt();

        // Meminta dan menerima input angka dari user untuk lebarnya
        System.out.print("Masukkan lebar : ");
        b = angka.nextInt();

        // Melakukan operasi untuk menghitung luas.
        c = a * b;

        // Mengeluarkan output berupa hasil operasi menghitung luas.
        System.out.println("Luas : " + c);

        // Meminta input, apakah user ingin mencari volume.
        System.out.println("Apakah anda ingin mencari volume?");
        System.out.print("Jawab 'Ya', jika iya. : ");
        d = kata.nextLine();

        // Conditional statement, jika user mencari volume dengan memasukkan kata "Ya" maka akan dilakukan operasi menghitung volumenya.
        if(d.equals("Ya")){

            // Meminta dan menerima input angka dari user untuk tingginya.
            System.out.print("Masukkan tinggi : ");
            e = angka.nextInt();

            // Melakukan operasi untuk menghitung volume
            f = e * c;

            // Mengelurkan output berupa hasil operasi menghitung volume.
            System.out.println("Volume : " + f);
        }
    }
}
