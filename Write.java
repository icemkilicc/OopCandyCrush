import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Write {
    public void Writing(ArrayList<ArrayList<String>> array,FileWriter monitoring,String command,Players player,int point) throws IOException {

        if(!Objects.equals(command,"first")){
            monitoring.write("Select coordinate or enter E to end the game: "+command+"\n\n");}

        for (int i = 2; i < array.size()-2; i++) {
            for (int j = 2; j < array.get(i).size()-2; j++) {
                monitoring.write(array.get(i).get(j)+" ");
            }
            monitoring.write("\n");
        }
        monitoring.write("\n");

        if(player.getPoint()!=0){
            monitoring.write("Score: "+point+" points"+"\n\n");
        }
    }
    public void EndWriting(FileWriter monitoring,String command,Players player,ArrayList<Players> array) throws IOException {
        player.setName(command);

        ArrayList<Players> sortedList = new ArrayList<>(Players.PlayerArray);
        Collections.sort(sortedList);
        int[] newSeries = new int[Players.PlayerArray.size()];

        for (int i = 0; i < newSeries.length; i++) {
            newSeries[i] = sortedList.get(i).getPoint();
        }
        int rank = newSeries.length- Arrays.binarySearch(newSeries,player.getPoint());

        monitoring.write("Select coordinate or enter E to end the game: E\n\n");
        monitoring.write("Total score: "+player.getPoint()+" points"+"\n\n");
        monitoring.write("Enter name: "+player.getName()+"\n\n");
        monitoring.write("Your rank is "+rank+"/"+newSeries.length);

        if(rank == 1){
            monitoring.write(", your score is "+(newSeries[sortedList.size()-1]-newSeries[sortedList.size()-2])+" points higher than "+sortedList.get(sortedList.size()-2).getName()+"\n\n");
        }
        else if(rank == sortedList.size()+1){
            monitoring.write(", your score is "+(newSeries[1]-newSeries[0])+" points lower than "+sortedList.get(1).getName()+"\n\n");
        }
        else{
            monitoring.write(", your score is "+(newSeries[sortedList.size()-rank+1]-newSeries[sortedList.size()-rank])+" points lower than "+sortedList.get(sortedList.size()-rank+1).getName());
            monitoring.write(" and "+(newSeries[sortedList.size()-rank]-newSeries[sortedList.size()-rank-1])+" points higher than "+sortedList.get(sortedList.size()-rank-1).getName()+"\n\n");
        }
        monitoring.write("Good Bye!");
    }
    public void leaderBoard(ArrayList<Players> array) throws IOException {

        FileWriter leaderBoard = new FileWriter("leaderboard.txt");
        for(Players player: array){
            leaderBoard.write(player.getName()+ " "+player.getPoint()+"\n");
        }
        leaderBoard.close();
    }
}
