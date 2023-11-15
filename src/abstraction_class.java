abstract class abstraction_shape {
    abstract void walk();
}
class horse extends abstraction_shape{
    @Override
    void walk() {
        System.out.println("4 legs");
    }
}
class chicken extends abstraction_shape{
    @Override
    void walk() {
        System.out.println("2 legs");
    }
}
