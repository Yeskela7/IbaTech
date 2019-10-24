package homeworks.homework9.family;

import java.util.List;

public interface FamilyDao {

    List<Family> getAllFamilies();

    List getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);
}
