import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> books = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private static final double MAX_SPENDING_LIMIT = 1000.0;

    public void addBook(Book book) { books.add(book); }
    public void addCD(CD cd) { cds.add(cd); }
    public void addDVD(DVD dvd) { dvds.add(dvd); }
    public void addMember(Member member) { members.add(member); }

    public List<Book> getBooks() { return books; }
    public List<CD> getCDs() { return cds; }
    public List<DVD> getDVDs() { return dvds; }
    public List<Member> getMembers() { return members; }

    public void completePurchase(Member member, List<Book> booksToPurchase, List<CD> cdsToPurchase, List<DVD> dvdsToPurchase) {
        double totalCost = booksToPurchase.stream().mapToDouble(Book::getPrice).sum()
                        + cdsToPurchase.stream().mapToDouble(CD::getPrice).sum()
                        + dvdsToPurchase.stream().mapToDouble(DVD::getPrice).sum();

        if (member.getTotalSpent() + totalCost <= MAX_SPENDING_LIMIT) {
            member.increaseTotalSpent(totalCost);
            booksToPurchase.forEach(book -> book.setQuantity(book.getQuantity() - 1));
            cdsToPurchase.forEach(cd -> cd.setQuantity(cd.getQuantity() - 1));
            dvdsToPurchase.forEach(dvd -> dvd.setQuantity(dvd.getQuantity() - 1));
            System.out.println("Purchase successful! Total Cost: $" + totalCost);
        } else {
            System.out.println("Purchase failed. Exceeds spending limit.");
        }
    }

    public void viewInventory() {
        System.out.println("Inventory:");
        System.out.println("Books:");
        books.forEach(System.out::println);
        System.out.println("CDs:");
        cds.forEach(System.out::println);
        System.out.println("DVDs:");
        dvds.forEach(System.out::println);
    }
}
