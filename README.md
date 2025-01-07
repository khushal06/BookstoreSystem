# Bookstore System

A Java-based bookstore inventory and member management system that allows users to manage books, CDs, DVDs, and members effectively. The system supports adding items, managing members, completing purchases, and viewing inventory and member details.

## Features

- **Inventory Management**:
  - Add books, CDs, and DVDs with attributes like title, author/artist/director, price, and quantity.
  - View all inventory items grouped by type (books, CDs, DVDs).

- **Member Management**:
  - Register members with details like name and email.
  - Support for premium members with payment methods.
  - View all registered members.

- **Purchases**:
  - Allow members to purchase items with real-time inventory updates.
  - Ensure spending limits are respected.
  - Track total spending for each member.

- **Reports**:
  - Display a detailed inventory view.
  - Display member details with their total spending.

## How to Run

1. bash Copy code git clone
   git clone https://github.com/Khushal06/BookstoreSystem.git

- **Menu Options**:
- When you run the program, you will see the following options:

- **MAdd a Book**:
- Allows you to add a new book to the inventory by entering the book's title, author, price, and quantity.

- **MAdd a CD**:
Allows you to add a new CD to the inventory by entering the CD's title, artist, price, and quantity.

- **MAdd a DVD**:
Allows you to add a new DVD to the inventory by entering the DVD's title, director, price, and quantity.

- **MAdd a Member**:
- Lets you register a new member by entering their name and email.
- Optionally, mark them as a premium member and specify their payment method.

- **MMake a Purchase**:
- Enables a member to purchase items from the inventory by selecting the type (book/CD/DVD) and the item's title.
- Automatically updates the inventory and tracks the member's spending.
  
- **MView Members**:
- Displays all registered members along with their details, including their total spending.

- **MView Inventory**:
- Shows the inventory list of all available books, CDs, and DVDs with their details.

- **MExit**:
- Exits the application gracefully with a farewell message.
