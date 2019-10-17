package homeworks.homework5;

import java.util.Random;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq = -1;
    private String[][] schedule;
    public Family family; //TODO private


    private String getFullName(){
        return name + " " + surname;
    }

    @Override
    public String toString() {if(name == null){
        return "no info\n";
    }else if (iq == -1){
        return "Human{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                "}";
    }else {
        return "Human{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                "}";}

    }

    Human() {
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }


}
