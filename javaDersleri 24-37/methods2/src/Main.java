public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        mesaj.substring(0,2);
        String yeniMesaj = sehirVer();
        int toplam = topla(1,5);
        int carpım =carp(5,9);
        System.out.println();
        int toplam2 = topla2(2,5,6,8,7,9,3,9999);
        System.out.println(toplam2);


    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static int carp(int sayi1, int sayi2){
        return sayi1*sayi2;
    }
    public static String sehirVer(){
        return "ankara";
    }
}
