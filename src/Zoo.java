import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;
    public List<Employee> employees;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    //add animal

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    //add employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    //show animal

    public void showAnimal(){
        System.out.println("*** Animals in the Zoo ***");
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }

    //show employees
    public void showEmployees(){
        System.out.println("*** Employees in the Zoo ***");
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
















}
