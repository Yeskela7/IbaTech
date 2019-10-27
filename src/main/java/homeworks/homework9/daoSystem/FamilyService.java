package homeworks.homework9.daoSystem;

import homeworks.homework9.family.Family;
import homeworks.homework9.humans.*;
import homeworks.homework9.pets.Pet;

import java.util.ArrayList;

public class FamilyService{

    private FamilyDao familyDao = new CollectionFamilyDao();

    public ArrayList<Family> getAllFamilies() {
        return (ArrayList<Family>) familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(family ->
                System.out.printf("Index: %d %s \n",getAllFamilies().indexOf(family),family));
    }

    public ArrayList<Family> getFamiliesBiggerThan(int familySize) {
        ArrayList<Family> familiesBiggerThan = new ArrayList<>();
        familyDao.getAllFamilies().forEach(family ->
        {if(family.countFamily() > familySize) familiesBiggerThan.add(family);});
        System.out.println(familiesBiggerThan);
        return familiesBiggerThan;
    }

    public ArrayList<Family> getFamilyLessThan(int familySize) {
        ArrayList<Family> familiesLessThan = new ArrayList<>();
        familyDao.getAllFamilies().forEach(family ->
        { if(family.countFamily() < familySize) familiesLessThan.add(family);});
        System.out.println(familiesLessThan);
        return familiesLessThan;
    }

    public int countFamiliesWithMemberNumber(int familySize) {
        return (int) familyDao.getAllFamilies().stream().filter(family ->
                family.countFamily() == familySize).count();
    }

    public void createNewFamily(Human human1, Human human2) {
        Family family = new Family(human1, human2);
        familyDao.saveFamily(family);
    }

    public void deleteFamilyByIndex(int index){
        familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String manName, String womanName) {
        int random = (int) (Math.random() * 100);
        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        int year = (int) (Math.random() * 10 + 18 + family.getMother().getYear());
        if (random <= 50) {
            Man childMan = new Man(manName, family.getFather().getSurname(), year, iq);
            family.addChild(childMan);
        } else {
            Woman childWoman = new Woman(womanName, family.getFather().getSurname(), year, iq);
            family.addChild(childWoman);
        }
        return familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        for (Family family : familyDao.getAllFamilies()) {
            family.getChildren().removeIf(human -> (2020 - human.getYear()) > age);
            familyDao.saveFamily(family);
        }
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return familyDao.getFamilyByIndex(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyDao.getAllFamilies().get(index).getPet();
    }

    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies().get(index).getPet().add(pet);
        familyDao.saveFamily(familyDao.getAllFamilies().get(index));
    }

    public void addFamily(Family family){
        familyDao.saveFamily(family);
    }
}
