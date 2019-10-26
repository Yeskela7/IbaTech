package homework9;

import homeworks.homework9.DaoSystem.CollectionFamilyDao;
import homeworks.homework9.family.Family;
import homeworks.homework9.humans.Man;
import homeworks.homework9.humans.Woman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Man man1;
    private Woman woman1;
    private Man man2;
    private Woman woman2;
    private CollectionFamilyDao collectionFamilyDao;
    private Family family1;
    private Family family2;

    @Before
    public void before() {
        this.man1 = new Man("Frank", "Sinatra", 1968);
        this.woman1 = new Woman("Barbara", "Sinatra", 1970);
        this.man2 = new Man("Jack", "Smith", 1990);
        this.woman2 = new Woman("Amanda","Smith",1991);
        this.collectionFamilyDao = new CollectionFamilyDao();
        this.family1 = new Family(man1,woman1);
        this.family2 = new Family(man2, woman2);

    }

    @Test
    public void testSaveFamily_1() {
    }

    @Test
    public void testGetAllFamilies() {

        System.out.println("GetAllFamilies test Passed");
    }



}
