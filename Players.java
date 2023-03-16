import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Players implements Comparable<Players> {

    public static int gridTotalPoint;
    private int Point;
    private String Name;


    public static ArrayList<Players> PlayerArray = new ArrayList<>();

    public  Players(){}

    public Players(String name, int point) {
        this.Point = point;
        this.Name = name;
    }
    public int getPoint() {return Point;}

    public void setPoint(int point) {this.Point = point;}

    public String getName() {return Name;}

    public void setName(String name) {this.Name = name;}

    public void ReadPeople() throws FileNotFoundException {

        FileReader leadTxt = new FileReader("leaderboard.txt");
        Scanner leaderBoard = new Scanner(leadTxt);

        while (leaderBoard.hasNext()){
            String people = leaderBoard.nextLine();
            String[] peoplePro = people.split(" ");
            Players player = new Players(peoplePro[0],Integer.parseInt(peoplePro[1]));
            PlayerArray.add(player);
        }
    }

    @Override
    public int compareTo(Players o) {
        return Integer.compare(this.Point, o.Point);
    }
}
