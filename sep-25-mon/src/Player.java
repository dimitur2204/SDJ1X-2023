public class Player {
    private String name;
    private int score;
    private Die die;

    public Player(String name, Die die) {
        this.name = name;
        this.score = 50;
        this.die = die;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    private void checkScore(int score) throws IllegalArgumentException {
        if (score < 1) {
            throw new IllegalArgumentException("Score cannot be negative");
        }
    }
    public void play() {
        var rolled = die.roll();
        System.out.print(this.name + " rolled " + rolled + " - ");
        try {
            checkScore(this.score);
            this.score -= rolled;
            System.out.println(this.name + "'s new score: " + this.score);
        } catch (IllegalArgumentException e) {
            this.score += rolled;
            System.out.println(this.name + " overshot! New score: " + this.score);
        }
    }

    public void reset() {
        this.score = 0;
    }

    public boolean isWinner() {
        return this.score == 1;
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }


}
