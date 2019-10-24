package homeworks.homework9.humans;

import java.util.Arrays;
import java.util.List;

public class ManNames {

    private final List<String> manNames = Arrays.asList(
            "Adan", "Adolph", "Alex",
            "Angelo", "Armand", "Arnoldo",
            "Aubrey", "August", "Bernard",
            "Casey", "Clair", "Clay",
            "Clyde", "Damion", "Danny",
            "Dante", "Edison", "Elton",
            "Forest", "Foster", "Frankie",
            "Garland", "Hector", "Hilton",
            "Jacob", "Jeremiah", "Kelvin",
            "Kenton", "Leo", "Marcus",
            "Matthew", "Mikel", "Milan",
            "Millard", "Modesto", "Neville",
            "Newton", "Odis", "Paul",
            "Percy", "Reed", "Russell",
            "Sammie", "Santos", "Stanford",
            "Stefan", "Thanh", "Tod",
            "Wayne", "Xavier");

    public String getManName() {
        return manNames.get((int) (manNames.size() * Math.random()));
    }
}
