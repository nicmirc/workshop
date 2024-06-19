package teme;

public class DiscountCalculator {
    double pret;
    double discount;
    public void setPret(double pret) {
        this.pret = pret;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double calcPretFinal() {
        return (pret*(1-discount/100));
    }
}
