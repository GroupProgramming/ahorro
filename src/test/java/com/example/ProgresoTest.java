package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ProgresoTest{

    @Test
    public void testMock(){
        Meta meta = mock(Meta.class);
        when(meta.createMeta()).thenReturn("comprar auto");
        assertEquals("comprar auto", meta.createMeta());
    }


    @Test
    public void testProgresoMock(){
        Progreso progreso = mock(Progreso.class);
        when(progreso.mostrarProgreso("pepe")).thenReturn("pepe");
        assertEquals("pepe", progreso.mostrarProgreso("pepe"));
    }

    
    // @Test
    // public void testGetNum1() {
    //     Numeros numero = mock(Numeros.class);
    //    Mockito.when(numero.getNum1()).thenReturn(1);
    //     assertEquals(1, numero.getNum1());

    // }
}
