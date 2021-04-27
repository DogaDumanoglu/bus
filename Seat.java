public class Seat {
    private int seatID;
    private boolean status;
    private Passenger passenger;

    Seat(int seatID, boolean status, Passenger passenger){
        this.seatID=seatID;
        this.status=status;
        this.passenger=passenger;
    }

    public int getSeatID() {
        return seatID;
    }
    public boolean getStatus() {
        return status;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public void Display_Seat(){
        System.out.println("Seat: " + seatID +" Status: Reserved ");
    }
}
