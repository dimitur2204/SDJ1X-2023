public class Ex102 {
    public static void main(String[] args) {
        double grains = 0;
        double lastSquare = 0;
        final int SQUARE_LENGTH = 8;
        for (int i = 0; i < Math.pow(SQUARE_LENGTH, 2); i++) {
            grains += Math.pow(2, i);
            if (i == Math.pow(SQUARE_LENGTH, 2) - 1) {
                lastSquare = grains;
            }
        }
        System.out.println("Total grains: " + grains);
        System.out.println("Grains on last square: " + lastSquare);
    }
}
