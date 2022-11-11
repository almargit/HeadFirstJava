package Chapter6;
import Chapter5.GameHelper;

import java.util.*;

public class StartupBust {

    //declare and initialize the variables we will need
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        //first make some dot coms and give them locations
        //make three Startup objects, give them names and stick them in the ArrayList
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        //print brief instruction for user
        System.out.println("Your goal is to sink three Startups");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        //repeat with each Startup in the list
        for (Startup startup : startups) {
            //ask the helper for the Startup location (an ArrayList of Strings)
            ArrayList<String> newLocation = helper.placeStartup(3);
            //call the setter method on this Startup to give it the location you just got from the helper
        } //close for loop
    } //close setUpGame method

    private void startPlaying() {
        while (!startups.isEmpty()) {
            //as long as Startup list is NOT empty
            String userGuess = helper.getUserInput("Enter a guess");
            //get user input;
            checkUserGuess(userGuess);
            //call our own checkUserGuess method
        } //close while
        finishGame();
        //call our finishGame method
    } //close startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        //increment the number of guesses the user gas made
        String result = "miss";
        // assume it is a miss, unless told otherwise

        for (Startup startupToTest : startups) {
            //repeat with Startups in the list
            result = startupToTest.checkTourself(userGuess);
            //ask the Startup to check the user guess, looking for a hit or kill

            if (result.equals("hit")) {
                break;
                //get out of the loop early, no point in testing the others
            }
            if (result.equals("kill")) {
                startups.remove(startupToTest);
                //this one is dead, so take it out of the Startups list and get out of the loop
                break;
            }
        } //close for
        System.out.println(result);
        //print the result of the user
    } //close method

    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now wortheless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    } //close method
    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        //create the game object
        game.setUpGame();
        //tell the game object to set up the game
        game.startPlaying();
        // tell the game object to start the main game play loop (keeps asking user input and checking the guess
    } //close method
}




