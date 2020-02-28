package com.Test;

import com.MaximumProblem;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumProblem {
    
    MaximumProblem maximumProblem=new MaximumProblem();

    @Test
    public void inGivenThree_Integers_FirstInteger_IsMaximum() {
        int maximum=maximumProblem.MaximumProblem(22,18,12);
        Assert.assertEquals(22,maximum);
    }

    @Test
    public void inGivenThree_Integers_SecondInteger_IsMaximum() {
        int maximum=maximumProblem.MaximumProblem(10,30,25);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void inGivenThree_Integers_ThirdInteger_IsMaximum() {
        int maximum=maximumProblem.MaximumProblem(20,40,55);
        Assert.assertEquals(55,maximum);
    }
}
