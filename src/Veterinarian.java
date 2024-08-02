public class Veterinarian extends Employee{
    public Veterinarian(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is treating the animals");
    }
}
