package homeworks.homework10.humans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;


class HumanTest {

    Man man;

    @BeforeEach
    public void setUp() throws ParseException {
        this.man = new Man("Victor", "Sinra", "04/06/1988", 121);
    }

    @Test
    void describeAge() {
        assertEquals("31 year 5 month 7 day",man.describeAge());
    }

    @Test
    void testToString() {
        assertEquals("Man{name='Victor', surname='Sinra', birthDate=04/06/1988, iq=121}",man.toString());
    }
}