package com.tests;

import com.homework.ComplexNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestsSuite {
    private ComplexNumber cNumber1 = new ComplexNumber.Builder().real(2).im(3).build();
    private ComplexNumber cNumber2 = new ComplexNumber.Builder().real(4).im(5).build();
    private ComplexNumber summCNumbers = new ComplexNumber.Builder().real(6).im(8).build();
    private ComplexNumber subCNumbers = new ComplexNumber.Builder().real(-2).im(-2).build();
    private ComplexNumber multCNumbers = new ComplexNumber.Builder().real(-7).im(22).build();
    private ComplexNumber divCNumbers = new ComplexNumber.Builder().real(26.4375).im(25.125).build();


    @Test()
    public void creationComplexNumberTest() {
        if (!cNumber1.equals(null)) {
            Assert.assertTrue(cNumber1.getReal() == 2, "Complex number 1 was created incorrect (real part)");
            Assert.assertTrue(cNumber1.getIm() == 3, "Complex number 1 was created incorrect (imaginary part)");
        }
        if (!cNumber2.equals(null)) {
            Assert.assertTrue(cNumber2.getReal() == 4, "Complex number 2 was created incorrect (real part)");
            Assert.assertTrue(cNumber2.getIm() == 5, "Complex number 2 was created incorrect (imaginary part)");
        }
    }

    @Test()
    public void summTest() {
        Assert.assertEquals(ComplexNumber.summ(cNumber1, cNumber2), summCNumbers, "Function of summation works incorrect!");
    }

    @Test()
    public void subtractionTest() {
        Assert.assertEquals(ComplexNumber.sub(cNumber1, cNumber2), subCNumbers, "Function of subtraction works incorrect!");
    }

    @Test()
    public void multiplicationTest() {
        Assert.assertEquals(ComplexNumber.mult(cNumber1, cNumber2), multCNumbers, "Function of multiplication works incorrect!");
    }

    @Test()
    public void dividingTest() {
        Assert.assertEquals(ComplexNumber.div(cNumber1, cNumber2), divCNumbers, "Function of dividing works incorrect!");
    }

}
