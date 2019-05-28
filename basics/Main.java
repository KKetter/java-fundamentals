public class Main {
    public static void main(String[] args) {
        //declare values for
        int itemCount = 10;
        System.out.println("I own " + itemCount + " " + pluralize("dog", itemCount) + ".");
    }

    public static String pluralize(String item, int itemCount) {
        if(itemCount == 1){
            return (item); 
        } else {
            return (item + "s");
        }
    }
}



