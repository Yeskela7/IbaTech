package homework9;

import homeworks.homework9.dao.collection.CollectionFamilyDao;
import homeworks.homework9.dao.service.FamilyService;
import homeworks.homework9.family.Family;
import homeworks.homework9.humans.Man;
import homeworks.homework9.humans.Woman;
import homeworks.homework9.pets.Dog;
import homeworks.homework9.pets.Pet;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Man man1;
    private Woman woman1;
    private Man man2;
    private Woman woman2;
    private Man child1;
    private Woman child2;
    private CollectionFamilyDao collectionFamilyDao;
    private FamilyService familyService;
    private Family family1;
    private Family family2;
    private Pet pet;
    private HashSet<String> habits;

    @Before
    public void before() {
        this.man1 = new Man("Frank", "Sinatra", 1968);
        this.woman1 = new Woman("Barbara", "Sinatra", 1970);
        this.man2 = new Man("Jack", "Smith", 1990);
        this.woman2 = new Woman("Amanda", "Smith", 1991);
        this.child1 = new Man("Finn", "Child", 1995);
        this.child2 = new Woman("Flora", "Child", 1991);
        this.familyService = new FamilyService();
        this.family1 = new Family(man1, woman1);
        this.habits = new HashSet<String>() {{
            add("eat");
            add("play");
        }};
        this.pet = new Dog("Boss", 2, 23, habits);

    }


    @Test
    public void testGetAllFamilies() {
        familyService.addFamily(family1);
        assertEquals(1, familyService.getAllFamilies().size());

    }

    @Test
    public void testGetFamiliesBiggerThan() {
        familyService.addFamily(family1);
        this.family1.addChild(child1);
        assertEquals(1, familyService.getFamiliesBiggerThan(2).size());
        assertEquals(0, familyService.getFamiliesBiggerThan(3).size());
    }

    @Test
    public void testGetFamiliesLessThan() {
        familyService.addFamily(family1);
        this.family1.addChild(child1);
        assertEquals(0, familyService.getFamilyLessThan(2).size());
        assertEquals(1, familyService.getFamilyLessThan(4).size());
    }

    @Test
    public void testCountFamiliesWithMemberNumber() {
        familyService.addFamily(family1);
        this.family1.addChild(child1);
        assertEquals(1, familyService.countFamiliesWithMemberNumber(3));
        assertEquals(0, familyService.countFamiliesWithMemberNumber(4));
    }

    @Test
    public void testCreateNewFamily() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.createNewFamily(man2, woman2);
        assertEquals(1, familyService.getAllFamilies().size());
    }

    @Test
    public void testDeleteFamilyByIndex() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.createNewFamily(man2, woman2);
        assertEquals(1, familyService.getAllFamilies().size());
        familyService.deleteFamilyByIndex(0);
        assertEquals(0, familyService.getAllFamilies().size());
    }

    @Test
    public void testBornChild() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.bornChild(family1, "Mark", "Fiona");
        assertEquals(1, familyService.getFamilyById(0).getChildren().size());
    }

    @Test
    public void testAdoptChild() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.adoptChild(family1, child1);
        assertEquals(1, familyService.getFamilyById(0).getChildren().size());
    }

    @Test
    public void testDeleteAllChildrenOlderThen() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.adoptChild(family1, child1);
        assertEquals(1, familyService.getFamilyById(0).getChildren().size());
        familyService.deleteAllChildrenOlderThen(30);
        assertEquals(1, familyService.getFamilyById(0).getChildren().size());
        familyService.deleteAllChildrenOlderThen(10);
        assertEquals(0, familyService.getFamilyById(0).getChildren().size());
    }

    @Test
    public void testCount() {
        assertEquals(0, familyService.getAllFamilies().size());
        familyService.createNewFamily(man2, woman2);
        assertEquals(1, familyService.count());
    }

    @Test
    public void testAddPetAndGetPet() {
        familyService.createNewFamily(man2, woman2);
        assertEquals(0, familyService.getPets(0).size());
        familyService.addPet(0, pet);
        assertEquals(1, familyService.getPets(0).size());
    }
}
