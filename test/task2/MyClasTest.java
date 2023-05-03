package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClasTest {

    @Test
    void add() {
        MyClas<Double> clas = new MyClas<>();
        clas.add(123.0);
        clas.add(321.0);

        assertEquals(123.0, clas.indeksator(0));
        assertEquals(321.0, clas.indeksator(1));

        assertEquals(2, clas.length());
    }
}