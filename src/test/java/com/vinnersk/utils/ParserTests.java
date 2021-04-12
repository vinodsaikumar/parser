package com.vinnersk.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTests {

   @Test
    public void parseForSuccessWithValidJson() {
        Parser parser = new Parser();
        String value = parser.parse("{\"a\":{\"b\":{\"c\":\"d\"}}}", "a/b/c");
        assertEquals("d", value);
    }
}
