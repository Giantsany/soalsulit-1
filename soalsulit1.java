import java.util.Scanner;
public class soalsulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa anda : ");
        int jumlahsiswa = input.nextInt();
        double total = 0;
        for(int a=1; a<=jumlahsiswa; a++){
            System.out.println("Nilai siswa ke-"+a+" adalah");
            double nilai = input.nextDouble();
            total = total + nilai;
        }
        double ratarata =  total / jumlahsiswa;
        System.out.println("Rata-rata nilai = " + ratarata);
    }
}
