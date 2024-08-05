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

//    public City travelBy(int count) {
//        City nameCity = this;
//        for (SetOfPaths i: setOfPaths){
//            if (setOfPaths == null ) break;
//            while(setOfPaths(i)!=count) {
//                nameCity= SetOfPaths.city;  //как запомнить последний город????????
//            }
//        }
//        return nameCity;
//    }

}