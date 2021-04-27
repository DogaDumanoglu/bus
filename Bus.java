public class Bus {
    private String plate;
    private int seatCount;
    private Seat[] seats;

    Bus(String plt, int sC) {
        plate = plt;
        seatCount = sC;
        seats = new Seat[seatCount];
        for (int i = 1; i < sC+1; i++) {
            seats[i-1] = new Seat(i, false, null);
        }
    }

    public String getPlate() {
        return plate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public boolean bookSeat(Passenger p, int seatID) {
        for (int i = 0; i < seatCount; i++) {
            if (seats[i].getSeatID() == seatID && !seats[i].getStatus()) {
                seats[i].setPassenger(p);
                seats[i].setStatus(true);
                return true;
            }
        }
        System.out.println("The seat has already reserved!");
        return false;
    }

    public void printAllPassengers() {
        for (int i = 0; i < seatCount; i++) {
            if (seats[i].getStatus()) {
                System.out.println("\n");
                seats[i].Display_Seat();
                seats[i].getPassenger().Display_passenger();
                seats[i].getPassenger().getPhone().Display_phone();
                System.out.println("\n");


            }
        }
    }
    public void cancelofbooking(int seatID){
        seats[seatID-1].setStatus(false);
    }

    public void printAllAvailableSeatIDs() {
        for (int i = 1; i < seatCount+1; i++) {
            if (!seats[i-1].getStatus()) {
                System.out.print(seats[i-1].getSeatID()+" ");
            }
        }
    }

    public boolean search(String name,String surname) {
        for (int i = 0; i < seatCount; i++) {
            if (seats[i].getStatus() && seats[i].getPassenger().getName().equals(name) && seats[i].getPassenger().getSurname().equals(surname)){
                seats[i].getPassenger().Display_passenger();
                seats[i].getPassenger().getPhone().Display_phone();
                return true; } }
        System.out.println("Passenger not found!!");
        return false;
    }

}

