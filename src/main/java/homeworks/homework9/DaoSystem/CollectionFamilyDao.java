package homeworks.homework9.DaoSystem;

import homeworks.homework9.family.Family;
import homeworks.homework9.humans.*;
import homeworks.homework9.pets.Pet;

import java.util.ArrayList;

public class CollectionFamilyDao implements FamilyDao {

    private final ArrayList<Family> familyList = new ArrayList<>();

    @Override //TODO Done
    public ArrayList<Family> getAllFamilies() {
        return familyList;
    }

    @Override //Done
    public Family getFamilyByIndex(int index) {
        try{
        return familyList.get(index);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Wrong Index");
            return null;
        }
    }

    @Override //Done
    public boolean deleteFamily(int index) {
        try{
            familyList.remove(index);
            return true;
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Wrong Index");
            return false;
        }
    }

    @Override //Done
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    @Override //Done
    public void saveFamily(Family family) {
        if(familyList.contains(family)){
            familyList.set(familyList.indexOf(family), family);
        }else {
            familyList.add(family);
        }
    }
// TODO Перенести нижеидущие методы в FamilyService. в FamilyDao и CFDao добавить необходимые.
//
//    public ArrayList<Family> getAllFamilies();
//
//    @Override //Done
//    public void displayAllFamilies() {
//        familyList.forEach(family -> System.out.printf("Index: %d %s \n",familyList.indexOf(family),family));
//    }
//
//
//    @Override //Done
//    public void getFamiliesBiggerThan(int familySize) {
//        familyList.forEach(family -> { if(family.countFamily() > familySize)
//        {System.out.println(family); }});
//    }
//
//    @Override //Done
//    public void getFamilyLessThan(int familySize) {
//        familyList.forEach(family -> { if(family.countFamily() < familySize)
//        {System.out.println(family); }});
//    }
//
//    @Override //Done
//    public void countFamiliesWithMemberNumber(int familySize) {
//        System.out.println(familyList.stream().filter(family -> family.countFamily() == familySize).count());
//    }
//
//    @Override //Done
//    public void createNewFamily(Human human1, Human human2) {
//        familyList.add(new Family(human1,human2));
//    }
//
//     public boolean deleteFamily(int index);
//
//    @Override //Done
//    public void bornChild(Family family, String manName, String womanName) {
//        int random = (int) (Math.random() * 100);
//        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
//        int year = (int) (Math.random() * 10 + 19 + family.getMother().getYear());
//        if (random <= 50) {
//            ManNames name = new ManNames();
//            Man childMan = new Man(manName, family.getFather().getSurname(), year, iq);
//            family.addChild(childMan);
//        } else {
//            WomanNames name = new WomanNames();
//            Woman childWoman = new Woman(womanName, family.getFather().getSurname(), year, iq);
//            family.addChild(childWoman);
//        }
//        this.saveFamily(family);
//    }
//
//    @Override //Done
//    public void adoptChild(Family family, Human child) {
//        family.addChild(child);
//        this.saveFamily(family);
//    }
//
//    @Override //Done
//    public void deleteAllChildrenOlderThen(int age) {
//        for (Family family : familyList) {
//            family.getChildren().removeIf(human -> (2020 - human.getYear()) < age);
//            this.saveFamily(family);
//        }
//    }
//
//    @Override //Done
//    public void count() {
//        System.out.printf("Number of family in list: %d\n",familyList.size());
//    }
//
//    @Override //DONE
//    public ArrayList<Pet> getPets(int index) {
//        return familyList.get(index).getPet();
//    }
//
//    @Override //Done
//    public void addPet(int index, Pet pet) {
//        familyList.get(index).getPet().add(pet);
//        this.saveFamily(familyList.get(index));
//    }


}
