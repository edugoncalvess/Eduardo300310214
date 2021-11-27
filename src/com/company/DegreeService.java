package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DegreeService  {


    public DegreesImplements dIObject = new DegreesImplements();

    int enteredQtyBTech, enteredQtyMTech, enteredQtyMS, enteredQtyPhD, totalPopulation;
    int pctBTech, pctMTech, pctMS, pctPhD;

    int randNumber;
    String randomicCategory;

    //public void InteractWithUser () throws ClassNotFoundException
    public void InteractWithUser () throws Exception{

        // Scanner defined to accept users inputs
        Scanner key = new Scanner(System.in);

        // Gathering quantity of students from each category
        System.out.println("Enter the number of B.Tech students");
        enteredQtyBTech = key.nextInt();
        //System.out.println("Value of enteredQtyBtech is " + enteredQtyBTech);
        System.out.println("Enter the number of M.Tech students");
        enteredQtyMTech = key.nextInt();
        System.out.println("Enter the number of M.S students");
        enteredQtyMS = key.nextInt();
        System.out.println("Enter the number of Ph.D students");
        enteredQtyPhD = key.nextInt();



        // Summing the total of students using the method contained in another class
        totalPopulation = dIObject.add(enteredQtyBTech, enteredQtyMTech, enteredQtyMS, enteredQtyPhD);

        //System.out.println("Value of total population is " + totalPopulation);

        System.out.println("The total students population is " + totalPopulation);






        // Exhibiting the percentages according to the category
        pctBTech = (int) enteredQtyBTech/totalPopulation * 100;
        //pctBTech = Integer.valueOf(enteredQtyBTech/totalPopulation * 100);
        //System.out.println("enteredQtyBTech is " + enteredQtyBTech + " and totalPopulation is " + totalPopulation + " so pctBTech is " + pctBTech);

        System.out.println("B.Tech percentage from total voting population is " + pctBTech + " percent");
        pctMTech = (int) enteredQtyMTech/totalPopulation * 100;
        System.out.println("M.Tech percentage from total voting population is " + pctMTech + " percent");
        pctMS = (int) enteredQtyMS/totalPopulation * 100;
        System.out.println("MS percentage from total voting population is " + pctMS + " percent");
        pctPhD = (int) enteredQtyPhD/totalPopulation * 100;
        System.out.println("Phd percentage from total voting population is " + pctPhD + " percent");






    }


    public void DefiningFairHost() {
        randNumber = dIObject.randomize();

        switch (randNumber) {
            case 1:
                randomicCategory = "B.Tech";
            case 2:
                randomicCategory = "M.Tech";
            case 3:
                randomicCategory = "MS";
            case 4:
                randomicCategory = "PhD";
        }

        System.out.println( randomicCategory + " students will host this year\'s fair.");
    }

}
