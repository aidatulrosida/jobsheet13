import java.util.Scanner;
public class FungsiNilai02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jum_mahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jum_tugas = scanner.nextInt();

        int[][] nilaiMahasiswa = new int[jum_mahasiswa][jum_tugas];
        String[] namaMahasiswa = new String[jum_mahasiswa];

        // Input data mahasiswa dan nilai
        for (int i = 0; i < jum_mahasiswa; i++) {
            scanner.nextLine(); // Membersihkan buffer
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            for (int j = 0; j < jum_tugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan nilai mahasiswa
        System.out.println("\n================================================================================================");
        System.out.println("|                                      Data Nilai Mahasiswa                                    |");
        System.out.println("================================================================================================");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < jum_tugas; j++) {
            System.out.printf(" Tugas %d |", j + 1);
        }
        System.out.println("\n================================================================================================");

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < jum_tugas; j++) {
                System.out.printf(" %-7d |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("================================================================================================");

        scanner.close();
    }
}