package lashon.spring2021.assignment3;

public class Kitchen extends HouseDecorator {
    MyHome myhome;
    
    public Kitchen(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Kitchen";
    }

    public int cost() {
	return 13544 + myhome.cost();
    }
    
    public int area() {
	return 500 + myhome.area();
    }
}