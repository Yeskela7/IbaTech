package homeworks.homework10.dao.controller;

import homework10.dao.service.FamilyService;
import homeworks.homework10.family.Family;
import homeworks.homework10.humans.Human;
import homeworks.homework10.pets.Pet;

import java.util.ArrayList;

public class FamilyController {

    private FamilyService familyService = new FamilyService();

    public ArrayList<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public ArrayList<Family> getFamiliesBiggerThan(int size) {
        return familyService.getFamiliesBiggerThan(size);
    }

    public ArrayList<Family> getFamilyLessThan(int size) {
        return familyService.getFamilyLessThan(size);
    }

    public int countFamiliesWithMemberNumber(int familySize) {
        return familyService.countFamiliesWithMemberNumber(familySize);
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String manName, String womanName) {
        return familyService.bornChild(family, manName, womanName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }

    public void addFamily(Family family) {
        familyService.addFamily(family);
    }
}
