package maratonajava.javacore.aula18_enum.domain;

public enum PaymentType {
    DEBIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    }, CREDIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value);
}