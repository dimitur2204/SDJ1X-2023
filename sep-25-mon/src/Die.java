public class Die {
    private int limit;

    public Die(int limit) {
        this.limit = limit;
    }

    public int roll() {
        return (int) (Math.random() * limit) + 1;
    }
}
