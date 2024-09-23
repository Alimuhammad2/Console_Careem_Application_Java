package Rides;
import CareemLogin.Login;
import RidesLocation.Location;
import java.time.LocalDateTime;
import java.util.*;
public class Rides implements IRides{

    static int distance = 0;

        public void PaymentMethod(){

            Scanner p1 = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("How You Pay Your Bill..!!");
            System.out.println("--------------------------");
//         int nu = p1.nextInt();

            ArrayList<String> paymentOptions = new ArrayList<>();
            paymentOptions.add(" Cash");

            for (int p = 0; p<paymentOptions.size();p++){
                System.out.println(p+paymentOptions.get(p));
            }
            System.out.println("------------------------");
            System.out.println("Enter Your Choice..!!");
            System.out.println("------------------------");

            int user = p1.nextInt();
            if (user == 0){
                System.out.println("--------------------------------------------------------------");
                System.out.println("You Select Cash Methode to Pay Bill..!!");
                System.out.println("--------------------------------------------------------------");
            }else {
                System.out.println("-----------------------------------");
                System.out.println("This Methode isn't Available..!!");
                System.out.println("-----------------------------------");
                PaymentMethod();
            }

        }
//        static int bill(int rupees)  {
//
//             // double total = rupees+start*perminutes+end*perkilometer;
//
//            Scanner ssr = new Scanner(System.in);
//
//            PaymentMethod();
//
////            System.out.println("-------------------------------");
////            System.out.println("Enter Total Amount of Bill..");
////            System.out.println("-------------------------------");
////            float bill = ssr.nextFloat();
////
////            System.out.println("-------------------------");
////            System.out.println("Receive from Customer..");
////            System.out.println("-------------------------");
////            float payment = ssr.nextFloat();
////
////          //  float balance = payment - (float) total;
////            System.out.println("-----------------------------------------------");
////            //System.out.println("Cashback to Customer: " + balance + " rupees");
////            System.out.println("-----------------------------------------------");
//////         bill-total;
////            System.out.println("");
////            System.out.println("");
////            String GetName =  Login.GetLoggedInName();
////            //String carname = rides.carname;
////            System.out.println("-----------------------------------------------------------");
////            System.out.println("                     EXPRESS RECEIPT                        ");
////            System.out.println("-----------------------------------------------------------");
////
////            System.out.println(" ");
////            System.out.println("   Your Name is: "+GetName + "");
////
////            LocalDateTime formattedDate = LocalDateTime.now();
////
////            System.out.println("   Current Date and Time: " + formattedDate + "");
////            System.out.println("   Total Minutes is: "+start + "");
////
////            System.out.println("   Your KiloMeters is: "+end+ "");
////            System.out.println("   "+rupees + " Rupees per Kilo meter" + "");
////           // System.out.println("   Your Ride bill is: "+total+ "");
////            System.out.println("   Receive From Customer: " + payment);
////         //   System.out.println("   Cashback to Customer: " + balance);
////            System.out.println(" ");
////            System.out.println("                    ...THANK YOU...             ");
////            System.out.println(" ");
////
////            System.out.println("-----------------------------------------------------------");
////            System.out.println("-----------------------------------------------------------");
//            return rupees;
//
//        }

