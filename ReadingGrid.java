import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadingGrid {
    ArrayList<ArrayList<String>> gridArray = new ArrayList<>();

    public void Reading(String txt) throws FileNotFoundException {

        File myObj = new File(txt);
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> star = new ArrayList<>();

        while (myReader.hasNext()) {

            String line = myReader.nextLine();
            String[] splitLine = line.split(" ");
            ArrayList<String> row = new ArrayList<>();

            row.add("Q");
            row.add("*");
            Collections.addAll(row, splitLine);
            row.add("*");
            row.add("Q");
            star.add("*");
            gridArray.add(row);
        }
        star.add(0,"Q");
        star.add("*");
        star.add("*");
        star.add("Q");
        ArrayList<String> QList = new ArrayList<>(Collections.nCopies(star.size(), "Q"));
        gridArray.add(0,QList);
        gridArray.add(1,star);
        gridArray.add(star);
        gridArray.add(QList);
    }
}
