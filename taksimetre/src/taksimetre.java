import java.util.Scanner;

public class taksimetre
{
        public static void main(String[] args)
        {
            int km;
            double perKm=2.20, total , startPrice=10;

            Scanner imp = new Scanner(System.in);
            System.out.println("Gidilecek mesafeyi KM cinsinden giriniz: ");
            km=imp.nextInt();

            total=(km * perKm);
            total+=startPrice;

            total = (total < 20 ) ? 20:total;
            System.out.println("Ödenecek tutar: "+ total);
        }
    }

