import java.util.Scanner;

public class Runner_Question_1 {
    public static void main(String[] args) {
        /**
         * 1 den girdiğimiz sayıya kadar olan sayıların toplamını yazdıran program
         */
        int total = 0;
        System.out.print("Lütfen bir sayi giriniz : ");
        int s1 = new Scanner(System.in).nextInt();
        for (int i = 1; i <= s1; i++) {
            total += i;
        }
        System.out.println("Toplam ........ : " + total);
    }
}
