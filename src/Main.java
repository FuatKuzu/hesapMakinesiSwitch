import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, islem;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz");
        num2 = input.nextInt();

        System.out.println("Toplama için 1'e basınız\n Çıkarma için 2'ye basınız.\n" +
                " Çarpma için 3'e basınız.\n Bölme için 4'e basınız.");
        islem = input.nextInt();
        switch (islem) {

            case 1:
                System.out.print("Toplama sonucu= " + (num1 + num2));
                break;
            case 2:
                System.out.print("Çıkarma sonucu= " + (num1 - num2));
                break;
            case 3:
                System.out.print("Çarpma sonucu= " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.print("Sıfıra bölünemez");
                } else {
                    System.out.print("Bölme sonucu= " + (num1 / num2));
                }
                break;
        }
    }
}