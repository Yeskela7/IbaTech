package homeworks.homework12.dao.interfaces;

import homeworks.homework12.family.Family;

import java.util.ArrayList;

public interface FamilyDao {

    ArrayList<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    Family saveFamily(Family family);

}
