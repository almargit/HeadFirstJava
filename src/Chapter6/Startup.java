package Chapter6;
import java.util.ArrayList

public class Startup {
    private ArrayList<String> locationCells; //change the int array to an ArrayList that holds Strings
    // private int numOfHits do not need to track this now

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }
    public String checkTourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
