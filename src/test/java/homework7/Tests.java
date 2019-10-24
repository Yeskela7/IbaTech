package homework7;

import homeworks.homework7.Family;
import homeworks.homework7.humans.Man;
import homeworks.homework7.humans.Woman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Man father;
    private Woman mother;
    private Family family;

    @Before
    public void before() {
        this.father = new Man("Pablo", "Escobar", 1949, 151);
        this.mother = new Woman("Victoria", "Escobar", 1955, 140);
        this.family = new Family(father, mother);
    }

    @Test
    public void testBornChild() {
        family.bornChild();
        assertEquals(3, family.countFamily());
        System.out.println("BornChild test Passed");
    }

    @Test
    public void testChildSurname() {
        family.bornChild();
        String chldSurname = family.getChildren()[0].getSurname();
        assertEquals(family.getFather().getSurname(), chldSurname);
    }

    @Test
    public void testAvrgIq() {
        family.bornChild();
        int childIq = family.getChildren()[0].getIq();
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
