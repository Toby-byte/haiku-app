package haikuanalysis;

import data.Haiku_Input_Data;

import java.util.ArrayList;

public class HaikuAnalysisEngine {

    public static boolean isVokal(String bogstav) {
        String[] vokaler = {"a","e","i","o","u","y","æ","ø","å"};
        boolean booleanVokal = false;
        for (int i = 0; i < vokaler.length; i++) {
            if (vokaler[i].equals(bogstav)) {
                booleanVokal = true;
            }
        }
        return booleanVokal;
    }

    public static int antalStavelser(ArrayList<String> stringArray) {

        int antalStavelser = 0;
        for (int i = 0; i < stringArray.size(); i++) {
            if (isVokal(stringArray.get(i))) {

                if (isVokal(stringArray.get(i)) && isVokal(stringArray.get(i+1))) {
                    antalStavelser++;
                } else if (isVokal(stringArray.get(i)) && !isVokal(stringArray.get(i + 1))) {
                    antalStavelser++;
                }

            }
        }
        return antalStavelser;
    }

    public static ArrayList stringToArrayList(String word) {
        ArrayList<String> testArray = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {

            char idk = word.charAt(i);
            String idk2 = String.valueOf(idk);
            testArray.add(idk2);
        }
        return testArray;
    }


    public static void main(String[] args) {

        antalStavelser(stringToArrayList("er"));
    }
}
