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
    public People getOldestPeople(ArrayList<People> PeopleList) {
        People oldestPerson = PeopleList.get(0);
        for (int i = 1; i < PeopleList.size(); i++) {
            if (PeopleList.get(i).compareTo(oldestPerson) > 0) {
                oldestPerson = PeopleList.get(i);
            }
        }
        return oldestPerson;
    }

    public People getYoungestPeople (ArrayList<People> PeopleList) {
        People youngestPerson = PeopleList.get(0);
        for (int i = 1; i < PeopleList.size(); i++) {
            if (PeopleList.get(i).compareTo(youngestPerson) < 0) {
                youngestPerson = PeopleList.get(i);
            }
        }
        return youngestPerson;
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
    public void printAverageYoungOldest(ArrayList<People> peopleList){
        System.out.println("Average age is: " + getAverageAge(peopleList));
        System.out.println("The Youngest " + getYoungestPeople(peopleList));
        System.out.println("The Oldest " + getOldestPeople(peopleList));
    }

    public void menu() {
        try(Scanner input = new Scanner(System.in)){
        boolean exit = false;
        People person1 = new People("Alice", 20);
        People person2 = new People("Bob", 25);
        People person3 = new People("Carol  ",  30);
        People person4 = new People("Dave", 35);
        ArrayList<People> peopleList = new ArrayList<People>();
        peopleList.add(person1);
        peopleList.add(person3);
        peopleList.add(person2);
        peopleList.add(person4);
        do {
            System.out.println("0. Add a person");
            System.out.println("1. Find a person");
            System.out.println("2. Get youngest people");
            System.out.println("3. Get average age");
            System.out.println("4. Get oldest people");
            System.out.println("5. Sort list by age");
            System.out.println("6. Print list");
            System.out.println("7. Print All");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Enter name: ");
                    String name = input.next();
                    System.out.println("Enter age: ");
                    int age = input.nextInt();
                    peopleList = addPeople(peopleList, name, age);
                    printAverageYoungOldest(peopleList);

                    break;
                case 1:
                    System.out.println("Enter name: ");
                    String name2 = input.next();
                    People person = findPerson(peopleList, name2);
                    if (person != null) {
                        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
                    } else {
                        System.out.println("Person not found");
                    }
                    break;
                case 2:
                    System.out.println("The Youngest " + getYoungestPeople(peopleList));
                    break;
                case 3:
                    System.out.println("Average age is: " + getAverageAge(peopleList));
                    break;
                case 4:
                    System.out.println("The Oldest " + getOldestPeople(peopleList));
                    break;
                case 5:
                    ArrayList<People> sortedList = sortListByAge(peopleList);
                    for (int i = 0; i < sortedList.size(); i++) {
                        System.out.println("Name: " + sortedList.get(i).getName() + " Age: " + sortedList.get(i).getAge());
                    }
                    break;
                case 6:
                    for (int i = 0; i < peopleList.size(); i++) {
                        System.out.println("Name: " + peopleList.get(i).getName() + " Age: " + peopleList.get(i).getAge());
                    }

                    break;
                case 7:
                    for (int i = 0; i < peopleList.size(); i++) {
                        System.out.println("Name: " + peopleList.get(i).getName() + " Age: " + peopleList.get(i).getAge());
                    }
                    printAverageYoungOldest(peopleList);
                   break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (!exit);
    }}







}