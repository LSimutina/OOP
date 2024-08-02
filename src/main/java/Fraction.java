public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 0) throw new IllegalArgumentException("Знаменатель должен быть больше нуля");
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction = " + numerator + " / " + denominator;
    }

    public Fraction sum(int numerator, int denominator) {
        if (denominator < 0) throw new IllegalArgumentException("Знаменатель должен быть больше нуля");
        int newDenominator = this.denominator * denominator;
        int newNumerator = this.numerator * denominator + numerator * this.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int numerator) {
        return sum(numerator, 1);
    }

    public Fraction sum(Fraction f) {
        return sum(f.numerator, f.denominator);
    }

    public Fraction minus(int numerator, int denominator) {
        if (denominator < 0) throw new IllegalArgumentException("Знаменатель должен быть больше нуля");
        int newDenominator = this.denominator * denominator;
        int newNumerator = this.numerator * denominator - numerator * this.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int numerator) {
        return minus(numerator, 1);
    }

    public Fraction minus(Fraction f) {
        return minus(f.numerator, f.denominator);
    }
}
