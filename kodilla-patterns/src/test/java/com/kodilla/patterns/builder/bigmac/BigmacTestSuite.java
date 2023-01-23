package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.bunWithoutSezam)
                .burgers(2)
                .sauce(Sauce.BARBEQUE)
                .ingredients("pickles")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);

        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        Sauce sauce = bigmac.getSauce();
        List<String> ingredients = bigmac.getIngredients();

        //Then
        assertEquals(Bigmac.bunWithoutSezam, bigmac.getBun());
        assertEquals(burgers, bigmac.getBurgers());
        assertEquals(sauce, bigmac.getSauce());
        assertEquals(ingredients, bigmac.getIngredients());
    }
}
