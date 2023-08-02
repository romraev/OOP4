package OOP4;

public class Apple extends Fruit{
    public Apple() {
       super(1.0f);
    }
    @Override
    public float fruitWeight() {
        return super.fruitWeight();
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
