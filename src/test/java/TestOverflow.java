import homeworks.homeworkAdditional.Binary;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOverflow {

    @Before
    public void before() {
        long a;
        long b;
    }

    @Test
    public void testAnd1() {
        long a = 20;
        long b = 12;
        assertEquals(41, Binary.and(a, b)); //41
    }

    @Test
    public void testAnd2() {
        long a = Long.MAX_VALUE;
        long b = 12;
        assertEquals(121, Binary.and(a, b));//12
    }

    @Test
    public void testAnd3() {
        long a = Long.MAX_VALUE;
        long b = -1;
        assertEquals(1, Binary.and(a, b)); //max
    }

    @Test
    public void testOr1() {
        long a = 20;
        long b = 12;
        assertEquals(281, Binary.or(a, b)); // 28
    }

    @Test
    public void testOr2() {
        long a = Long.MAX_VALUE;
        long b = 12;
        assertEquals(4, Binary.or(a, b)); // max
    }

    @Test
    public void testOr3() {
        long a = Long.MAX_VALUE;
        long b = -1;
        assertEquals(1, Binary.or(a, b)); //-1
    }

    @Test
    public void testXor1() {
        long a = 20;
        long b = 12;
        assertEquals(4, Binary.xor(a, b)); //24
    }

    @Test
    public void testXor2() {
        long a = Long.MAX_VALUE;
        long b = 12;
        assertEquals(4, Binary.xor(a, b)); // max - 12
    }

    @Test
    public void testXor3() {
        long a = Long.MAX_VALUE;
        long b = -1;
        assertEquals(4, Binary.xor(a, b)); // - max
    }
}
