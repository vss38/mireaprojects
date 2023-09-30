package ru.mirea.it.ivbo;

public class TestAuthor extends Author {
    public TestAuthor(String person_name, String person_email, char person_gender) {
        super(person_name, person_email, person_gender);

        System.out.println("test get-methods:\n" + this.getName() + " " + this.getEmail() + " " + this.getGender());
        this.setEmail("new_email");
        System.out.println("\ntest toString method\n" + this.toString());
    }
}
