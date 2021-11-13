package ru.mirea.practiceTwoClasses;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        name = n;
        email = e;
        if (g == 'F' | g == 'f' | g == 'M' | g == 'm') gender = g;
        else gender = 'U';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return this.name+" ("+this.gender+") at "+this.email;
    }
}
