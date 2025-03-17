package com.pass.gen.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaMethodsTest {

    @Test
    void isStartWith_True() {
        String input = "Str";
        JavaMethods jm = new JavaMethods();
        assertTrue(jm.isStartWith(input, input));
    }

    @Test
    void isStartWith() {
        String input = "Str";
        JavaMethods jm = new JavaMethods();
        assertTrue(jm.isStartWith(input, input.concat(input)));
    }

    @Test
    void isStartWith_False() {
        String input1 = "alex";
        String input2 = "aStr";
        String input3 = "ctr";
        String target = "st";
        JavaMethods jm = new JavaMethods();
        assertFalse(jm.isStartWith(input1, target));
        assertFalse(jm.isStartWith(input2, target));
        assertFalse(jm.isStartWith(input3, target));
    }

    @ParameterizedTest
    @MethodSource("input")
    void test(String value, String target){
        JavaMethods jm = new JavaMethods();
        assertFalse(jm.isStartWith(value, target));
    }

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("alex", "str"),
                Arguments.of("aStr", "str"),
                Arguments.of("ctr", "str"),
                Arguments.of("strr", "str")
        );
    }
}