package homeworks.homework9.DaoSystem;

import homeworks.homework9.family.Family;
import homeworks.homework9.humans.Human;
import homeworks.homework9.pets.Pet;

import java.util.ArrayList;

public interface FamilyDao {

    public ArrayList<Family> getAllFamilies();

    public Family getFamilyByIndex(int index);

    public boolean deleteFamily(int index);

    public boolean deleteFamily(Family family);

    public void saveFamily(Family family);

//    public ArrayList<Family> getAllFamilies();

//    public void displayAllFamilies();
//
//    public void getFamiliesBiggerThan(int familySize);
//
//    public void getFamilyLessThan(int familySize);
//
//    public void countFamiliesWithMemberNumber(int familySize);
//
//    public void createNewFamily(Human human1, Human human2);
//
//    public boolean deleteFamily(int index);
//
//    public void bornChild(Family family, String manName, String womanName);
//
//    public void adoptChild(Family family, Human child);
//
//    public void deleteAllChildrenOlderThen(int age);
//
//    public void count();
//
//    public ArrayList<Pet> getPets(int index);
//
//    public void addPet(int index, Pet pet);

}
