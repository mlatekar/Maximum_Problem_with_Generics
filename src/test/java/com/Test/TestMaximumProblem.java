package com.Test;

import com.MaximumProblem;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumProblem {


    @Test
    public void inGivenThree_Integers_FirstInteger_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(22,18,12);
        Assert.assertEquals(22,maximumProblem.getMaximumProblem());
    }

    @Test
    public void inGivenThree_Integers_SecondInteger_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(2,18,1);
        Assert.assertEquals(18,maximumProblem.getMaximumProblem());
    }

    @Test
    public void inGivenThree_Integers_ThirdInteger_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(4,8,12);

        Assert.assertEquals(12,maximumProblem.getMaximumProblem());
    }

    @Test
    public void inGivenThree_Float_FirstFloat_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(2.2,1.0,0.2);
        Assert.assertEquals(2.2,maximumProblem.getMaximumProblem());
    }
    @Test
    public void inGivenThree_Float_SecondFloat_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(3.2,8.9,1.2);
        Assert.assertEquals(8.9,maximumProblem.getMaximumProblem());
    }
    @Test
    public void inGivenThree_Float_ThirdFloat_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem(5.5,1.8,9.5);
        Assert.assertEquals(9.5,maximumProblem.getMaximumProblem());
    }

    @Test
    public void inGivenThree_String_FirstString_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maximumProblem.getMaximumProblem());
    }
    @Test
    public void inGivenThree_String_SecondString_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem("Banana","Peach","Apple");
        Assert.assertEquals("Peach",maximumProblem.getMaximumProblem());
    }
    @Test
    public void inGivenThree_String_ThirdString_IsMaximum() {
        MaximumProblem maximumProblem=new MaximumProblem("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maximumProblem.getMaximumProblem());
    }


    @Test
    public void inGiven_TakingMoreParameter_OfInteger_And_ReturnMaximum() {
        Assert.assertSame( 96,MaximumProblem.getMaximumProblem(3,65,85,96,86));
    }
    @Test
    public void inGiven_TakingMoreParameter_OfFloat_And_ReturnMaximum() {
        Assert.assertEquals(9.6f,MaximumProblem.getMaximumProblem(3.2f,6.5f,6.8f,8.5f,9.6f,8.6f),0.0f);
    }
    @Test
    public void inGiven_TakingMoreParameter_OfString_And_ReturnMaximum() {
        Assert.assertEquals("Peach",MaximumProblem.getMaximumProblem("Banana","JackFruit","Mango","Peach","Apple"));
    }
}
