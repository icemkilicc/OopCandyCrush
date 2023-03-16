import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GameFunctions {

    //I use scrolldown method to delete spaces and point method to calculate the point of player.
    public void scrollDown(ArrayList<ArrayList<String>> array){
        for (int i = 2; i < array.size()-2; i++) {

            for (int k = 2; k < array.get(i).size()-2; k++) {
                if(Objects.equals(array.get(i).get(k)," ")){
                    for (int j = i; j > 2; j--) {
                        array.get(j).set(k,array.get(j-1).get(k));
                        array.get(j-1).set(k," ");}
                }
            }
        }
    }
    public int Point(ArrayList<ArrayList<String>> array){
        int points = 0;
        ArrayList<String> Symbol = new ArrayList<>(Arrays.asList("\\", "/", "-", "+", "|"));
        for (ArrayList<String> strings : array) {
            for (String string : strings) {
                if (Objects.equals(string, "D")) {
                    points = points + 30;
                }
                if (Objects.equals(string, "S")) {
                    points = points + 15;
                }
                if (Objects.equals(string, "T")) {
                    points = points + 15;
                }
                if (Objects.equals(string, "W")) {
                    points = points + 10;
                }
                if (Symbol.contains(string)) {
                    points = points + 20;
                }
            }
        }
        return points;
    }
}
