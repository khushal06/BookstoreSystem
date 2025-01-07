public class DVD {
    private String title;
    private String director;
    private double price;
    private int quantity;

    public DVD(String title, String director, double price, int quantity) {
        this.title = title;
        this.director = director;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "DVD: Title = " + title + ", Director = " + director + ", Price = $" + price + ", Quantity = " + quantity;
    }
}
