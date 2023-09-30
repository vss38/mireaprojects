package ru.mirea.it.ivbo;

public class Author {
    private String person_name;
    private String person_email;
    private char person_gender;


    public Author(String person_name, String person_email, char person_gender) {
        this.person_name = person_name;
        this.person_email = person_email;
        this.person_gender = person_gender;
    }

    public String getName() {
        return person_name;
    }

    public String getEmail() {
        return person_email;
    }

    public char getGender() {
        return person_gender;
    }

    public void setEmail(String email) {
        this.person_email = email;
    }

    public String toString() {
        String result;
        result = "Name: " + getName() + "; Email: " + getEmail() + "; Gender: " + getGender();
        return result;
    }
}
