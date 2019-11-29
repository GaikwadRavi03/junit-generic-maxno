package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PrintArrayTest {
    @Test
    public void givenMethodShouldReturn_MaxNumber_ForInteger() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(10, 20, 30);
        Assert.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public void givenMethodShouldReturn_MaxNumber_ForDouble() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(10.10, 20.20, 30.30);
        Assert.assertEquals(Double.valueOf(30.30), result);
    }

    @Test
    public void givenMethodShouldReturn_MaxNumber_ForCharachter() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber('a', 'p', 'z');
        Assert.assertEquals(Character.valueOf('z'), result);
    }
}
