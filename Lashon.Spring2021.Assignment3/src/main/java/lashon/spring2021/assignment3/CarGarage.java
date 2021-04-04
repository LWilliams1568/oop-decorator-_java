package lashon.spring2021.assignment3;

public class CarGarage extends HouseDecorator {
    MyHome myhome;
    
    public CarGarage(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Car Garage";
    }

    public int cost() {
	return 500 + myhome.cost();
    }
    
    public int area() {
	return 250 + myhome.area();
    }
}