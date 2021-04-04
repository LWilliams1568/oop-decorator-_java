package lashon.spring2021.assignment3;

public class WalkCloset extends HouseDecorator {
    MyHome myhome;
    
    public WalkCloset(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Walk-in Closet";
    }

    public int cost() {
	return 2130 + myhome.cost();
    }
    
    public int area() {
	return 50 + myhome.area();
    }
}