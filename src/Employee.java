public class Employee {

    private String name;
    private int id;

    //const
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //getter-setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(){
        System.out.println(getName() + "is working");
    }

    //toString

    @Override
    public String toString() {
        return "Name='" + name + ", Id=" + id ;
    }
}
