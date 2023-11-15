import org.w3c.dom.ls.LSOutput;

interface interface_class {
    void sound();
}
class dog implements interface_class{
    @Override
    public void sound() {
        System.out.println("woof woof");
    }
}
class cat implements interface_class{
    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}