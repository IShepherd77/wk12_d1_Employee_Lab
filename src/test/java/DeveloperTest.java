import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("IanDev", "JA103144B", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("IanDev", developer.getName(null));
    }

    @Test
    public void hasNin(){
        assertEquals("JA103144B", developer.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500.00);
        assertEquals(10500.00, developer.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(100.00, developer.getBonus(), 0.01);
    }
}
