package lashon.spring2021.assignment3;

public class BigBedroom extends HouseDecorator {
    MyHome myhome;
    
    public BigBedroom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Big Bedroom";
    }

    public int cost() {
	return 12561 + myhome.cost();
    }
    
    public int area() {
	return 450 + myhome.area();
    }
}