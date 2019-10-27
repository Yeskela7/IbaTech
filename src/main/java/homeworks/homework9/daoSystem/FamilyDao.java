package homeworks.homework9.daoSystem;

import homeworks.homework9.family.Family;

import java.util.List;

public interface FamilyDao {

    public List<Family> getAllFamilies();

    public Family getFamilyByIndex(int index);

    public boolean deleteFamily(int index);

    public boolean deleteFamily(Family family);

    public Family saveFamily(Family family);

}
