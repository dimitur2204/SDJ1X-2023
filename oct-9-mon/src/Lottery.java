import java.util.*;

public class Lottery{
    private final ArrayList<Integer> lotteryNumbers;
    private final ArrayList<Integer> userPicks;
    private final Random random = new Random();
    public Lottery(){
        var lotteryNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            var randomNumber = this.random.nextInt(49);
            if (lotteryNumbers.contains(randomNumber)) {
                i--;
                continue;
            }
            lotteryNumbers.add(randomNumber);
        }
        this.lotteryNumbers = lotteryNumbers;
        this.userPicks = new ArrayList<Integer>();
    }

    public void setUserPicks(int ...userPicks) {
        for (int userPick : userPicks) {
            this.userPicks.add(userPick);
        }
    }

    public boolean isWon(){
        for (int userPick : this.userPicks) {
            if (!this.lotteryNumbers.contains(userPick)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getLotteryNumbers(){
        return new ArrayList<Integer>(this.lotteryNumbers);
    }

    public ArrayList<Integer> _getLotteryNumbers(){
        return this.lotteryNumbers;
    }

    public String toString(){
        return "Lottery numbers: " + this.lotteryNumbers + "\nUser picks: " + this.userPicks;
    }
}
