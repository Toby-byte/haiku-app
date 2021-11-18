package data;

import haikuanalysis.HaikuAnalysisEngine;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Haiku_Input_Data {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();

        String[] input1Array = input1.split(" ");
        String[] input2Array = input2.split(" ");
        String[] input3Array = input3.split(" ");

        List<String> list1 = Arrays.asList(input1Array);
        List<String> list2 = Arrays.asList(input2Array);
        List<String> list3 = Arrays.asList(input3Array);

        int antalstavelser = 0;
        for (int i = 0; i < list1.size(); i++) {

            String word = list1.get(i)+" ";

            antalstavelser = antalstavelser + HaikuAnalysisEngine.antalStavelser(HaikuAnalysisEngine.stringToArrayList(word));
        }

        for (int i = 0; i < list1.size(); i++) {

            String word = list2.get(i)+" ";

            antalstavelser = antalstavelser + HaikuAnalysisEngine.antalStavelser(HaikuAnalysisEngine.stringToArrayList(word));
        }

        for (int i = 0; i < list1.size(); i++) {

            String word = list3.get(i)+" ";

            antalstavelser = antalstavelser + HaikuAnalysisEngine.antalStavelser(HaikuAnalysisEngine.stringToArrayList(word));
        }

        if (antalstavelser == 17) {
            System.out.println("This is a haiku");
        } else if (antalstavelser != 17 ) {
            System.out.println("Not a haiku");
        }
    }

}
