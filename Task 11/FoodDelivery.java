
package scenariobased;

abstract class Delivery {

    private double Delivery_Distance;
    private double Delivery_Charge;

    Delivery(double Delivery_Distance) {
        this.Delivery_Distance = Delivery_Distance;
    }

    public double getDeliveryDistance() {
        return Delivery_Distance;
    }

    public double getDeliveryCharge() {
        return Delivery_Charge;
    }

    public void setDeliveryCharge(double Delivery_Charge) {
        this.Delivery_Charge = Delivery_Charge;
    }

    abstract void calculateDeliveryCharge();
}

class NormalDelivery extends Delivery {

    NormalDelivery(double Delivery_Distance) {
        super(Delivery_Distance);
    }

    @Override
    void calculateDeliveryCharge() {

        double charge = getDeliveryDistance() * 10;

        setDeliveryCharge(charge);

        System.out.println("Normal Delivery Charge: " + getDeliveryCharge());
    }
}

class ExpressDelivery extends Delivery {

    ExpressDelivery(double Delivery_Distance) {
        super(Delivery_Distance);
    }

    @Override
    void calculateDeliveryCharge() {

        double charge = getDeliveryDistance() * 20;

        setDeliveryCharge(charge);

        System.out.println("Express Delivery Charge: " + getDeliveryCharge());
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        Delivery d;

        d = new NormalDelivery(5);
        d.calculateDeliveryCharge();

        d = new ExpressDelivery(5);
        d.calculateDeliveryCharge();
    }
}
