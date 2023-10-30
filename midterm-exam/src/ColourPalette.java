import java.util.ArrayList;
import java.util.Arrays;

public class ColourPalette {
    private ArrayList<Integer> numberOfColours;

   public ColourPalette(int maxNumberOfColours){
       this.numberOfColours = new ArrayList<>(maxNumberOfColours);
   }

    public int getNumberOfColours() {
       return numberOfColours.length;
    }

}
