package lashon.spring2021.assignment3;

public class StudyRoom extends HouseDecorator {
    MyHome myhome;
    
    public StudyRoom(MyHome myhome) {
        this.myhome = myhome;
    }

    public String getDescription() {
        return myhome.getDescription() + ", Study Room";
    }

    public int cost() {
	return 14896 + myhome.cost();
    }
    
    public int area() {
	return 550 + myhome.area();
    }
}