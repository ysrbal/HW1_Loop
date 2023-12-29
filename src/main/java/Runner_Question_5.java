import java.util.Scanner;

public class Runner_Question_5 {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;
        System.out.print("Lütfen bir sayi giriniz : ");
        int s1 = new Scanner(System.in).nextInt();
        do {
            int kalan = s1 % 10;
            total += kalan;
            s1 /=10;
            counter++;
        } while (s1 != 0);
        System.out.println("Basamak Toplami .......... : " + total + "\n"
                + "Basamak Sayisi .......... :" + counter);
    }
}
