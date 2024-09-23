package CareemLogin;

import EnumsPackage.Enumss;
import EnumsPackage.Enumss.Response;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    private static String UserLoginName;

    public static void login() {

        System.out.println("*************");
        System.out.println("CAREEM LOGIN");
        System.out.println("*************");

        Scanner src = new Scanner(System.in);

        String usernamePattern = "ali";
        String passwordPattern = "123";

        System.out.println("Enter Username !!!");
        String username = src.nextLine();

        System.out.println("Enter Password");
        String password = src.nextLine();

        Pattern username1 = Pattern.compile(username);
        Matcher ConfirmUsername = username1.matcher(usernamePattern);
        Boolean Matched = ConfirmUsername.find();

        if (Matched == true) {

            if (username.equals(usernamePattern) && password.equals(passwordPattern)) {
                System.out.println(Response.Sucessfull);
                UserLoginName = username;
            } else {
                System.out.println("Login Failed");
                login();
            }
        }else {
            System.out.println(Response.Error);
            login();
        }
    }

    public static String GetLoggedInName() {

        return UserLoginName;

    }
}
