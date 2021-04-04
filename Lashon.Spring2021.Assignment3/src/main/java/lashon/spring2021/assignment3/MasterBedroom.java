package lashon.spring2021.assignment3;

public class MasterBedroom extends HouseDecorator {
    MyHome myhome;
    
    public MasterBedroom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Master Bedroom";
    }

    public int cost() {
	return 15000 + myhome.cost();
    }
    
    public int area() {
	return 550 + myhome.area();
    }
}
