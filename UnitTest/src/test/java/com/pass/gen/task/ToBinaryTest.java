package com.pass.gen.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToBinaryTest {

    /*
    Перетворення чисел у двійковий формат:
    Розбийте рядок на слова, визначте,
    які з них є числами, та перетворіть кожне число за допомогою функції bin().
     */

    @Test
    void toBinaryString() {
        // given
        String input = "2";
        String result = "10";
        // when
        ToBinary toBinary = new ToBinary();
        String output = toBinary.toBinaryString(input);
        //then
        assertEquals(result, output);

    }
}