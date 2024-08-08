import java.util.ArrayList;
import java.util.List;

public class City {
    String nameCity;
    List<SetOfPaths> setOfPaths;

    public City(String nameCity) {
        this.nameCity = nameCity;
    }

    public City(String nameCity, List<SetOfPaths> setOfPaths) {
        this.nameCity = nameCity;
        this.setOfPaths = setOfPaths;
    }

    @Override
    public String toString() {
        return nameCity + setOfPaths;
    }

    public void addSetOfPath(City city, int price) {
        SetOfPaths setOfPaths = new SetOfPaths(city, price);
        List<SetOfPaths> paths = new ArrayList<>();
        paths.add(0, setOfPaths);
    }

    public City travelBy(int count) {
        City city = this.setOfPaths.get(0).city; // в текущем списке путей берется первый город
        if (count == 0) // либо количество городов не станет равным n
            return city;
        else {
//            count--;
            return city.travelBy(count);
        }
    }
}