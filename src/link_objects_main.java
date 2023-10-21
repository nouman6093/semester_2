import java.util.Scanner;
public class link_objects_main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input owner details:
        System.out.print("Enter owner name: ");
        String owner_name = sc.nextLine();
        System.out.print("Enter owner cnic: ");
        int owner_cnic = sc.nextInt();

        //input bike details:
        System.out.print("Enter bike company name: ");
        String company_name = sc.nextLine();
        System.out.print("Enter bike engine cc: ");
        int engine_cc = sc.nextInt();

        //object
        link_objects_owner owner_object = new link_objects_owner(owner_name,owner_cnic,company_name,engine_cc);

        //output
        owner_object.display_owner_details();
        owner_object.bike_object.display_bike_details();

        //modification
        owner_object.setName("Nouman Hameed");
        owner_object.setCnic(44);
        owner_object.display_owner_details();
        owner_object.bike_object.setCompany_name("yamaha");
        owner_object.bike_object.setEngine_cc(77);
        owner_object.bike_object.display_bike_details();
    }
}
