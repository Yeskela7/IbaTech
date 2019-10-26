package homeworks.homework9.DaoSystem;

import homeworks.homework9.family.Family;
import homeworks.homework9.humans.Human;
import homeworks.homework9.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public interface FamilyDao {

    void getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    ////////

    public void getFamiliesBiggerThan(int familySize);

    public void getFamilyLessThan(int familySize);

    public void countFamiliesWithMemberNumber(int familySize);

    public void createNewFamily(Human human1, Human human2);

    public void deleteFamilyByIndex(int index);

    public void bornChild(Family family, String manName, String womanName);

    public void adoptChild(Family family, Human child);

    public void deleteAllChildrenOlderThen(int age);

    public void count();

    public Family getFamilyById(int index);

    public ArrayList<Pet> getPets(int index);

    public void addPet(int index, Pet pet);

}
