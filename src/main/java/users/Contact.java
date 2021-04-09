package users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {

    private long id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private boolean isActive;
    private String dateCreated;

    private static long idCounter = 0;

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public Contact(String name, String email, String address, String phoneNumber, boolean isActive) {
        this.id = idCounter++;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.dateCreated = formatter.format(new Date());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getDateCreated() {
        return dateCreated;
    }

}
