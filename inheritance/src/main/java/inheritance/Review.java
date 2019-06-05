package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;


    public Review(){}
        public Review(String author, String body, int stars){
            this.author = author;
            this.body = body;
            this.stars = stars;
        }

    public String getAuthor(){
        return author;
    }

    public String getBody(){
        return body;
    }

    public int getStars(){
        return stars;
    }

    public String toString(){
        return String.format("%s said %s gave it %d stars (out of 3)", this.author, this.body, this.stars);
    }


}
