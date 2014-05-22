package com.russell;

import com.russell.json.impl.FunctionsImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionsTest {

    FunctionsImpl functions = new FunctionsImpl();

    @Test
    public void randomInt() {
        String result = functions.execute("randomInt",new Object[]{1,5});
        Integer integer = Integer.parseInt(result);
        assertTrue(true);
    }

    @Test
    public void randomUUID() {
        String result = functions.execute("uuid",null);
        assertNotNull(result);
    }

}
