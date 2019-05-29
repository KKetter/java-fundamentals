package basiclibrary;

import java.util.Arrays;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int numberOfRolls){
        Random random = new Random();
        int[] rollResultArr = new int[numberOfRolls];
        for(int i=0; i < numberOfRolls; i++){
            int rollValue = random.nextInt((6 - 1) + 1) + 1;
            rollResultArr[i] = rollValue;
        }
        return rollResultArr;
    }

    public int
}
