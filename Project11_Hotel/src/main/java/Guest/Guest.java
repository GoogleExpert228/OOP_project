package Guest;

import Rooms.HotelRoom;

public class Guest {
    private int Id;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String nationality;

    public Guest(int Id, String name, int age, String email, String phoneNumber, String nationality) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "Id='" + Id + '\'' +
                " name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
