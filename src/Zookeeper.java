public class Zookeeper extends Employee{
    public Zookeeper(String name, int id) {
        super(name, id);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is taking care of animals");
    }
}
