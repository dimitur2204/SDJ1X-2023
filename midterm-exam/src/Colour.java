public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getBlue() {
        return this.blue;
    }

    public int getGreen() {
        return this.green;
    }

    public boolean isGray() {
        return this.green == this.blue && this.green == this.red;
    }

    public void set(int red, int green, int blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public Colour mixWith(Colour colour2) {
        int newRed = (int) Math.round(this.getRed() * 0.5 + colour2.getRed() * 0.5);
        int newGreen = (int) Math.round(this.getGreen() * 0.5 + colour2.getGreen() * 0.5);
        int newBlue = (int) Math.round(this.getBlue() * 0.5 + colour2.getBlue() * 0.5);
        return new Colour(newRed, newGreen, newBlue);
    }

    public Colour copy() {
        return new Colour(this.red, this.green, this.blue);
    }

    public String toString() {
        return "R: " + this.red + "G: " + this.green + "B: " + this.blue;
    }
}
