package lashon.spring2021.assignment3;

public class Closet extends HouseDecorator {
    MyHome myhome;
    
    public Closet(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Closet";
    }

    public int cost() {
	return 1000 + myhome.cost();
    }
    
    public int area() {
	return 15 + myhome.area();
    }
}