package javafx.contacts.entity;

/**
 * Created by kyojin on 08.06.17.
 */
public class User {

    private String name;
    private String surname;
    private String phone;
    private String email;
    private String other;
    private String id;

    public User(String name, String surname, String phone, String email, String other) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.other = other;
    }



    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + "\n" + "Phone: " + phone + " E-mail: " + email + "\n" +"Other: \n" + other + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
