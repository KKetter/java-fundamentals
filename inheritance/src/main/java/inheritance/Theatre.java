package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String name;
    private String nowShowing;
    private float stars;
    private String cost;
    private List<Review> reviews = new ArrayList<>();

    public Theatre(){}
    public Theatre(String name, String nowShowing, float stars, String cost){
        this.name = name;
        this.nowShowing = nowShowing;
        this.stars = stars;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public float getStars(){
        return stars;
    }

    public String getCost(){
        return cost;
    }

    public List getReview(){
        return reviews;
    }

    public String toString(){
        return String.format("The theatre %s with %s currently showing, %f stars, and costs %s out of $$$$", this.name, this.nowShowing, this.stars, this.cost);
    }
}
