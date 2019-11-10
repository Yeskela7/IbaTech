package homeworks.homework12.humans;

import java.util.Arrays;
import java.util.List;

public class WomanNames {
    private final List<String> womanNames = Arrays.asList(
            "Adelaida", "Barbara", "Bebe",
            "Belkis", "Carie", "Charlesetta",
            "Charlott", "Cheree", "Cleta",
            "Cornelia", "Edwina", "Elizebeth",
            "Franchesca", "Francoise", "Hiedi",
            "Jetta", "Josphine", "Jovan",
            "Julia", "Katelynn", "Kerrie",
            "Latonia", "Laurel", "Leda",
            "Louisa", "Margret", "Mazie",
            "Micaela", "Minta", "Mirtha",
            "Nam", "Naomi", "Nicki",
            "Olga", "Perla", "Petra",
            "Portia", "Racquel", "Sadie",
            "Samella", "Sarah", "Sook",
            "Stepanie", "Suzie", "Tessie",
            "Theressa", "Thersa", "Tracee",
            "Wei", "Zenobia");

    public String getWomanName() {
        return womanNames.get((int) (womanNames.size() * Math.random()));
    }
}
