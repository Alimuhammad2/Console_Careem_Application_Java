package RidesLocation;

import java.util.HashMap;
import java.util.Scanner;

public class Location implements ILocation {

        public static int location() {

            System.out.println("Enter Your Destination Where you Gooo");
            Scanner sc = new Scanner(System.in);

            HashMap<Integer, String> Cars = new HashMap<>();
            Cars.put(1, "17KM Gulistan-e-Johar to Indus University\n");
            Cars.put(2, "35KM Gulistan-e-Johar to Iqra University\n");
            Cars.put(3, "70KM Gulistan-e-Johar to FAST University\n");

            System.out.println(Cars);

            Scanner src = new Scanner(System.in);
            int u = src.nextInt();
            if (u==1){
                System.out.println(Cars.get(1));
            } else if (u==2){
                System.out.println(Cars.get(2));
            } else if (u==3) {
                System.out.println(Cars.get(3));
            }else {
                System.out.println("Wrong Input");
                location();
            }
            if (Cars.containsKey(u)) {
                System.out.println(Cars.get(u));
                return Integer.parseInt(Cars.get(u).split("KM")[0]); // Extract distance
            } else {
                System.out.println("Wrong Input");
                return location(); // Retry if input is invalid
            }
        }

}
