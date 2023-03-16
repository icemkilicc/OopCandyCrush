import java.util.ArrayList;
import java.util.Objects;

public class Diagonal extends CrushJewels{
    @Override
    public void FirstCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row-1).get(column-1),"*")&&!Objects.equals(array.get(row-2).get(column-2),"*")){
            array.get(row).set(column, " ");
            array.get(row-1).set(column-1, " ");
            array.get(row-2).set(column-2, " ");}
    }
    public void FirstCheckExt(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row+1).get(column+1),"*")&&!Objects.equals(array.get(row+2).get(column+2),"*")){
            array.get(row).set(column, " ");
            array.get(row+1).set(column+1, " ");
            array.get(row+2).set(column+2, " ");}
    }
    @Override
    public void SecondCheck(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row-1).get(column+1),"*")&&!Objects.equals(array.get(row-2).get(column+2),"*")){
            array.get(row).set(column, " ");
            array.get(row - 1).set(column + 1, " ");
            array.get(row - 2).set(column + 2, " ");}
    }

    public void SecondCheckExt(ArrayList<ArrayList<String>> array, int row ,int column) {
        if(!Objects.equals(array.get(row+1).get(column-1),"*")&&!Objects.equals(array.get(row+2).get(column-2),"*")){
            array.get(row).set(column, " ");
            array.get(row + 1).set(column - 1, " ");
            array.get(row + 2).set(column - 2, " ");}
    }
}
