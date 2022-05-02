package com.bridgelabz.junittesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedEmailTest {
    private String email2;
    private boolean expectedResult;

    public ParameterizedEmailTest(String email2, boolean expectedResult){
        this.email2 = email2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emailIdsExpectedResult(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com.com", true},
                {"abc+100c@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.", false},
        });
    }

    @Test
    public void givenEmailIds_WithExpextedResult_ShouldPassAllTheTestCases(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.email2(this.email2);
        Assert.assertEquals(this.expectedResult, result);
    }
}
