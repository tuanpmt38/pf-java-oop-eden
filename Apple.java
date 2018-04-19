public class Apple {
    public int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public boolean isEmpty() {
        if (weight < 0) return true;
        else return false;
    }
}