    public static int business() {

            Scanner src = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Which one You Like to Take ..!!");
        System.out.println("---------------------------------");

        // Declare HashSet of vehicles
        HashSet<String> vehicles = new HashSet<>();

        // Add vehicles to the HashSet
        vehicles.add("0 Audi");
        vehicles.add("1 Mercedes");
        vehicles.add("2 Civic");
        vehicles.add("3 Revo");
        // Convert HashSet to array
        String[] vehiclesArray = vehicles.toArray(new String[0]);

        // Display the vehicles using a for loop

        for (int i = 0; i < vehiclesArray.length; i++) {
            System.out.println(vehiclesArray[i]);
        }

        Scanner b = new Scanner(System.in);

            System.out.println("---------------------------------");
            System.out.println("Enter You Choice ..!!!");
            System.out.println("---------------------------------");

            int n = b.nextInt();

            if (n == 0) {

                    System.out.println("---------------------------------");
                    System.out.println("You Selected Audi for Ride...");
                    System.out.println("---------------------------------");

                    Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(39);

            } else if (n == 1) {

                Scanner sc = new Scanner(System.in);
                System.out.println("---------------------------------");
                System.out.println("You Select Mercedes for Ride...");

                System.out.println("---------------------------------");

                distance = Location.location();

                Rides.receipt(35);

            } else if (n == 2) {

                Scanner sc = new Scanner(System.in);

                System.out.println("---------------------------------");

                System.out.println("You Select Civic for Ride ...");
                System.out.println("---------------------------------");

                distance = Location.location();

                Rides.receipt(31);


            } else if (n == 3) {

                Scanner sc = new Scanner(System.in);

                System.out.println("---------------------------------");
                System.out.println("You Select Revo for Ride ...");
                System.out.println("---------------------------------");

                distance = Location.location();

                Rides.receipt(29);

            }else {

                System.out.println("---------------------------------");
                System.out.println("Sorry Sir! We don't available this Vehicle .!!!");
                System.out.println("---------------------------------");
                rides();
            }
            return n;
        }
        public static void go(){

            System.out.println("---------------------------------");
            System.out.println("Which one You Like to Take ..!!");
            System.out.println("---------------------------------");

            ArrayList<String>vehicle = new ArrayList<>();

            vehicle.add("Swift");
            vehicle.add("Cultus");
            vehicle.add("Corolla");
            vehicle.add("New Alto");

            for (int g = 0; g< vehicle.size(); g++){
                System.out.println(g + vehicle.get(g));
            }

            Scanner g = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("Select You Choice ..!!!");
            System.out.println("---------------------------------");

            int users = g.nextInt();

            if (users == 0){
                System.out.println("---------------------------------");
                System.out.println("You Select Swift for Ride...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(25);


            } else if (users == 1) {

                System.out.println("---------------------------------");
                System.out.println("You Select Cultus for Ride...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(23);

            } else if (users == 2) {

                System.out.println("---------------------------------");
                System.out.println("You Select Corolla for Ride ...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(28);

            } else if (users == 3) {

                System.out.println("---------------------------------");
                System.out.println("You Select New Alto for Ride ...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(21);

            }else {
                System.out.println("------------------------------------------------");
                System.out.println("Sorry Sir! We don't available this Vehicle .!!!");
                System.out.println("------------------------------------------------");
                rides();
            }
        }
        public static void goMini(){

            System.out.println("---------------------------------");
            System.out.println("Which one You Like to Take ..!!");
            System.out.println("---------------------------------");

            LinkedList<String> vehicle = new LinkedList<>();

            vehicle.add("Mehran");
            vehicle.add("Khyber");

            for (int gm = 0; gm< vehicle.size(); gm++){
                System.out.println(gm + vehicle.get(gm));
            }

            Scanner gm = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("Enter You Choice ..!!!");
            System.out.println("---------------------------------");

            int miniuser = gm.nextInt();

            if (miniuser == 0){

                System.out.println("---------------------------------");
                System.out.println("You Select Mehran for Ride...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(19);


            } else if (miniuser == 1) {

                System.out.println("---------------------------------");
                System.out.println("You Select khyber for Ride...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(17);

            } else {
                System.out.println("------------------------------------------------");
                System.out.println("Sorry Sir! We don't available this Vehicle .!!!");
                System.out.println("------------------------------------------------");
                rides();
            }
        }

        public static void bike(){

            System.out.println("---------------------------------");
            System.out.println("Which one You Like to Take ..!!");
            System.out.println("---------------------------------");

            String bikes [] = {" Honda", " Unique"};

            for (int f = 0; f< bikes.length; f++){
                System.out.println(f+bikes[f]);
            }

            Scanner bik = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("Enter You Choice ..!!!");
            System.out.println("---------------------------------");

            int user = bik.nextInt();

            if (user == 0){

                System.out.println("---------------------------------");
                System.out.println("You Select Honda for Ride ...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(9);

            } else if (user == 1) {
                System.out.println("---------------------------------");
                System.out.println("You Select Unique for Ride ...");
                System.out.println("---------------------------------");
                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(8);

            } else {
                System.out.println("------------------------------------------------");
                System.out.println("Sorry Sir! We don't available this Vehicle .!!!");
                System.out.println("------------------------------------------------");
                rides();
            }
        }

        public static void rikshaw(){

            System.out.println("---------------------------------");
            System.out.println("Which one You Like to Take ..!!");
            System.out.println("---------------------------------");

            String riksh [] = {" TukTuk", " Sazgar"};

            for (int r = 0; r< riksh.length; r++){
                System.out.println(r+riksh[r]);
            }

            Scanner rik = new Scanner(System.in);

            System.out.println("---------------------------------");
            System.out.println("Enter You Choice ..!!!");
            System.out.println("---------------------------------");

            int user = rik.nextInt();

            if (user == 0){

                System.out.println("---------------------------------");
                System.out.println("You Select TukTuk for Ride ...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(11);

            } else if (user == 1) {

                System.out.println("---------------------------------");
                System.out.println("You Select Sazgar for Ride ...");
                System.out.println("---------------------------------");

                Scanner sc = new Scanner(System.in);

                distance = Location.location();

                Rides.receipt(13);

            } else {
                System.out.println("------------------------------------------------");
                System.out.println("Sorry Sir! We don't available this Vehicle .!!!");
                System.out.println("------------------------------------------------");
                rides();
            }
        }

        public static void receipt(int perminutes){

            Scanner sc = new Scanner(System.in);

            int start = 1;

            var bill = perminutes * distance;
            System.out.println("Total Price: " + bill + " rupees");

            System.out.println("-------------------------------");
            System.out.println("Enter Total Amount of Bill..");
            System.out.println("-------------------------------");
            var Bill = sc.nextFloat();

            System.out.println("-------------------------");
            System.out.println("Receive from Customer..");
            System.out.println("-------------------------");
            var payment = sc.nextFloat();

            float balance = payment - (float) bill;

            System.out.println("-----------------------------------------------");
            System.out.println("Cashback to Customer: " + balance + " rupees");
            System.out.println("-----------------------------------------------");

            String GetName =  Login.GetLoggedInName();

            System.out.println("-----------------------------------------------------------");
            System.out.println("                     EXPRESS RECEIPT                        ");
            System.out.println("-----------------------------------------------------------");

            System.out.println(" ");
            System.out.println("   Your Name is: "+GetName + "");
            LocalDateTime formattedDate = LocalDateTime.now();
            System.out.println("   Current Date and Time: " + formattedDate + "");
            System.out.println("   Total Minutes is: "+start + "");
            System.out.println("   KiloMeters is: "+ distance);
            System.out.println("   Your Ride bill is: "+bill+ "");
            System.out.println("   Receive From Customer: " + payment);
            System.out.println("   Cashback to Customer: " + balance);
            System.out.println(" ");
            System.out.println("                    ...THANK YOU...             ");
            System.out.println(" ");

            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");

        }

        public static void rides(){

            System.out.println("--------------------------------------");
            System.out.println("Which one You Like to go for Ride !!!");
            System.out.println("--------------------------------------");

            String type[] = {" Business"," Go", " Go Mini", " Bike", " Rikshaw"};

            for (int i = 0; i< type.length; i++){

                System.out.println(i + type[i]);

            }

            Scanner ss = new Scanner(System.in);

            System.out.println("---------------------------------");
            System.out.println("Select Ride");
            System.out.println("---------------------------------");

            int user = ss.nextInt();

            if (user == 0){
                System.out.println("---------------------------------");
                System.out.println("You Select Business Ride ...");
                System.out.println("---------------------------------");
                business();
            } else if (user == 1) {
                System.out.println("---------------------------------");
                System.out.println("You Select Go Ride ...");
                System.out.println("---------------------------------");
                go();
            } else if (user == 2) {
                System.out.println("---------------------------------");
                System.out.println("You Select Go Mini Ride ...");
                System.out.println("---------------------------------");
                goMini();

            } else if (user == 3) {
                System.out.println("---------------------------------");
                System.out.println("You Select Bike Ride ...");
                System.out.println("---------------------------------");
                bike();
            } else if (user == 4) {
                System.out.println("---------------------------------");
                System.out.println("You Select Rikshaw Ride ...");
                System.out.println("---------------------------------");
                rikshaw();
            } else {
                System.out.println("-------------------------------------");
                System.out.println("Sorry! Sir this is not Available !!!");
                System.out.println("-------------------------------------");
                rides();
            }
        }
}
