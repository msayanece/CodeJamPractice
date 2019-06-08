package com.sayan.android.codejampractice;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Codes {

    public static void startClapping(List<IndividualAudience> audience, int numOfClappers){
        Log.d("startClapping: ", "Called");
        boolean isNumOfClappersIncreased = false;
        for (IndividualAudience individual :
                audience) {
            if (individual.getShynessLevel() <= numOfClappers){
                individual.setClapping(true);
                numOfClappers++;
                Log.d("NumOfClappersIncreased:", individual + " Called" + numOfClappers);
                if (!isNumOfClappersIncreased) isNumOfClappersIncreased = true;
            }
        }
        if (isNumOfClappersIncreased){
            startClapping(audience, numOfClappers);
        }
    }

    public static boolean checkSalt(String input){
        if (!input.contains("0")){
            return false;
        }
        int indexOf = input.indexOf("0");
        int lastIndexOf = input.lastIndexOf("0");
        Integer maximumShynessLevel = input.length() - 1;
        List<Integer> shynessLevels = getMissingShynessLevels(input, indexOf, lastIndexOf);
        if (shynessLevels != null){
            StringBuffer inputStringBuffer = new StringBuffer(input);
            for (Integer shynessLevel :
                    shynessLevels) {
                if (!isCapableOfClapping(input, shynessLevel)) {
                    inputStringBuffer.replace(shynessLevel, shynessLevel+1, "1");
                    input = inputStringBuffer.toString();
                }
            }
        }else {
            return false;
        }
        return true;
    }

    private static boolean isCapableOfClapping(String input, Integer shynessLevel) {
        return false;
    }

    private static List<Integer> getMissingShynessLevels(String input, int indexOf, int lastIndexOf) {
        List<Integer> shynessLevels = null;
        char[] chars = input.toCharArray();
        for (int i = indexOf; i <= lastIndexOf; i++) {
            if (chars[i] == '0'){
                if (shynessLevels == null){
                    shynessLevels = new ArrayList<>();
                }
                shynessLevels.add(i);
            }
        }
        return shynessLevels;
    }
}
