import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        //Hayvanlari ekleyelim
        Animal lion = new Animal("lion", 12 );
        Animal eagle = new Animal("eagle", 5);

        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);

        //calisanlari ekleyelim
        Employee zookeeper = new Employee("Jack",101);
        Employee vet= new Employee("Jack",101);

        zoo.addEmployee(zookeeper);
        zoo.addEmployee(vet);

        //hayvanlari ve calisanlari gosterelim
        zoo.showAnimal();
        zoo.showEmployees();

        //calisanlarin calismasini gosterelim
        zookeeper.work();
        vet.work();

        //hayvanlarin ses cikarmasini gosterelim
        lion.makeSound();
        eagle.makeSound();


    }
}



