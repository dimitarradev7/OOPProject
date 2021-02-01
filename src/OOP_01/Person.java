package OOP_01;

public class Person implements Comparable<Person> {
    public final boolean canBreathe = true;
    public String name;
    public String lastName;
    public int age;
    public long personalNumber;
    public boolean isMale;
    public double weight;
    public BankAccount bankAccount;
    public Person[] friends;
    public Main.Car car;
    public double money;

    public Person() {

        this.age = 0;
        this.weight = 4.0;
        this.friends = new Person[3];
        this.car = new Main.Car();

    }

    public Person(String name) {
        this();
        if (name == null) {
            throw new NullPointerException("name not be null");

        } else {
            this.name = name;
        }
    }

    public Person(String name, long personalNumber) {
        this(name);
        this.personalNumber = personalNumber;
    }

    public Person(String name, long personalNumber, int age) {
        this(name, personalNumber);
        this.age = age;
    }

    public Person(String name, long personalNumber, boolean isMale) {
        this(name, personalNumber);
        this.isMale = isMale;

    }

    int getFriendsNum() {
        return this.friends.length;
    }

    String eat() {
        return "eating...";
    }

    void growUp() {
        age++;
    }

    void drinkWater(double liters) {
        if (liters > 1) {
            System.out.println("This is too much water!!!");
        } else {
            System.out.println(name + " is drinking " + liters + " water.");
        }

    }

    void buyCar(Main.Car car) {
        if (this.money >= car.price) {
            this.car = car;
            car.owner = this;
            this.money -= car.price;
        }
    }

    double sellCarForScrap() {
        double price = this.car.calculateCarPriceForScrap(10);
        this.money += price;
        this.car = null;
        return price;
    }

    public void testPersonsameName(Person p) {
        try {
            Person a = this.friends[4];
            hasTheSameName(p);
            System.out.println("exit testPersonsameName");
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException");
        }


    }


    private void hasTheSameName(Person p) {
        System.out.println("the name/...state 1");
        if (name == null) {
            throw new NullPointerException("name is null");
        }
        name.equals(p.name);

        System.out.println("the name/... 2");
    }


    @Override
    public int compareTo(Person o) {
        if (this.name.equals(o.name) && this.personalNumber == o.personalNumber) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalNumber=" + personalNumber +
                '}';
    }
}
