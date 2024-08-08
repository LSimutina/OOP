public class SetOfPaths {
    City city;
    int price;

    public SetOfPaths(City city, int price) {
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return city + ": " + price;
    }
}
