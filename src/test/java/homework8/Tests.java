package homework8;

import homeworks.homework8.DayOfWeek;
import homeworks.homework8.Family;
import homeworks.homework8.humans.Man;
import homeworks.homework8.humans.Woman;
import homeworks.homework8.pets.Dog;
import homeworks.homework8.pets.Pet;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Man father;
    private Woman mother;
    private Family family;
    private Pet pet;

    @Before
    public void before() {
        HashSet<String> habits = new HashSet<String>() {
        };
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {
        };
        this.pet = new Dog("Boss", 2, 23, habits);
        this.father = new Man("Pablo", "Escobar", 1949, 151, schedule);
        this.mother = new Woman("Victoria", "Escobar", 1955, 140);
        this.family = new Family(father, mother, pet);

    }

    @Test
    public void testAddingHabits1() {
        pet.getHabits().add("play");
        assertEquals(true, pet.getHabits().contains("play"));
        System.out.println("AddingHabits test Passed");
    }

    @Test
    public void testAddingHabits2() {
        pet.getHabits().add("jump");
        assertEquals(false, pet.getHabits().contains("play"));
        System.out.println("AddingHabits2 test Passed");
    }

    @Test
    public void testSchedule() {
        father.getSchedule().put(DayOfWeek.MONDAY, "repair");
        assertEquals("repair", father.getSchedule().get(DayOfWeek.MONDAY));
        System.out.println("Schedule test Passed");
    }

    @Test
    public void testChildSurname() {
        family.bornChild();
        String childSurname = family.getChildren().get(0).getSurname();
        assertEquals(family.getFather().getSurname(), childSurname);
    }

    @Test
    public void testAvrgIq() {
        family.bornChild();
        int childIq = family.getChildren().get(0).getIq();
        assertEquals(145, childIq);
        System.out.println("AvrgIq test Passed");
    }

    @Test
    public void testDeleteAfterBorn() {
        family.bornChild();
        family.deleteChild(0);
        assertEquals(2, family.countFamily());
        System.out.println("deleteChild test Passed");
    }

    @Test
    public void countFamily() {
        family.bornChild();
        family.bornChild();
        family.bornChild();
        assertEquals(5, family.countFamily());
        System.out.println("countFamily test Passed");
    }


}
