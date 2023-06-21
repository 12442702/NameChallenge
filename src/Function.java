import java.util.ArrayList;

public class Function {
    public ArrayList<People> addPeople(ArrayList<People> peopleList, String name, int age) {
        People temp = new People(name, age);
        peopleList.add(temp);
        return peopleList;
    }

    public People findPerson(ArrayList<People> peopleList, String name) {
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getName().equals(name)) {
                return peopleList.get(i);
            }
        }
        return null;
    }
}
