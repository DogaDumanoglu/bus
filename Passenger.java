public class Passenger {
    private String surname;
    private String gender;
    private String name;
    private Phone phone;

    Passenger(String name,String surname, String gender, Phone phone){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(Phone phone) {
        this.phone= phone;
    }
    public void Display_passenger(){
        System.out.println(name+" "+surname+" "+ "("+ gender+")");

    }
}
