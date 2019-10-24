package homeworks.homework9.family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
//TODO
    private final List<Family> familyList = new ArrayList<>();



    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public List getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        familyList.add(family);
    }
}
