package data;

import ui.Menu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HaikuWriter {
    public static void main(String[] args) {
        // Dette er et stykke kode som Vil starte fra sidste linje
        // og vil dermed ikke fjerne hvad du har skrevet før.
        try(
                FileWriter fw = new FileWriter("Resources/Haiku_dataBase.csv", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)){
            out.println(Menu.welcomeUser());
        }catch(
                IOException e){
            System.out.println("Can't write to this file");
        }
    }
    //Responsibility to write haiku poems as a file to haikus folder

}
