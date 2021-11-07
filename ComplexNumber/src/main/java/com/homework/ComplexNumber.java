package com.homework;

public class ComplexNumber {
    private final double real;
    private final double im;

    public static class Builder {
        private double realBuilder;
        private double im;

        public Builder real( double val ) {
            realBuilder = val;
            return this;
        }

        public Builder im( double val ) {
            im = val;
            return this;
        }

        public ComplexNumber build() {
            return new ComplexNumber(this);
        }
    }

    private ComplexNumber( Builder builder ) {
        real = builder.realBuilder;
        im = builder.im;
    }

    public final double getIm() {
        return im;
    }

    public final double getReal() {
        return real;
    }

    public final static ComplexNumber summ( ComplexNumber cNumber1, ComplexNumber cNumber2 ) {
        return new ComplexNumber.Builder().real(cNumber1.real + cNumber2.real).im(cNumber1.im + cNumber2.im).build();
    }

    public final static ComplexNumber sub( ComplexNumber cNumber1, ComplexNumber cNumber2 ) {
        return new ComplexNumber.Builder().real(cNumber1.real - cNumber2.real).im(cNumber1.im - cNumber2.im).build();
    }

    public final static ComplexNumber mult( ComplexNumber cNumber1, ComplexNumber cNumber2 ) {
        return new ComplexNumber.Builder().real((cNumber1.real * cNumber2.real) - (cNumber1.im * cNumber2.im)).im((cNumber1.im * cNumber2.real) + (cNumber1.real * cNumber2.im)).build();
    }

    public final static ComplexNumber div( ComplexNumber cNumber1, ComplexNumber cNumber2 ) {
        return new ComplexNumber.Builder().real(((cNumber1.real * cNumber2.real) + (cNumber1.im * cNumber2.im)) / (cNumber2.real * cNumber2.real) + (cNumber2.im * cNumber2.im)).im(((cNumber1.im * cNumber2.real) - (cNumber1.real * cNumber2.im)) / (cNumber2.real * cNumber2.real) + (cNumber2.im * cNumber2.im)).build();
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.im, im) == 0;
    }
}
