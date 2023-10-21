import java.util.Scanner;

//car_class is about to be imported here:
//enters number of objects from user, accepts information and then prints it
public class car_main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cars: ");
        int length = sc.nextInt();
        //array of objects:
        car_class[] cars = new car_class[length];
        for (int i = 0; i < length; i++){
            System.out.println("Enter model: ");
            int model = sc.nextInt();
            System.out.println("Enter make: ");
            String make = sc.next();
            System.out.println("Enter company: ");
            String company = sc.next();
            System.out.println("Enter color: ");
            String color = sc.next();
            cars[i] = new car_class(model,make,company,color);
        }
        for (int i = 0; i < length; i++){
            System.out.println("information: ");
            cars[i].show();
        }
    }
}
