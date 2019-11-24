package homeworks.homework13.humans;

import java.util.Arrays;
import java.util.List;

public class SurnameRandom {
    private final List<String> SurnameList = Arrays.asList(
            "Corbin", "Rollins", "Gibson ", "Navarro ",
            "Hardy", "Sparks", "Williams", "Gallagher", "Preston",
            "Foley", "Parks", "Downs", "Mejia", "Waller", "Delacruz",
            "Ray", "Melton", "Miranda", "Miles", "Leonard", "Donovan",
            "Marquez", "Wolfe", "Johns", "Peck", "Sosa", "Collins",
            "Roberson", "Davenport", "Li", "Skinner", "Wolf", "Hart",
            "Shields", "Lopez", "Hahn", "Mathis", "Hoffman", "Beasley",
            "Riley", "Blackburn", "Gonzalez", "Alvarez", "Tucker", "Shepherd",
            "Powell", "Cameron", "Floyd", "Lambert", "Steele", "Keller");

    public String getRandomSurname() {
        return SurnameList.get((int) (SurnameList.size() * Math.random()));
    }

}
