import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    ArrayList<String> Symbol = new ArrayList<>(Arrays.asList("\\", "/", "-", "+", "|"));
    public void Gaming(Players players,Write writter,GameFunctions gameFunctions,Diagonal diagonal,CrushJewels horizontal
            ,CrushJewels vertical,CheckChain ChainFunc,CheckChainMath ChainFuncMath,ReadingGrid ArrayList,String txt) throws IOException {


        //This method is the skeleton of the game.
        //Basically, it reads the command file and assigns it accordingly.

        FileWriter monitoring = new FileWriter("monitoring.txt");
        monitoring.write("Game Grid:\n\n");
        int points = 0;
        writter.Writing(ArrayList.gridArray,monitoring,"first",players,points);

        File myObj = new File(txt);
        Scanner myReader = new Scanner(myObj);

        Players.gridTotalPoint= gameFunctions.Point(ArrayList.gridArray);


        while (myReader.hasNext()) {

            ArrayList<String> checkList = new ArrayList<>();
            String command = myReader.nextLine();
            String[] splitCommand = command.split(" ");

            if(splitCommand.length==2){

                int check = 0;
                int row = Integer.parseInt(splitCommand[0])+2;
                int column = Integer.parseInt(splitCommand[1])+2;

                try {
                    if(!Symbol.contains(ArrayList.gridArray.get(row).get(column))){
                        checkList.add(ArrayList.gridArray.get(row).get(column));}
                    else {checkList=Symbol;}
                } catch (Exception e) {
                    monitoring.write("Select coordinate or enter E to end the game: " + command + "\n\n");
                    monitoring.write("Please enter a valid coordinate\n\n");
                    continue;
                }

                //We can easily add a new case to the switch and assign a new jewel.
                //But you should specifize which method the program use.
                //Since there are 2 types of jewels, I created 2 separate classes, but for similar matches
                // , I called the method in the super class.

                switch (ArrayList.gridArray.get(row).get(column)) {
                    case "D":
                        ChainFunc.CheckDiagonal(row, column, diagonal, ArrayList,checkList);
                        break;
                    case "S":
                        ChainFunc.CheckHorizontal(row, column, horizontal, ArrayList,checkList);
                        break;
                    case "T":
                        ChainFunc.CheckVertical(row, column, vertical, ArrayList,checkList);
                        break;
                    case "W":
                        ChainFunc.CheckW(row, column, diagonal, horizontal, vertical, ArrayList,checkList);
                        break;
                    case "/":
                        ChainFuncMath.CheckSlash(row, column, diagonal, ArrayList,checkList);
                        break;
                    case "-":
                        ChainFuncMath.CheckMinus(row, column, horizontal, ArrayList,checkList);
                        break;
                    case "+":
                        ChainFuncMath.CheckPlus(row, column, vertical, horizontal, ArrayList,checkList);
                        break;
                    case "\\":
                        ChainFuncMath.CheckReversSlash(row, column, diagonal, ArrayList,checkList);
                        break;
                    case "|":
                        ChainFuncMath.CheckDPipe(row, column, vertical, ArrayList,checkList);
                        break;
                    default: {
                        monitoring.write("Select coordinate or enter E to end the game: " + command + "\n\n");
                        monitoring.write("Please enter a valid coordinate\n\n");
                        check++;
                    }
                }

                //I use point method to calculate the point of player
                points = Players.gridTotalPoint-gameFunctions.Point(ArrayList.gridArray)-players.getPoint();
                players.setPoint(Players.gridTotalPoint-gameFunctions.Point(ArrayList.gridArray));

                //I use scrolldown method to delete spaces.
                gameFunctions.scrollDown(ArrayList.gridArray);

                if(check==0){
                    writter.Writing(ArrayList.gridArray,monitoring,command,players,points);}
            }
            else{
                String playerName = myReader.nextLine();
                writter.EndWriting(monitoring,playerName,players,Players.PlayerArray);
                monitoring.close();
                writter.leaderBoard(Players.PlayerArray);
            }
        }
    }
}
