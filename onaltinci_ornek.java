package JAVA101;
import java.util.Scanner;
public class onaltinci_ornek {
    public static void main(String[] args) {
        int yil ;
        Scanner input = new Scanner(System.in);

        System.out.println("yılı giriniz: ");
        yil = input.nextInt();

        if (yil>=2000){
            if (yil%4==0){
                System.out.println("bu bir artık yıl");
            }else{
                System.out.println("bu bir artık yıl değil");
            }
        } else if (yil<2000) {
            if (yil%400==0){
                System.out.println("bu bir artık yıl");
            }else {
                System.out.println("bu bir artık yıl değil");
            }
            
        }

    }
}
