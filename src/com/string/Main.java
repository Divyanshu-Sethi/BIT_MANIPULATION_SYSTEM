package com.string;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        //bit manipulation
        Scanner scn = new Scanner(System.in);
        char choice;

      do{

        System.out.println("Enter the no. : ");
        int n = scn.nextInt();
        System.out.println("Enter the bit :");
        int bit = scn.nextInt();

        int pos = bit - 1;
        int bitmask = 1 << pos;
        System.out.println( "\n 1=get \n 2=set \n 3=clear \n 4=update");
        System.out.println(" Please Tell your Opted choice : ");
        int option = scn.nextInt();


            switch (option) {
                case 1 -> {
                    System.out.println("GET FUNCTION CALLED\n");
                    if ((bitmask & n) == 0) {
                        System.out.println("Bit is zero");
                    } else {
                        System.out.println("Bit is one");
                    }
                }
                case 2 -> {
                    System.out.println("SET FUNCTION CALLED\n");
                    int newnum1 = bitmask | n;
                    System.out.println(newnum1);
                }
                case 3 -> {
                    System.out.println("CLEAR FUNCTION CALLED\n");
                    bitmask = ~bitmask;
                    int newnum2 = bitmask & n;
                    System.out.println(newnum2);
                }
                case 4 -> {
                    System.out.println("UPDATE FUNCTION CALLED\n");
                    System.out.println("what number is present : ");
                    int cbit = scn.nextInt(); //0 or 1
                    if (cbit == 1) {
                        bitmask = ~bitmask;
                        int newnum3 = bitmask & n;
                        System.out.println(newnum3);
                    } else {
                        int newnum6 = bitmask | n;
                        System.out.println(newnum6);
                    }
                }
            }
          System.out.println("Do You Want To Continue(Y/N)");
          choice = scn.next().charAt(0);

      } while(choice == 'Y'|| choice == 'y');

    }

}
