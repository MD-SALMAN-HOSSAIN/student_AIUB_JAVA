public class Contact {
    public String name;
    public String countryCode;
    public String bloodGrp;
    public String email;
    private String phnNumber;
    private String address[2];

    Contact() 
	{
        System.out.println("Operator Result\n");
    }

    public Contact(String address[2],phnNumber) 
	{
        this.phnNumber = phnNumber;
        this.address = address;
    }

    public void setter(String name, String countryCode, String bloodGrp;, String email) {
        this.name = name;
        this.countryCode = countryCode;
        this.bloodGrp; = bloodGrp;
        this.email = email;
    }

    public void checkingOperator() {
        if (phnNumber.charAt(2) == '9') {
            System.out.println("Phone Number: " + phnNumber + " - The number is GP Operator");
        } else if (phnNumber.charAt(2) == '7') {
            System.out.println("Phone Number: " + phnNumber + " - The number is Banglalink Operator");
        } else if (phnNumber.charAt(2) == '5') {
            System.out.println("Phone Number: " + phnNumber + " - The number is Robi Operator");
        } else if (phnNumber.charAt(2) == '8') {
            System.out.println("Phone Number: " + phnNumber + " - The number is Teletalk Operator");
        } else if (phnNumber.charAt(2) == '6') {
            System.out.println("Phone Number: " + phnNumber + " - The number is Airtel Operator");
        } else {
            System.out.println(phnNumber + "There is No Operator Operator");
        }
    }

    public void showInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Country Code: " + this.countryCode);
        System.out.println("Blood Group: " + this.bloodGrp);
        System.out.println("Blood Email: " + this.email);
        System.out.println("Address: " + this.address);
    }
}