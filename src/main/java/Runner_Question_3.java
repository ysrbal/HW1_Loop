import java.util.Scanner;

public class Runner_Question_3 {
    public static void main(String[] args) {
        /**
         * dışarıdan girilen bir sayının faktoriyelini hesaplayalım
         */
        System.out.print("Lütfen bir sayi giriniz : ");
        int faktoriyel = 1;
        int s1 = new Scanner(System.in).nextInt();
        for (int i = s1; i >= 1; i--) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel Sonuç ........ : " + faktoriyel);
    }
}
