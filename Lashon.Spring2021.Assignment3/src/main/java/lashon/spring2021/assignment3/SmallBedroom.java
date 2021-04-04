package lashon.spring2021.assignment3;

public class SmallBedroom extends HouseDecorator {
    MyHome myhome;
    
    public SmallBedroom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Small Bedroom";
    }

    public int cost() {
	return 10000 + myhome.cost();
    }
    
    public int area() {
	return 300 + myhome.area();
    }
}