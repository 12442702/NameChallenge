public class People implements Comparable<People> {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override

    public int	compareTo(People o){
        if(this.age < o.age)
            return -1;

        else if(this.age>o.age)
            return 1;
        else
            return 0;


    }

}
