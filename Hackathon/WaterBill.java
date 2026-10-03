import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double water = sc.nextDouble();

        double bill;

        if (water <= 500)
            bill = 100;
        else
            bill = 200;

        System.out.println("Water Bill: Rs." + bill);
    }
}