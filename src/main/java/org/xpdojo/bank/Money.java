package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    public Money(int i) {
        if (i < 0) throw new IllegalArgumentException();
    }


    public Money add(Money amount) {
        return new Money(0)
    }

    @Override
    public int hashCode() {
        return super.hashCode()
    }

    @Override
    public boolean equals(Object obj) {

    }

}
