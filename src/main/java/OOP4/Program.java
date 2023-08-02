package OOP4;

public class Program {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> apBox = new Box<>();
        Box<Orange> orBox = new Box<>();
        Box<Orange> orBox2 = new Box<>();


        apBox.addFruit(apple);
        apBox.addFruit(apple);
        apBox.addFruit(apple);
        apBox.addFruit(apple);
        apBox.addFruit(apple);
        apBox.addFruit(apple);

        orBox.addFruit(orange);
        orBox.addFruit(orange);
        orBox.addFruit(orange);
        orBox.addFruit(orange);


        orBox2.addFruit(orange);
        orBox2.addFruit(orange);

        System.out.println(apBox.compare(orBox));

        System.out.println(apBox);
        System.out.println(orBox);
        System.out.println(orBox2);

        orBox.replaceTo(orBox2);
        System.out.println(orBox);
        System.out.println(orBox2);





    }
}
