import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    public ArrayList<People> addPeople(ArrayList<People> PeopleList, String name, int age) {
        People temp = new People(name, age);
        PeopleList.add(temp);
        return PeopleList;
    }

    public People findPerson(ArrayList<People> PeopleList, String name) {
        for (int i = 0; i < PeopleList.size(); i++) {
            if (PeopleList.get(i).getName().equals(name)) {
                return PeopleList.get(i);
            }
        }
        return null;
    }


}