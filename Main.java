import java.util.Scanner;
//3 kenar uzunlugu kullanicdan alinarak ucgen alani hesaplayan program

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double alan;
        double yariCevre;

        Scanner input= new Scanner(System.in);

        System.out.print("Ucgenin ilk kenar uzunlugunu giriniz : " );
        a = input.nextInt();
        System.out.print("Ucgenin ikinci kenar uzunlugunu giriniz : " );
        b = input.nextInt();
        System.out.print("Ucgenin ucuncu kenar uzunlugunu giriniz : " );
        c = input.nextInt();
        yariCevre = (a+b+c)/2.0;
        alan = Math.sqrt(yariCevre*(yariCevre-a)*(yariCevre-b)*(yariCevre-c));
        System.out.println("Ucgenin alani : " + alan);
gir
    }
}
