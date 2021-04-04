package lashon.spring2021.assignment3;

public abstract class MyHome {
    String description = "unknown";
    

    public String getDescription() {
        return description;
    }
    
    public abstract int cost();
    public abstract int area();
    
}
