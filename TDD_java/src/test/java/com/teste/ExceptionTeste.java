package com.teste;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionTeste {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }

    @Test
    public void testeExceptionTryCatch(){
        try{
            new ArrayList<Object>().get(0);
            fail("Esperandp que seja vazio");
        }catch(IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
