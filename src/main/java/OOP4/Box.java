package OOP4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<T>();
    }

    public void addAll(List<T> box) {
        this.box.addAll(box);
    }

    public void addFruit(T fruit) {
        this.box.add(fruit);
    }

    public float getWeight() {
        return this.box.size() * this.box.get(0).fruitWeight();
    }

    public boolean compare(Box newBox){
        if (this.getWeight() == newBox.getWeight()){
            return true;
        }
        else return false;
    }

    public List<T> pullOut(){
        return this.box;
    }

    public void replaceTo(Box<T> box){
        box.addAll(this.pullOut());
        this.box.clear();
    }

    @Override
    public String toString() {
        return this.box.toString();
    }
}
