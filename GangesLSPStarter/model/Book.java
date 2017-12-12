package model;

/**
 * A book that's available for purchase.
 */
abstract public class Book {

    private String title;
    private double price;
    private Box box;


    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        this.box = null; // book starts off unpackaged
    }

    // REQUIRES: model.Box must be medium or large
    // MODIFIES: this
    // EFFECTS:  If the book fits in the given box, then the two are associated (the book is packaged).
    public Box packageBook(Box b) {
        String boxSize = getMinBoxSize();
        if (b.getSize().equals(boxSize)) {
            System.out.println("The book fits snugly into this box.");
        } else if (b.getSize() == "medium" && boxSize == "large"){
            System.out.println("This box is a little too small");
        } else {
            System.out.println("This box is a little big for the book, but it fits.");
        }
        this.setBox(b);
        b.setContents(this);
        return b;
    }

    public String getTitle() {
        return title;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    abstract double calculateShipping();

    abstract String getMinBoxSize();

}
