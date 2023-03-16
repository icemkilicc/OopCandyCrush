import java.util.ArrayList;
import java.util.Objects;

public class Vertical extends CrushJewels{
    @Override
    public void FirstCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row-1).get(column),"*")&&!Objects.equals(array.get(row-2).get(column),"*")){
            array.get(row).set(column, " ");
            array.get(row-1).set(column, " ");
            array.get(row-2).set(column, " ");}
    }

    @Override
    public void SecondCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row+1).get(column),"*")&&!Objects.equals(array.get(row+2).get(column),"*")){
            array.get(row).set(column, " ");
            array.get(row+1).set(column, " ");
            array.get(row+2).set(column, " ");}
    }
}
