import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {

        /**
         * 1 den girdiğimiz sayıya kadar olan çift sayıların toplamını yazdıran program
         * ( 2 çözümü var çözümlerden 1 i için tenary kullanabilirsiniz )
         */

        System.out.print("Lütfen bir sayi giriniz : ");
        int total = 0;
        int s1 = new Scanner(System.in).nextInt();
        for (int i = 2; i <= s1; i += 2) {
            total += i;
        }
        System.out.println("Toplam ........ : " + total);

// Tenary
        total = 0;
        for (int i = 1; i <= s1; i++) {
            int even = i % 2 == 0 ? i : 0;
            total += even;
        }
        System.out.println("Toplam ........ : " + total);
    }
}
