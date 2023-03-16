
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //In main class, I just instantiate the object that I will use.

        Players players = new Players();
        players.ReadPeople();
        Players.PlayerArray.add(players);
        Write Writter = new Write();
        GameFunctions gameFunctions = new GameFunctions();
        Diagonal diagonal = new Diagonal();
        CrushJewels horizontal = new Horizontal();
        CrushJewels vertical = new Vertical();
        CheckChain ChainFunc = new CheckChain();
        CheckChainMath ChainFuncMath = new CheckChainMath();
        ReadingGrid ArrayList = new ReadingGrid();
        ArrayList.Reading(args[0]);
        Game play = new Game();
        play.Gaming(players,Writter,gameFunctions,diagonal,horizontal,vertical,ChainFunc,ChainFuncMath, ArrayList,args[1]);
    }
}
