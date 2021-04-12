package com.vinnersk.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CommonTests {
    
    @Test
    public void isValidJsonTestForSuccessCondition(){
        assertTrue(Common.isValidJson("{\"a\":{\"b\":{\"c\":\"d\"}}}"));
    }

    @Test
    public void isValidJsonTestForFailureCondition(){
        assertFalse(Common.isValidJson("a"));
    }
}
