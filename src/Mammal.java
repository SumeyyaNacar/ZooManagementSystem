public class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ "is making a mammal sound");
    }
}
