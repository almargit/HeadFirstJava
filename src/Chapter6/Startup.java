package Chapter6;
import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;
    // Startup's instance variables: an ArrayList of cell locations and the Startup's name

    public void setLocationCells(ArrayList<String> locs) {
        //a setter method that updates the Startup's location (random location provided by the GameHelper placeStartup() method
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        //the ArrayList indexOf() method is in action
        //if the user guess is one of the entries in the ArrayList, indexOf() will return its ArrayList location
        //if not, indexOf() will return -1
        if (index >= 0) {
            locationCells.remove(index);
            //using ArrayList's remove() method to delete an entry

            if (locationCells.isEmpty()) {
                //using the isEmpty() method to see if all of the locations have been guessed
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
