package model;

/**
 * A book that is much larger than standard sized books, e.g., an encyclopedia or an atlas
 */
public class OversizedBook extends Book {

    private double shippingMultiplier;

    private static final double BASE_SHIPPING = 5.00;
    private static final String MIN_SIZE = "large";

    public OversizedBook(String title, double price) {
        super(title, price);

        // More expensive books should have a higher shipping multiplier
        if (price > 9.50) {
            shippingMultiplier = 2;
        } else {
            shippingMultiplier = 1;
        }
    }


    // EFFECTS: Returns the shipping cost for this book, which is a base rate times a multiplier based on the book price.
    public double calculateShipping() {
        return BASE_SHIPPING * shippingMultiplier;
    }

    // EFFECTS: returns the minimum size box required to package this book
    public String getMinBoxSize() {
        System.out.println("An oversized book can only fit in a large box.");
        return MIN_SIZE;
    }

}
