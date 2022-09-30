public class Calculator {
    public static int Plus(int... Sayilar) {
        int Toplam = 0;
        for (int Toplama : Sayilar)
            Toplam = Toplama + Toplam;
        return Toplam;
    }

    public static int Minus(int... Sayilar) {
        int Toplam = 0;
        for (int sayi : Sayilar)
            Toplam = Toplam - sayi;
        return Toplam;
    }

    public static int Multiply(int... Sayilar) {
        int Toplam = 1;
        for (int sayi : Sayilar) {
            Toplam = Toplam * sayi;
        }
        return Toplam;
    }

    public static double Divide(double sayi1, double sayi2) {
        return sayi1 / sayi2;
    }
}
