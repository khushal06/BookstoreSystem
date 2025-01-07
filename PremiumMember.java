public class PremiumMember extends Member {
    private String paymentMethod;

    public PremiumMember(String name, String email, String paymentMethod) {
        super(name, email);
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Payment Method = " + paymentMethod;
    }
}
