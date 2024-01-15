import java.util.Scanner;

public class recursiveAsal {
    static void isprime(int n) {
        if (n % 2 == 1 || n == 2) {
            System.out.println(n + " sayısı ASALDIR.");
        } else {
            System.out.println(n + " sayısı ASAL değildir");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner data = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = data.nextInt();
        isprime(n);
    }
}
