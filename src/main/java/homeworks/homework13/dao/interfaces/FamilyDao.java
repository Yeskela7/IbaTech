package homeworks.homework13.dao.interfaces;

import homeworks.homework13.family.Family;

import java.util.List;

public interface FamilyDao {

    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    void loadData(List<Family> families);

}
