import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Bus myBus = new Bus("06 HUBM 06", 42);
        String choose = " ";
        Scanner scanner = new Scanner(System.in);
        while (!choose.equals("6")) {
            System.out.println("\nMenu\n" +
                    "1-Book a seat\n" +"2-Cancel booking\n"+
                    "3-Display all passengers with their seat numbers\n" +
                    "4-Display all available seatIDs\n" +
                    "5-Search\n"+
                    "6-Exit\n");
            System.out.print("Enter your choose: ");
            choose = scanner.nextLine();
            if (choose.equals("1")) {
                System.out.print("Enter seat id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter surname: ");
                String surname = scanner.nextLine();
                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();
                System.out.print("Enter country code: ");
                String countrycode = scanner.nextLine();
                System.out.print("Enter code: ");
                String code = scanner.nextLine();
                System.out.print("Enter number: ");
                String number = scanner.nextLine();
                while(number.length()!=7){
                    System.out.println("Make sure that your phone is 7 digits!");
                    System.out.print("Enter your number again: ");
                    String numb = scanner.nextLine();
                    number=numb;
                }
                Phone phone;
                System.out.print("Enter type: ");
                String type = scanner.nextLine();
                if(!countrycode.isEmpty()){
                    phone = new Phone(countrycode, code, number, type);}
                else{
                phone = new Phone(code, number, type);}
                Passenger passenger1 = new Passenger(name, surname, gender, phone);
                myBus.bookSeat(passenger1, id); }
                else if (choose.equals("2")){
                System.out.print("Enter the seat that you want to cancel: ");
                int c_seat = scanner.nextInt();
                scanner.nextLine();
                myBus.cancelofbooking(c_seat); }
                else if (choose.equals("3")) {
                myBus.printAllPassengers(); }
                else if (choose.equals("4")) {
                myBus.printAllAvailableSeatIDs(); }
                else if (choose.equals("5")) {
                System.out.print("Enter name: ");
                String s_name = scanner.nextLine();
                System.out.print("Enter surname: ");
                String s_surname = scanner.nextLine();
                myBus.search(s_name,s_surname);}
                else if (choose.equals("6")) { break; }
                }
        }
    }

