package OOP4;

public class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }

    @Override
    public float fruitWeight() {
        return super.fruitWeight();
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
