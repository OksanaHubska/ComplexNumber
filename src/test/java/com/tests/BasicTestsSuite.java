package com.tests;

import com.homework.ComplexNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestsSuite {
    private ComplexNumber cNumber1 = ComplexNumber.builder().real(2).im(3).build();
    private ComplexNumber cNumber2 = ComplexNumber.builder().real(4).im(5).build();
    private ComplexNumber summCNumbers = ComplexNumber.builder().real(6).im(8).build();
    private ComplexNumber subCNumbers = ComplexNumber.builder().real(-2).im(-2).build();
    private ComplexNumber multCNumbers = ComplexNumber.builder().real(-7).im(22).build();
    private ComplexNumber divCNumbers = ComplexNumber.builder().real(26.4375).im(25.125).build();
    private final String SUMM_ERROR_MESSAGE = "Function of summation works incorrect!\n";
    private final String SUB_ERROR_MESSAGE = "Function of subtraction works incorrect!\n";
    private final String MULT_ERROR_MESSAGE = "Function of multiplication works incorrect!\n";
    private final String DIV_ERROR_MESSAGE = "Function of dividing works incorrect!\n";


    @Test()
    public void creationComplexNumberTest() {
        if (cNumber1 != null) {
            Assert.assertTrue(cNumber1.getReal() == 2, "Complex number 1 was created incorrect (real part)");
            Assert.assertTrue(cNumber1.getIm() == 3, "Complex number 1 was created incorrect (imaginary part)");
        }
        if (cNumber2 != null) {
            Assert.assertTrue(cNumber2.getReal() == 4, "Complex number 2 was created incorrect (real part)");
            Assert.assertTrue(cNumber2.getIm() == 5, "Complex number 2 was created incorrect (imaginary part)");
        }
    }

    @Test()
    public void summTest() {
        Assert.assertEquals(cNumber1.summ(cNumber2), summCNumbers, SUMM_ERROR_MESSAGE);
        Assert.assertTrue(cNumber1.summ(cNumber2).toString().equals("6.0 + i*8.0"), SUMM_ERROR_MESSAGE);
    }

    @Test()
    public void subtractionTest() {
        Assert.assertEquals(cNumber1.sub(cNumber2), subCNumbers, SUB_ERROR_MESSAGE);
        Assert.assertTrue(cNumber1.sub(cNumber2).toString().equals("-2.0 + i*-2.0"), SUB_ERROR_MESSAGE);
    }

    @Test()
    public void multiplicationTest() {
        Assert.assertEquals(cNumber1.mult(cNumber2), multCNumbers, MULT_ERROR_MESSAGE);
        Assert.assertTrue(cNumber1.mult(cNumber2).toString().equals("-7.0 + i*22.0"), SUB_ERROR_MESSAGE);
    }

    @Test()
    public void dividingTest() {
        Assert.assertEquals(cNumber1.div(cNumber2), divCNumbers, DIV_ERROR_MESSAGE);
        Assert.assertTrue(cNumber1.div(cNumber2).toString().equals("26.4375 + i*25.125"), DIV_ERROR_MESSAGE);
    }
}
