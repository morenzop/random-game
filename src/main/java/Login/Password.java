package Login;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Username Please");
            String userInput = in.nextLine();
            if(userInput.equalsIgnoreCase("alice") || userInput.equalsIgnoreCase("bob")){
                System.out.println("Hello " + userInput);
                break;
            }else{
                System.out.println("Try Again");

            }



        }

    }
}
