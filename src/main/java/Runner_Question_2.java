import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {

        System.out.print("Lütfen bir sayi giriniz : ");
        int total = 0;
        int s1 = new Scanner(System.in).nextInt();
        for (int i = 2; i <= s1; i+=2) {
            total += i;
        }
        System.out.println("Toplam ........ : " + total);
    }
}
