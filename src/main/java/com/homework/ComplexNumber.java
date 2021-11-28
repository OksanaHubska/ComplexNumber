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

    public static Builder builder() {
        return new Builder();
    }

    public final double getIm() {
        return im;
    }

    public final double getReal() {
        return real;
    }

    public final ComplexNumber summ(ComplexNumber cNumberSumm ) {
        return new ComplexNumber.Builder().real(this.real + cNumberSumm.real).im(this.im + cNumberSumm.im).build();
    }

    public final ComplexNumber sub(ComplexNumber cNumberSub ) {
        return new ComplexNumber.Builder().real(this.real - cNumberSub.real).im(this.im - cNumberSub.im).build();
    }

    public final ComplexNumber mult( ComplexNumber cNumberMult ) {
        return new ComplexNumber.Builder().real((this.real * cNumberMult.real) - (this.im * cNumberMult.im)).im((this.im * cNumberMult.real) + (this.real * cNumberMult.im)).build();
    }

    public final ComplexNumber div( ComplexNumber cNumberDiv ) {
        return new ComplexNumber.Builder().real(((this.real * cNumberDiv.real) + (this.im * cNumberDiv.im)) / (cNumberDiv.real * cNumberDiv.real) + (cNumberDiv.im * cNumberDiv.im)).im(((this.im * cNumberDiv.real) - (this.real * cNumberDiv.im)) / (cNumberDiv.real * cNumberDiv.real) + (cNumberDiv.im * cNumberDiv.im)).build();
    }

    @Override
    public String toString() {
        return real + " + i*" + im ;
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
