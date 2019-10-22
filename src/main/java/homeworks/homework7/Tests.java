package homeworks.homework7;

import homeworks.homework7.humans.Human;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Human father;
    private Human mother;
    private Human child1;
    private Family family;

    @Before
    public void before() {
        this.father = new Human("Pablo", "Escobar", 1949);
        this.mother = new Human("Victoria", "Escobar", 1955);
        this.child1 = new Human("Juan", "Escobar", 1977, 120, new String[][]{{DayOfWeek.MONDAY.name(), "Task_1"}, {DayOfWeek.THURSDAY.name(), "Task_2"}});
        this.family = new Family(father, mother);
    }

    @Test
    public void toStringTest() {
        assertEquals("Human{name='Pablo', surname='Escobar', year=1949}", father.toString());
        System.out.println("toString test Passed");
    }

    @Test
    public void checkAddChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        assertEquals(family, child1.getFamily());
        System.out.println("addChild test Passed");
    }


    @Test
    public void checkDeleteChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        family.deleteChild(0);
        assertEquals(0, family.getChildren().length);
        System.out.println("deleteChild1 test Passed");
    }

    @Test
    public void checkDeleteChild2() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        family.deleteChild(1);
        assertEquals(1, family.getChildren().length);
        System.out.println("deleteChild2 test Passed");
    }

    @Test
    public void countFamily() {
        assertEquals(2, family.countFamily());
        System.out.println("countFamily test Passed");
    }
}
