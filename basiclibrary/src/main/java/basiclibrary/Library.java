package basiclibrary;

import java.util.*;

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

    public boolean containsDuplicates(int[] valuesArray){
        Map <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < valuesArray.length; i++){
            if(map.containsKey(valuesArray[i])){
                return true;
            }else{
                map.put(valuesArray[i],1);
            }
        }
        return false;
    }

    public float arrayAverage(int[] valuesArray) {
        if(valuesArray.length == 0) return 0;
        float total = 0;
        for (int i = 0; i < valuesArray.length; i++){
            total += valuesArray[i];
        }
        return (total/valuesArray.length);
    }

    public int[] twoDArrAvg(int[][] valuesArray){
        if(valuesArray.length == 0) return null;
        int[] lowAvgArray = valuesArray[0];
        double lowAverage = arrayAverage(valuesArray[0]);
        for(int i = 1; i < valuesArray.length; i++){
            double curLowAverage = arrayAverage(valuesArray[i]);
            if(curLowAverage< lowAverage){
                lowAverage = curLowAverage;
                lowAvgArray = valuesArray[i];
            }
        }
        return lowAvgArray;
    }

    public String analyzeWeather(int[][] data){
        Set<Integer> tempValues = new HashSet<>();
        //populate
        for (int[] arr: data) {
            for (int temp: arr) tempValues.add(temp);
        }
        int high = Collections.max(tempValues);
        int low = Collections.min(tempValues);

        String output = String.format("High: %d\nLow: %d", high, low);

        for (int i = low; i < high; i++) {
            if (!tempValues.contains(i)) {
                output += String.format("\nNever saw temperature: %d", i);
            }
        }
        return output;
    }


}
