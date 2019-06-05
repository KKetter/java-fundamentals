package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    //michelin is, and thus we are, out of 3
    private float stars;
    private String cost;
    private List<Review> reviews = new ArrayList<>();

    public Restaurant(){}
    public Restaurant(String name, int stars, String cost) {
        this.name = name;
        this.stars = stars;
        this.cost = cost;
    }


    public String getName(){
        return name;
    }

    public float getStars(){
        return stars;
    }

    public String getCost(){
        return cost;
    }

    public List getReviews(){
        return reviews;
    }

    public String toString(){
        return String.format("The restaurant %s with %f stars and costs %s out of $$$$", this.name, this.stars, this.cost);
    }


    public void addReview(Review newReview) {
        float totalStars = this.stars * (1+ this.reviews.size());
        reviews.add(newReview);
        totalStars = totalStars + newReview.getStars();
        totalStars = totalStars/(1 + this.reviews.size());
        this.stars = totalStars;
    }

}

