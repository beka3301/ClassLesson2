import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Cat[] cat = new Cat[3];
        Dog[] dog = new Dog[3];
        Horse[] horse = new Horse[3];
        int countDog= 0;

        while (true) {
            System.out.println("add cat-> 1" + "\n" + "add dog-> 2" + "\n" + "add horse-> 3");
            int temp = in.nextInt();
        int pussy=0;
        while (true) {
        System.out.println("add cat-> 1" + "\n" + "add dog-> 2" + "\n" + "add horse-> 3");
        int temp = in.nextInt();
            if (temp==1){
                for (int i = 0; i < cat.length; i++) {
                    pussy++;
                System.out.print("name: ");
                String name = in1.nextLine();
                System.out.print("color: ");
                String color= in2.nextLine();
                System.out.print("age: ");
                int age= in3.nextInt();
                cat[i]=cat(name,color,age);
                }
                for (Cat cat1:cat) {
                    System.out.println(cat1);
                }
            }

        }

            if (temp == 2) {
                for (int i = 0; i < dog.length; i++) {
                    countDog++;
                    System.out.println("dog = "+countDog);
                    System.out.print("name: ");
                    String name = in3.nextLine();
                    System.out.print("color: ");
                    String color = in1.nextLine();
                    System.out.print("age: ");
                    int age = in2.nextInt();
                    dog[i] = dog(name,color,age);
                }
                for (Dog dog1:dog) {
                    System.out.println(dog1);
                }
            }

        }
    }
    public static Dog dog(String name,String color,int age){
        return new Dog( name, age, color );
    }
}
        }
        public static Cat cat(String name,String color,int age){
        return new Cat(name, age, color);
        }

        }



