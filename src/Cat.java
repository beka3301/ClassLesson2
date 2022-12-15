public class Cat {
    String name;
    int age;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;


    }
}
