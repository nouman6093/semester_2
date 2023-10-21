import packages.multiply_class;
public class method_vs_function {
    //mainly difference lies in function and method call
    //it is necessary to create an object whether you are writing function or method

    //method:
    public int sum(int a, int b){
        return(a+b);
    }

    //function:
    public int subtract(int a, int b){
        return(a-b);
    }
    public static void main(String[] args){
        method_vs_function object = new method_vs_function();
        int c = object.sum(10,20);
        System.out.println(c);
        int d = object.subtract(20,10);
        System.out.println(d);
        multiply_class multiply_object = new multiply_class();
        int e = multiply_object.multiply_method(10,10);
        System.out.println(e);
    }
}