public class Horse {
    String name;
    String colour;
    int age;

    public Horse(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "horse{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
