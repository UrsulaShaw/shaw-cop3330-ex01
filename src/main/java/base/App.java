package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // input
        System.out.print("What is your name?\n");
        String name = in.nextLine();

        // concatenation
        String outputString = "Hello, " + name + ", nice to meet you!";

        //output
        System.out.println(outputString);
    }
}
