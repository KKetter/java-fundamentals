public class Main {
    public static void main(String[] args) {
        //int itemCount = 10;
        //System.out.println("I own " + itemCount + " " + pluralize("dog", itemCount) + ".");
        //flipNHeads(3);
        clock();
    }

    public static String pluralize(String item, int itemCount) {
        if(itemCount == 1){
            return (item); 
        } else {
            return (item + "s");
        }
    }

    public static void flipNHeads(int flipStreakGoal) {
        int runCounter = 0;
        int totalCounter = 0;
        //while loop with until counter = flipStreakGoal continue?
        while(flipStreakGoal != runCounter) {
            double flipValue = Math.random();
            if(flipValue >= .5){
                runCounter++; 
                System.out.println("heads");
            } else {
                runCounter = 0;
                System.out.println("tails");
            }
            totalCounter++;
        }
        //inside loop conditions randomNumGen set to variable - if >=.5 = heads/else = tails
        System.out.println("It took " + totalCounter + " flips to flip " + flipStreakGoal + " heads in a row.");
    }

    public static void clock() {

    }
}



