package homeworks.homework12.dao.controller;

import homeworks.homework12.dao.service.FamilyService;
import homeworks.homework12.family.Family;
import homeworks.homework12.humans.Human;
import homeworks.homework12.pets.Pet;

import java.text.ParseException;
import java.util.ArrayList;

public class FamilyController {

    private FamilyService familyService = new FamilyService();

    public ArrayList<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int size) {
        familyService.getFamiliesBiggerThan(size);
    }

    public void getFamilyLessThan(int size) {
        familyService.getFamilyLessThan(size);
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

    public Family bornChild(int index, String manName, String womanName) throws ParseException {
        return familyService.bornChild(index, manName, womanName);
    }

    public Family adoptChild(int index, Human child) {
        return familyService.adoptChild(index, child);
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

    public void createFamilies(int number) throws ParseException {
        familyService.createFamilies(number);
    }
}
