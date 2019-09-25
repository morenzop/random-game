import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
public class Random {
    public static void main(String[] args) {


        double randNumber = Math.random();
        double d = randNumber * 10;
        long num = Math.round(d);
        System.out.println(num);

        ArrayList<Integer> avg = new ArrayList<Integer>();

        Scanner rndm = new Scanner(System.in);


            while (true) {
            System.out.println("Try to guess my number");
            int userInput = rndm.nextInt();
            if (avg.contains(userInput)) {

            }
            if (userInput < num) {
                System.out.println("Too Small");
                avg.add(userInput);
            } else if (num < userInput) {
                System.out.println("Too Large");
                avg.add(userInput);
            } else if (userInput == num) {
                System.out.println("Correct Answer");


                break;
            }
        }
            System.out.println(avg.size() + " Wrong Answers");

        }

        }








