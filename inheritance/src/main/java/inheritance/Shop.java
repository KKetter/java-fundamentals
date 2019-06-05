package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private float stars;
    private String cost;
    private List<Review> reviews = new ArrayList<>();

    public Shop(){}
    public Shop(String name, String description, float stars, String cost){
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
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
        return String.format("The shop %s described as %s with %f stars and is in the price range %s out of $$$$",this.name, this.description, this.stars, this.cost);
    }

    public void addReview(Review newReview){
        float totalStars = this.stars * (1+ this.reviews.size());
        reviews.add(newReview);
        totalStars = totalStars + newReview.getStars();
        totalStars = totalStars/(1 + this.reviews.size());
        this.stars = totalStars;
    }


}
