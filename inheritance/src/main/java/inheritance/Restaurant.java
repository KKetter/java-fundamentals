package inheritance;

import java.util.List;

public class Restaurant {
    private String name;
    //michelin is, and thus we are, out of 3
    private int stars;
    private String cost;
    private List<Review> reviews;

    public Restaurant(){}
    public Restaurant(String name, int stars, String cost, List<Review> reviews) {
        this.name = name;
        this.stars = stars;
        this.cost = cost;
        this.reviews = reviews;
    }


    public String getName(){
        return name;
    }

    public int getStars(){
        return stars;
    }

    public String getCost(){
        return cost;
    }

    public List getReviews(){
        return reviews;
    }

    public String toString(){
        return String.format("The restaurant %s with %d stars and costs %s out of $$$$", this.name, this.stars, this.cost);
    }


    public void addReview(Review newReview) {
        int totalStars = this.stars * this.reviews.size();
        reviews.add(newReview);
        totalStars = totalStars + newReview.getStars();
        totalStars = totalStars/this.reviews.size();
        this.stars = totalStars;
    }

}

