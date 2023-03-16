import java.util.ArrayList;
public class CheckChainMath extends MasterCheck{

    //For the same check condition, I use the method written in super class.
    public void CheckSlash(int row, int column, Diagonal diagonal,ReadingGrid ArrayList, ArrayList<String> Symbol){
        if(Symbol.contains(ArrayList.gridArray.get(row-1).get(column+1))&& Symbol.contains(ArrayList.gridArray.get(row-2).get(column+2))){
            diagonal.SecondCheck(ArrayList.gridArray,row,column);
        }
        else if(Symbol.contains(ArrayList.gridArray.get(row+1).get(column-1))&& Symbol.contains(ArrayList.gridArray.get(row+2).get(column-2))){
            diagonal.SecondCheckExt(ArrayList.gridArray,row,column);
        }
    }
    public void CheckMinus(int row, int column, CrushJewels horizontal,ReadingGrid ArrayList, ArrayList<String> Symbol){
        super.CheckHorizontal(row, column, horizontal, ArrayList,Symbol);
    }
    public void CheckPlus(int row, int column, CrushJewels vertical,CrushJewels horizontal,ReadingGrid ArrayList, ArrayList<String> Symbol){
        if(Symbol.contains(ArrayList.gridArray.get(row).get(column-1))&& Symbol.contains(ArrayList.gridArray.get(row).get(column-2))){
            horizontal.SecondCheck(ArrayList.gridArray,row,column);
        }

        else if(Symbol.contains(ArrayList.gridArray.get(row).get(column+1))&& Symbol.contains(ArrayList.gridArray.get(row).get(column+2))){
            horizontal.FirstCheck(ArrayList.gridArray,row,column);
        }
        else if(Symbol.contains(ArrayList.gridArray.get(row-1).get(column))&& Symbol.contains(ArrayList.gridArray.get(row-2).get(column))){
            vertical.FirstCheck(ArrayList.gridArray,row,column);
        }
        else if(Symbol.contains(ArrayList.gridArray.get(row+1).get(column))&& Symbol.contains(ArrayList.gridArray.get(row+2).get(column))){
            vertical.SecondCheck(ArrayList.gridArray,row,column);
        }
    }
    public void CheckReversSlash(int row, int column, Diagonal diagonal,ReadingGrid ArrayList, ArrayList<String> Symbol){
        if(Symbol.contains(ArrayList.gridArray.get(row-1).get(column-1))&& Symbol.contains(ArrayList.gridArray.get(row-2).get(column-2))){
            diagonal.FirstCheck(ArrayList.gridArray,row,column);
        }
        else if(Symbol.contains(ArrayList.gridArray.get(row+1).get(column+1))&& Symbol.contains(ArrayList.gridArray.get(row+2).get(column+2))){
            diagonal.FirstCheckExt(ArrayList.gridArray,row,column);
        }
    }
    public void CheckDPipe(int row, int column, CrushJewels vertical,ReadingGrid ArrayList, ArrayList<String> Symbol){
        super.CheckVertical(row, column, vertical, ArrayList,Symbol);
    }
}
