package homeworks.homework12.dao.service;

import homeworks.homework12.DateConverter;
import homeworks.homework12.dao.collection.CollectionFamilyDao;
import homeworks.homework12.dao.interfaces.FamilyDao;
import homeworks.homework12.exceptions.FamilyOverflowException;
import homeworks.homework12.family.Family;
import homeworks.homework12.family.FamilyBuilder;
import homeworks.homework12.humans.Human;
import homeworks.homework12.humans.Man;
import homeworks.homework12.humans.Woman;
import homeworks.homework12.pets.Pet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;

public class FamilyService {

    private FamilyDao familyDao = new CollectionFamilyDao();

    public ArrayList<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(family ->
                System.out.printf("*** Index: #%d --- %s %s \n", getAllFamilies().indexOf(family) + 1,
                        family.getFather().getSurname(), family));
    }

    public void getFamiliesBiggerThan(int familySize) {
        if (familySize < 0) return;
        familyDao.getAllFamilies().stream().filter(family -> family.countFamily() > familySize).forEach(System.out::println);
    }

    public void getFamilyLessThan(int familySize) {
        if (familySize < 0) return;
        familyDao.getAllFamilies().stream().filter(family -> family.countFamily() < familySize).forEach(System.out::println);
    }

    public int countFamiliesWithMemberNumber(int familySize) {
        return (int) familyDao.getAllFamilies().stream().filter(family ->
                family.countFamily() == familySize).count();
    }

    public void createNewFamily(Human human1, Human human2) {
        Family family = new Family(human1, human2);
        familyDao.saveFamily(family);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index - 1);
    }

    public void bornChild(int index, String manName, String womanName) throws ParseException {
        int random = (int) (Math.random() * 100);
        Family family = familyDao.getFamilyByIndex(index - 1);
        if (family.countFamily() >= 4) throw new FamilyOverflowException
                ("Family overflow, number of member must be no more than 4");
        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        String year = DateConverter.millsToString((long) (Calendar.getInstance().
                getTimeInMillis() * ((Math.random() * 0.3) + 0.7)));
        if (random <= 50) {
            Man childMan = new Man(manName, family.getFather().getSurname(), year, iq);
            family.addChild(childMan);
        } else {
            Woman childWoman = new Woman(womanName, family.getFather().getSurname(), year, iq);
            family.addChild(childWoman);
        }
        familyDao.saveFamily(family);
    }

    public void adoptChild(int index, Human child) {
        Family family = familyDao.getFamilyByIndex(index - 1);
        if (family.countFamily() >= 4) throw new FamilyOverflowException
                ("Family overflow, number of member must be no more than 4");
        family.addChild(child);
        child.setSurname(family.getFather().getSurname());
        familyDao.saveFamily(family);
    }

    public void deleteAllChildrenOlderThen(int age) {
        for (Family family : familyDao.getAllFamilies()) {
            family.getChildren().removeIf(human -> (Calendar.YEAR - human.getAge()) > age);
            familyDao.saveFamily(family);
        }
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index - 1);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyDao.getAllFamilies().get(index - 1).getPet();
    }

    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies().get(index - 1).getPet().add(pet);
        familyDao.saveFamily(familyDao.getAllFamilies().get(index - 1));
    }

    public void addFamily(Family family) {
        familyDao.saveFamily(family);
    }

    public void createFamilies(int number) throws ParseException {
        FamilyBuilder familyBuilder = new FamilyBuilder();
        for (int i = 0; i < number; i++) {
            Family family = familyBuilder.build();
            int chance = (int) (Math.random() * 100);
            if (chance > 45) family.bornChild();
            if (chance > 75) family.bornChild();
            familyDao.saveFamily(family);
        }
    }

}
