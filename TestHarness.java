import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bookstore!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a CD");
            System.out.println("3. Add a DVD");
            System.out.println("4. Add a Member");
            System.out.println("5. Make a Purchase");
            System.out.println("6. View Members");
            System.out.println("7. View Inventory");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    bookstore.addBook(new Book(title, author, price, quantity));
                    System.out.println("Book added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter artist: ");
                    String artist = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    bookstore.addCD(new CD(title, artist, price, quantity));
                    System.out.println("CD added successfully!");
                }
                case 3 -> {
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter director: ");
                    String director = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    bookstore.addDVD(new DVD(title, director, price, quantity));
                    System.out.println("DVD added successfully!");
                }
                case 4 -> {
                    System.out.print("Enter member name: ");
                    String name = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    System.out.print("Is Premium Member (yes/no): ");
                    String isPremium = scanner.next();
                    if (isPremium.equalsIgnoreCase("yes")) {
                        System.out.print("Enter payment method: ");
                        String paymentMethod = scanner.next();
                        bookstore.addMember(new PremiumMember(name, email, paymentMethod));
                    } else {
                        bookstore.addMember(new Member(name, email));
                    }
                    System.out.println("Member added successfully!");
                }
                case 5 -> {
                    System.out.print("Enter member name: ");
                    String memberName = scanner.next();
                    Member member = bookstore.getMembers().stream()
                            .filter(m -> m.getName().equals(memberName))
                            .findFirst().orElse(null);

                    if (member == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    List<Book> purchaseBooks = new ArrayList<>();
                    List<CD> purchaseCDs = new ArrayList<>();
                    List<DVD> purchaseDVDs = new ArrayList<>();

                    while (true) {
                        System.out.print("Enter item type (book/cd/dvd) or 'done' to finish: ");
                        String type = scanner.next();
                        if (type.equalsIgnoreCase("done")) break;

                        System.out.print("Enter item title: ");
                        String title = scanner.next();
                        switch (type.toLowerCase()) {
                            case "book" -> bookstore.getBooks().stream()
                                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                                    .findFirst().ifPresentOrElse(purchaseBooks::add, () -> System.out.println("Book not found."));
                            case "cd" -> bookstore.getCDs().stream()
                                    .filter(cd -> cd.getTitle().equalsIgnoreCase(title))
                                    .findFirst().ifPresentOrElse(purchaseCDs::add, () -> System.out.println("CD not found."));
                            case "dvd" -> bookstore.getDVDs().stream()
                                    .filter(dvd -> dvd.getTitle().equalsIgnoreCase(title))
                                    .findFirst().ifPresentOrElse(purchaseDVDs::add, () -> System.out.println("DVD not found."));
                            default -> System.out.println("Invalid item type.");
                        }
                    }

                    bookstore.completePurchase(member, purchaseBooks, purchaseCDs, purchaseDVDs);
                }
                case 6 -> {
                    System.out.println("Members:");
                    bookstore.getMembers().forEach(System.out::println);
                }
                case 7 -> bookstore.viewInventory();
                case 8 -> {
                    System.out.println("Exiting Bookstore. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
