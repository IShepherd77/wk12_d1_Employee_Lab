import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    Director director;

    @Before
    public void before(){
        director = new Director("Ian Dir", "AA123456A", 100000.00, "Arts", 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ian Dir", director.getName(null));
    }

    @Test
    public void hasNin(){
        assertEquals("AA123456A", director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Arts", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(105000.00, director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, director.getBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(25000.00, director.getBudget(), 0.01);
    }

}
