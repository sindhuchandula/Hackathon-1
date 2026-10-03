import java.util.Scanner;
public class Household{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter family members: ");
        int members = sc.nextInt();
        System.out.print("Enter house number: ");
        int houseNo = sc.nextInt();
        double waterUsed = members * 100.0;
        char status = 'M';

        System.out.println("--- Water Usage Details ---");
        System.out.println("House Number: " + houseNo);
        System.out.println("Family Members: " + members);
        System.out.println("Estimated Water Used: " + waterUsed + " litres");
        System.out.println("Water Usage Status: " + status);
    }
}