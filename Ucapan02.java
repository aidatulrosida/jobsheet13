import java.util.Scanner;
public class Ucapan02 {
    public static String PenerimaUcapan() {
        Scanner sc02 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc02.nextLine();
        sc02.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you"+nama+"\nMay the force be with you.");
    }
}