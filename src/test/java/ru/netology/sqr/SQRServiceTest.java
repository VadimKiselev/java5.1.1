package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SQRServiceTest {

//    @Test
//    public void SqrMathTest1() {
//        SQRService service = new SQRService();
//
//        int actual = service.MathCount(200, 450);
//        int expected = 7;
//
//        Assertions.assertEquals(expected, actual);
//    }

    @ParameterizedTest
    @CsvFileSource(resources={"/testSqr.csv"})
    public void SqrMathTest2(int limit1, int limit2, int expected) {
        SQRService service = new SQRService();

        int actual = service.MathCount(limit1, limit2, expected);


        assertNotEquals(expected, actual);
    }

}
