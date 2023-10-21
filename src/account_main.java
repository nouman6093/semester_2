import java.util.*;
public class account_main {
    public static void main(String[] args){
        account_accountHolder person1 = new account_accountHolder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        person1.setName(name);
        System.out.println("Enter cnic: ");
        int cnic = sc.nextInt();
        person1.setCnic(cnic);
        System.out.println("Enter balance: ");
        int balance = sc.nextInt();
        person1.setBalance(balance);
    }
}
