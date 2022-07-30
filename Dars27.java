import java.util.Scanner;

public class Dars27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ismingiz ");
        String str = scanner.nextLine();
        System.out.print(" Birinchi blok: ");
        double ball1 = scanner.nextDouble();
        System.out.print(" Ikkinchi blok: ");
        double ball2 = scanner.nextDouble();
        System.out.print(" Uchinchi blok: ");
        double ball3 = scanner.nextDouble();
        double res = (ball1*3.3)+(ball2*3.2)+(ball3*3.1);
        if (res>=150){
            System.out.println(str);
            System.out.println("Siz o'qishga qabul qilindingiz bujet asosida "+res);
        }else if (110>=res){
            System.out.println(str);
            System.out.println("Siz o'qishga qabul qilindingiz shartnoma asosida "+res);
        }else {
            System.out.println(str);
            System.out.println("Omadingiz kelmadi keyingi yilga harakat qilib ko'ring "+res);
        }
    }
}
