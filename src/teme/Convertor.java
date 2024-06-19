package teme;

public class Convertor {
    public void kmMile (double distanta) {
        System.out.println("Distanta in Mile este: " + distanta*0.62);
    }
    public void mileKm (double distanta) {
        System.out.println("Distanta in Km este: " + distanta*1.6);
    }
    public void cF (double temperatura) {
        System.out.println("Temperatura in grade Fahrenheit este: " + ((temperatura*9/5)+32));
    }
    public void cK (double temperatura) {
        System.out.println("Temperatura in grade Kalvin este: " + (temperatura + 273.15));
    }
}
