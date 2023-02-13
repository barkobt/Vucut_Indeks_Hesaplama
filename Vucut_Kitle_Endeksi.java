import java.util.Scanner;
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)


 */
public class Vucut_Kitle_Endeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        double boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        int kilo = input.nextInt();
        double endeks = (kilo/(boy*boy));
        System.out.println("Vücut Kitle İndeksiniz:"+endeks);

    }
}
