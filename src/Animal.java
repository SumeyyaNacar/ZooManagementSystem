public class Animal {
    private String name;
    private int age;

    //param. constt


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal is making sound");
    }

    //toString

    @Override
    public String toString() {
        return "Name='" + name + ", Age=" + age;
    }
}
