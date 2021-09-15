package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    @Disabled
    public void canCreateANegativeMoney() {
        try {
            Money money = new Money(-10);
            fail();

        } catch (Exception e) {
            // ok
        }
}

    @Test
    public void canCreateAPositiveMoney() {

        Money money = new Money(10);
    }

    @Test
    public void addingAmounts() {
        Money a = new Money(10);
        Money b = new Money(10);
        Money result a.add(b);

        assertThat(result.getValue()).isEqualTo(20);
        assertThat(result.getValue()).isEqualTo(new Money (20));

    }



}