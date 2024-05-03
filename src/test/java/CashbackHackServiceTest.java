import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;


public class CashbackHackServiceTest {
    @Test

    public void testIfAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 998;
        int actual = service.remain(2);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount998() {
        CashbackHackService service = new CashbackHackService();

        int expected = 2;
        int actual = service.remain(998);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

    @Test

    public void testIfAmountMinus() {
        CashbackHackService service = new CashbackHackService();

        assertThrows(IllegalArgumentException.class,
                () -> {
                    service.remain(-1);
                });
    }
}
