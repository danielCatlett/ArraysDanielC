package com.example;
import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        String[] cards=new String[22];
        String[] type=new String[22];
        int[] hp=new int[22];

        cards[0]="Chimchar";
        cards[1]="Chimchar";
        cards[2]="Chimchar";
        cards[3]="Chimchar";

        cards[4]="Monferno";
        cards[5]="Monferno";

        cards[6]="Infernape";
        cards[7]="Infernape";
        cards[8]="Infernape";
        cards[9]="Infernape Lv. X";

        cards[10]="Magikarp";
        cards[11]="Magikarp";
        cards[12]="Magikarp";
        cards[13]="Magikarp";

        cards[14]="Gyarados";
        cards[15]="Gyarados";
        cards[16]="Gyarados";

        cards[17]="Palkia G";
        cards[18]="Palkia G Lv. X";

        cards[19]="Arceus";

        cards[20]="Zangoose";

        cards[21]="Smoochum";


        hp[0]=40;
        hp[1]=50;
        hp[2]=50;
        hp[3]=50;

        hp[4]=70;
        hp[5]=70;

        hp[6]=110;
        hp[7]=110;
        hp[8]=120;

        hp[9]=120;

        hp[10]=30;
        hp[11]=30;
        hp[12]=30;
        hp[13]=30;

        hp[14]=130;
        hp[15]=130;
        hp[16]=130;

        hp[17]=100;
        hp[18]=120;

        hp[19]=90;

        hp[20]=80;

        hp[21]=30;


        type[0]="fire";
        type[1]="fire";
        type[2]="fire";
        type[3]="fire";

        type[4]="fire";
        type[5]="fire";

        type[6]="fire";
        type[7]="fire";
        type[8]="fire";
        type[9]="fire";

        type[10]="water";
        type[11]="water";
        type[12]="water";
        type[13]="water";

        type[14]="water";
        type[15]="water";
        type[16]="water";

        type[17]="water";
        type[18]="water";

        type[19]="water";

        type[20]="normal";

        type[21]="psychic";


        while(1==1)
        {
            System.out.println("Which card do you want to view? Enter number between 1 and 22.\nEnter -1 to exit.");
            int card=in.nextInt();
            card--;
            if(card>=0 && card<=21)
                printCard(card, cards, type, hp);
            else if(card==-2)
                break;
            else
                System.out.println("Invalid number, try again.");
        }
    }

    private static void printCard(int card, String[] cards, String[] type, int[] hp)
    {
        System.out.println("Card "+(card+1)+" is a "+cards[card]+".\nIt is a "+type[card]+" type, and has "+hp[card]+" hp.");
    }
}
