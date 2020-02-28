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

    @Test
    public void inGivenThree_Float_FirstFloat_IsMaximum() {
        Double maximumFloat=maximumProblem.MaximumProblemFloat(2.1,0.5,1.9);
        Assert.assertEquals(2.1,maximumFloat,0);
    }
    @Test
    public void inGivenThree_Float_SecondFloat_IsMaximum() {
        Double maximumFloat=maximumProblem.MaximumProblemFloat(5.5,9.5,4.2);
        Assert.assertEquals(9.5,maximumFloat,0);
    }
    @Test
    public void inGivenThree_Float_ThirdFloat_IsMaximum() {
        Double maximumFloat=maximumProblem.MaximumProblemFloat(3.1,6.0,7.5);
        Assert.assertEquals(7.5,maximumFloat,0);
    }
}
