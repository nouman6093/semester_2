import java.util.*;
public class constructor_input {
    String name;
    int age;
    public constructor_input(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
    public static void main(String[] args){
        constructor_input obj = new constructor_input("Nouman Hameed", 20);
        obj.show();
    }
}
