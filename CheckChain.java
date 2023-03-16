import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class CheckChain extends MasterCheck {

    // If you want to change the behaviour of a jewels you can delete super method and write the condition which,
    // you want to check.So I use super method.
    public void CheckDiagonal(int row, int column, Diagonal diagonal, ReadingGrid ArrayList, ArrayList<String> checkList){
        super.CheckDiagonal(row, column, diagonal, ArrayList,checkList);
    }
    public void CheckHorizontal(int row, int column, CrushJewels horizontal,ReadingGrid ArrayList, ArrayList<String> checkList){
        super.CheckHorizontal(row, column, horizontal, ArrayList,checkList);
    }
    public void CheckVertical(int row, int column, CrushJewels vertical,ReadingGrid ArrayList, ArrayList<String> checkList){
        super.CheckVertical(row, column, vertical, ArrayList,checkList);
    }
    public void CheckW(int row, int column,Diagonal diagonal,CrushJewels horizontal,CrushJewels vertical,ReadingGrid ArrayList, ArrayList<String> checkList){
        super.CheckW(row, column, diagonal, horizontal, vertical, ArrayList,checkList);
    }
}
