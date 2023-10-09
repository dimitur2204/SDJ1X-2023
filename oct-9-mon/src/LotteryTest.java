import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryTest {
    public static void main(String[] args) {
        Instant inst1 = Instant.now();
        var triesArr = new ArrayList<Integer>();
        for (int i = 0; i <= 200; i++) {
            var lottery = new Lottery();
            lottery.setUserPicks(22, 4, 25, 6, 48, 40);
            var tries = 0;
            while (!lottery.isWon()) {
               tries++;
                lottery = new Lottery();
                lottery.setUserPicks(22, 4, 25, 6, 48, 40);
            }
            triesArr.add(tries);
        }
        Instant inst2 = Instant.now();
        var timeTakenInSeconds = inst2.getEpochSecond() - inst1.getEpochSecond();
        var sumOfTries = 0;
        for (int tries : triesArr) {
            sumOfTries += tries;
        }
        System.out.println(timeTakenInSeconds);
        System.out.println(sumOfTries);
        System.out.println(sumOfTries/ triesArr.size());
        System.out.println(Collections.min(triesArr));
    }

}
