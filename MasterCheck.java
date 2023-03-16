import java.util.ArrayList;
import java.util.Objects;

public class MasterCheck {

    //I wrote all possible situations and filled the bodies of the methods.

    public void CheckDiagonal(int row, int column, Diagonal diagonal,ReadingGrid ArrayList, ArrayList<String> checkList){
        if(checkList.contains(ArrayList.gridArray.get(row-1).get(column-1))&& checkList.contains(ArrayList.gridArray.get(row-2).get(column-2))){
            diagonal.FirstCheck(ArrayList.gridArray,row,column);
        }
        else if(checkList.contains(ArrayList.gridArray.get(row+1).get(column+1))&& checkList.contains(ArrayList.gridArray.get(row+2).get(column+2))){
            diagonal.FirstCheckExt(ArrayList.gridArray,row,column);
        }
        else if(checkList.contains(ArrayList.gridArray.get(row-1).get(column+1))&& checkList.contains(ArrayList.gridArray.get(row-2).get(column+2))){
            diagonal.SecondCheck(ArrayList.gridArray,row,column);
        }
        else if(checkList.contains(ArrayList.gridArray.get(row+1).get(column-1))&& checkList.contains(ArrayList.gridArray.get(row+2).get(column-2))){
            diagonal.SecondCheckExt(ArrayList.gridArray,row,column);
        }
    }
    public void CheckHorizontal(int row, int column, CrushJewels horizontal,ReadingGrid ArrayList, ArrayList<String> checkList){
        if(checkList.contains(ArrayList.gridArray.get(row).get(column-1))&& checkList.contains(ArrayList.gridArray.get(row).get(column-2))){
            horizontal.SecondCheck(ArrayList.gridArray,row,column);
        }
        else if(checkList.contains(ArrayList.gridArray.get(row).get(column+1))&& checkList.contains(ArrayList.gridArray.get(row).get(column+2))){
            horizontal.FirstCheck(ArrayList.gridArray,row,column);
        }
    }
    public void CheckVertical(int row, int column, CrushJewels vertical,ReadingGrid ArrayList, ArrayList<String> checkList){
        if(checkList.contains(ArrayList.gridArray.get(row-1).get(column))&& checkList.contains(ArrayList.gridArray.get(row-2).get(column))){
            vertical.FirstCheck(ArrayList.gridArray,row,column);
        }
        else if(checkList.contains(ArrayList.gridArray.get(row+1).get(column))&& checkList.contains(ArrayList.gridArray.get(row+2).get(column))){
            vertical.SecondCheck(ArrayList.gridArray,row,column);
        }
    }
    public void CheckW(int row, int column,Diagonal diagonal,CrushJewels horizontal,CrushJewels vertical,ReadingGrid ArrayList, ArrayList<String> checkList){
        if (Objects.equals(ArrayList.gridArray.get(row - 1).get(column), ArrayList.gridArray.get(row - 2).get(column))||Objects.equals(ArrayList.gridArray.get(row-1).get(column),"W")||Objects.equals(ArrayList.gridArray.get(row-2).get(column),"W")) {
            vertical.FirstCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row + 1).get(column), ArrayList.gridArray.get(row + 2).get(column))||Objects.equals(ArrayList.gridArray.get(row+1).get(column),"W")||Objects.equals(ArrayList.gridArray.get(row+2).get(column),"W")) {
            vertical.SecondCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row).get(column-1), ArrayList.gridArray.get(row).get(column - 2))||Objects.equals(ArrayList.gridArray.get(row).get(column-1),"W")||Objects.equals(ArrayList.gridArray.get(row).get(column-2),"W")) {
            horizontal.SecondCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row).get(column + 1), ArrayList.gridArray.get(row).get(column + 2))||Objects.equals(ArrayList.gridArray.get(row).get(column+1),"W")||Objects.equals(ArrayList.gridArray.get(row).get(column+2),"W")) {
            horizontal.FirstCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row - 1).get(column - 1), ArrayList.gridArray.get(row - 2).get(column - 2))||Objects.equals(ArrayList.gridArray.get(row-1).get(column-1),"W")||Objects.equals(ArrayList.gridArray.get(row-2).get(column-2),"W")) {
            diagonal.FirstCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row + 1).get(column + 1), ArrayList.gridArray.get(row + 2).get(column + 2))||Objects.equals(ArrayList.gridArray.get(row+1).get(column+1),"W")||Objects.equals(ArrayList.gridArray.get(row+2).get(column+2),"W")) {
            diagonal.FirstCheckExt(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row - 1).get(column + 1), ArrayList.gridArray.get(row - 2).get(column + 2))||Objects.equals(ArrayList.gridArray.get(row-1).get(column+1),"W")||Objects.equals(ArrayList.gridArray.get(row-2).get(column+2),"W")) {
            diagonal.SecondCheck(ArrayList.gridArray, row, column);
        }
        else if (Objects.equals(ArrayList.gridArray.get(row + 1).get(column - 1), ArrayList.gridArray.get(row + 2).get(column - 2))||Objects.equals(ArrayList.gridArray.get(row+1).get(column-1),"W")||Objects.equals(ArrayList.gridArray.get(row+2).get(column-2),"W")) {
            diagonal.SecondCheckExt(ArrayList.gridArray, row, column);
        }
    }
}
