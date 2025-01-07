public class CD {
    private String title;
    private String artist;
    private double price;
    private int quantity;

    public CD(String title, String artist, double price, int quantity) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "CD: Title = " + title + ", Artist = " + artist + ", Price = $" + price + ", Quantity = " + quantity;
    }
}
