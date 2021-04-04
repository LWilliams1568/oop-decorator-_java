package lashon.spring2021.assignment3;

public class Bathroom extends HouseDecorator {
  
    MyHome myhome;
    
    public Bathroom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Bathroom";
    }

    public int cost() {
	return 4000 + myhome.cost();
    }
    
    public int area() {
	return 120 + myhome.area();
    }
}