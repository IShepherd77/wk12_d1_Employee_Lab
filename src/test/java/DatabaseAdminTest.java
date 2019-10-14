import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("IanDBA", "AA103144A", 20000.00);
    }

    @Test
    public void hasName(){
        assertEquals("IanDBA", databaseAdmin.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("AA103144A", databaseAdmin.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals(20500.00, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200.00, databaseAdmin.getBonus(), 0.01);
    }
}
