import java.util.Scanner;

public class Runner_Question_4 {
    public static void main(String[] args) {
        System.out.print("Lütfen bir sayi giriniz : ");
        int total = 0;
        int counter = 1;
        int s1 = new Scanner(System.in).nextInt();
        for (int i = 1; i <= s1; i++) {
            total += i;
            if (total <= 50) {
                counter++;
            } else {
                System.out.println("Çalışma Sayisi .......... : " + counter + "\n"
                        + "Toplam .................. : " + total);
                break;
            }
        }
        System.out.println("Toplam ........... " + total);
    }
}
