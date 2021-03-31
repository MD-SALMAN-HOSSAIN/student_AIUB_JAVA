import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the Operator\n");
        
        System.out.print("Enter the Name: ");
        String name = input.nextLine();

        System.out.print("Enter the Country Code: ");
        String countryCode = input.nextLine();

        System.out.print("Enter the Blood Group: ");
        String bloodGrp = input.nextLine();

        System.out.print("Enter the Email: ");
        String email = input.nextLine();

        System.out.print("Enter the Phone Number: ");
        String phnNumber = input.nextLine();

        System.out.print("Enter the Address: ");
        String address = input.nextLine();

        System.out.println("\n=======================================\n");

        Contact ConCall = new Contact();
        Contact person = new Contact(phnNumber, address);

        person.setter(name, countryCode, bloodGrp, email);
        person.showInformation();
        person.checkingOperator();
    }
}