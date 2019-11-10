package homeworks.homework12.dao.collection;

import homeworks.homework12.dao.interfaces.FamilyDao;
import homeworks.homework12.family.Family;

import java.util.ArrayList;

public class CollectionFamilyDao implements FamilyDao {

    private ArrayList<Family> familyList = new ArrayList<>();

    @Override
    public ArrayList<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return familyList.get(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong Index");
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            familyList.remove(index);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong Index");
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    @Override
    public Family saveFamily(Family family) {
        if (familyList.contains(family)) {
            familyList.set(familyList.indexOf(family), family);
        } else {
            familyList.add(family);
        }
        return family;
    }
}
