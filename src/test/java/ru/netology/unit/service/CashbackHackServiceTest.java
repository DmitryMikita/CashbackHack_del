package ru.netology.unit.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void purchaseLessThanThousand() {
        CashBackHacker service = new CashBackHacker();
        int boundary = 800;
        int expected = 200;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseMoreThanThousand() {
        CashBackHacker service = new CashBackHacker();
        int boundary = 1700;
        int expected = 300;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseEqualToThousand() {
        CashBackHacker service = new CashBackHacker();
        int boundary = 1000;
        int expected = 0;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }
}
