public class Member {
    private String name;
    private String email;
    private double totalSpent;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.totalSpent = 0;
    }

    public String getName() { return name; }
    public double getTotalSpent() { return totalSpent; }
    public void increaseTotalSpent(double amount) { this.totalSpent += amount; }

    @Override
    public String toString() {
        return "Member: Name = " + name + ", Email = " + email + ", Total Spent = $" + totalSpent;
    }
}
