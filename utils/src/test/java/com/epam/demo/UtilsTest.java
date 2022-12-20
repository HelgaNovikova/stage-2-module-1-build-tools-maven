package com.epam.demo;

import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testIsAllPositiveNumbers(){
        assertTrue(StringUtils.isPositiveNumber("123"));
    }
}