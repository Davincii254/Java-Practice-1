public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2020;

        myCar.displayInfo(); // Output: Brand: Toyota, Year: 2020
    }
}


public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        p1.greet(); // Output: Hello, my name is Alice and I'm 25 years old.
        p2.greet(); // Output: Hello, my name is Bob and I'm 30 years old.
    }
}
