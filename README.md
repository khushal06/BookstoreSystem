Bookstore System

A Java-based bookstore inventory and member management system that allows users to manage books, CDs, DVDs, and members effectively. The system supports adding items, managing members, completing purchases, and viewing inventory and member details.

Features

Inventory Management:

Add books, CDs, and DVDs with attributes like title, author/artist/director, price, and quantity.

View all inventory items grouped by type (books, CDs, DVDs).

Member Management:

Register members with details like name and email.

Support for premium members with payment methods.

View all registered members.

Purchases:

Allow members to purchase items with real-time inventory updates.

Ensure spending limits are respected.

Track total spending for each member.

Reports:

Display a detailed inventory view.

Display member details with their total spending.

How to Run

Clone or download the repository to your local machine.

git clone https://github.com/yourusername/BookstoreSystem.git

Navigate to the project directory.

cd BookstoreSystem

Compile all Java files.

javac *.java

Run the main program.

java TestHarness

Menu Options

When you run the program, you will see the following options:

Add a Book

Add a CD

Add a DVD

Add a Member

Make a Purchase

View Members

View Inventory

Exit

Example Interaction

Add a book:

Enter title: The Great Gatsby
Enter author: F. Scott Fitzgerald
Enter price: 10.99
Enter quantity: 5
Book added successfully!

View inventory:

Inventory:
Books:
- Book: Title = The Great Gatsby, Author = F. Scott Fitzgerald, Price = $10.99, Quantity = 5
CDs:
- No items available
DVDs:
- No items available

Make a purchase:

Enter member name: John Doe
Enter item type (book/cd/dvd) or 'done' to finish: book
Enter item title: The Great Gatsby
Purchase successful! Total Cost: $10.99

Files in the Project

Book.java: Defines the Book class with attributes and methods for book management.

CD.java: Defines the CD class with attributes and methods for CD management.

DVD.java: Defines the DVD class with attributes and methods for DVD management.

Member.java: Defines the Member class with attributes and methods for regular member management.

PremiumMember.java: Extends the Member class to include premium member-specific features.

Bookstore.java: Manages the inventory and member operations.

TestHarness.java: The main program for user interaction with the system.

Requirements

Java Development Kit (JDK) 8 or later.

A terminal or IDE for running the program.

License

This project is licensed under the MIT License. Feel free to use and modify the code as needed.

Contributing

Contributions are welcome! If you find bugs or have suggestions for improvements, please create an issue or submit a pull request.

