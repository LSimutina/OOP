public class SetOfPaths {
    String city;
    int price;

    public SetOfPaths(String city, int price) {
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return city + ": " + price;
    }
}
