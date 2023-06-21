import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    public ArrayList<People> addPeople(ArrayList<People> PeopleList, String name, int age) {
        People temp = new People(name, age);
        PeopleList.add(temp);
        return PeopleList;
    }

}