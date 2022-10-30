import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("İstediğiniz basamak sayısını giriniz : ");
        sayi = input.nextInt();

        for (int i = sayi - 1; i>0; i--){
            for (int a = 1; a<= (sayi-i)-1; a++){
                    System.out.print(" ");
            }
            for (int b=1; b <= (2*i)-1; b++){
                System.out.print("B");
            }

            System.out.println();
        }
    }
}