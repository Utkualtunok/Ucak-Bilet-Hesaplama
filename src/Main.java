import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        int age, distance, tripType;
        double price=0;
        //Kullanıcı veri girişleri
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the distance: (in km)");
        distance= input.nextInt();
        System.out.print("Enter your age:");
        age= input.nextInt();
        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip):");
        tripType= input.nextInt();
        //Bilet fiyatlarının yaşa ve yolculuk tipine göre fiyatlandırılması.
        if (distance>0 && age>0 && (tripType==1 || tripType==2)){
            price= distance * 0.10;
            double discount, tipDiscount;

            if (age<12) {
                discount= price * 0.5;
                price=price-discount;
            }
            else if (age>12 && age<=24) {
                discount= price * 0.1;
                price=price-discount;
            }
            else if (age>=65) {
                discount= price * 0.3;
                price=price-discount;
            }

            if (tripType==2) {
                tipDiscount= price * 0.2;
                price= (price-tipDiscount) * 2;
            }
        }
        else {
            System.out.println("You Entered Incorrect Data!");
        }
        System.out.println("Total Amount is "+price+"TL");
    }
}