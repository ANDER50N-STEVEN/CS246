package anderson;

import java.util.Scanner;

import static anderson.NSALoginController.hashUserPassword;
import static anderson.NSALoginController.verifyPassword;

public class Test {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("Please enter your password ") ;
        String password = input.next();
        User NewUser = new User(password);
        NewUser.printInfo();
        hashUserPassword(NewUser);
        NewUser.printInfo();
        System.out.println("Please verify your password ");
        String verify = input.next();
        NewUser.setPassword(verify);
        if (!verifyPassword(NewUser)){
            System.out.print("Your password is incorrect") ;
        } else {
            System.out.print("Your password is correct");
        }
    }
}
