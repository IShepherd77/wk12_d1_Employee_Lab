import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
       manager = new Manager("Ian", "JT103144A", 90000.00, "Accounts");
    }

    @Test
    public void hasName(){
        assertEquals("Ian", manager.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("JT103144A", manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(90000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(95000.00, manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(900.00, manager.getBonus(), 0.01);
    }

}
