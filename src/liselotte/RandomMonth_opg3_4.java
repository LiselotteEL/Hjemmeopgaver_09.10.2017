package liselotte;
import java.util.*; //wildcard import - importerer alle classer fra package java.util

public class RandomMonth_opg3_4 {

    public static void main(String[] args) {


        Random tilfældigtTal = new Random(); //benytter Random classen, og opretter en variabel, som indeholder min constructor

        int tilfældigtTalMellem1og12 = tilfældigtTal.nextInt(13) + 1; //tilfældigtTal.nextInt() vil lave en tilfældig interger - (13) betyder at jeg laver en afgrænsning som går fra 1-12

        switch (tilfældigtTalMellem1og12) {

            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }


       }


    }