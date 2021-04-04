package lashon.spring2021.assignment3;

public class LivingRoom extends HouseDecorator {
    MyHome myhome;
    
    public LivingRoom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Living Room";
    }

    public int cost() {
	return 15421 + myhome.cost();
    }
    
    public int area() {
	return 560 + myhome.area();
    }
}