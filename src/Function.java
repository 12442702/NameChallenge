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
    public People getOldestPeopleByAge(ArrayList<People> PeopleList) {
        People oldestPerson = PeopleList.get(0);
        for (int i = 1; i < PeopleList.size(); i++) {
            if (PeopleList.get(i).compareTo(oldestPerson) > 0) {
                oldestPerson = PeopleList.get(i);
            }
        }
        return oldestPerson;
    }

    public int getAverageAge(ArrayList<People> PeopleList) {
        int sum = 0;
        for (int i = 0; i < PeopleList.size(); i++) {
            sum += PeopleList.get(i).getAge();
        }
        return sum / PeopleList.size();
    }

    public ArrayList<People> sortListByAge(ArrayList<People> peopleList) {
        peopleList.sort(People::compareTo);
        return peopleList;
    }







}