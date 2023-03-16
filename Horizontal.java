import java.util.ArrayList;
import java.util.Objects;

public class Horizontal extends CrushJewels{
    @Override
    public void FirstCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row).get(column+1),"*")&&!Objects.equals(array.get(row).get(column+2),"*")){
            array.get(row).set(column, " ");
            array.get(row).set(column+1, " ");
            array.get(row).set(column+2, " ");}
    }

    @Override
    public void SecondCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row).get(column-1),"*")&&!Objects.equals(array.get(row).get(column-2),"*")){
            array.get(row).set(column, " ");
            array.get(row).set(column-1, " ");
            array.get(row).set(column-2, " ");}
    }
}
