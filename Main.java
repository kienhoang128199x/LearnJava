import Point.Point;
import ColorPoint.MyColor;

public class Main {
    public static void main(String args[]) {
        
    }
}


/*===========================================
class Animal { // if we declare Animal as final, we can't "extends" Animal
    {
        System.out.println("This is instance initialization block"); // it runs each time object is created
    }

    static{
        System.out.println("This is static initialization block"); // it runs only when the first object is created
    }
    public final int age; 
    public String name;
    public Animal() {
        age = 0;
        name = "Kien";
        System.out.println("Animal constructor");
    }

    public final void showType() {
        System.out.println("I'm a Animal");
    }

    public void display() {
        System.out.println("Animal display");
    }
}

class Cat extends Animal {
    public String name;

    public final int height;

    public Cat() {
        // this("MIMI");
        height = 1;
    }

    public Cat(String aString) {
        super();
        height = 0;
        System.out.println("Cat one-arg constructor");
        name = aString;
    }

    // public void showType(){// because super.showType() is declared as final so we can't override

    // }

    public void display(){
        System.out.println("Cat display");
        super.display();
        System.out.println("Animal's name == " + super.name);
        System.out.println("Cat's name == " + name);
    }

}

 * class StartUp {
 * public static int volume = 0;
 * 
 * public void main() {
 * System.out.println("Main start with threadID == " +
 * Thread.currentThread().threadId());
 * // for (int j = 0; j < 2; j++) {
 * CountUp cuThread1 = new CountUp(new StartUp());
 * CountUp cuThread2 = new CountUp(new StartUp());
 * cuThread1.start();
 * cuThread2.start();
 * //
 * try {
 * cuThread1.join();
 * cuThread2.join();
 * } catch (InterruptedException e) {
 * 
 * }
 * 
 * // }
 * System.out.println("Main thread finish. Main.volume == " + volume);
 * }
 * }
 * 
 * class CountUp extends Thread {
 * private StartUp m;
 * 
 * public CountUp(StartUp aStartUp) {
 * m = aStartUp;
 * }
 * 
 * public void run() {
 * System.out.println("Thread with ID == " + Thread.currentThread().threadId() +
 * " start run");
 * for (int i = 0; i < 1000; i++) {
 * // System.out.println("in threadID == " + Thread.currentThread().threadId()+
 * " ,
 * // value of local variable i == " + i);
 * synchronized (m) {
 * StartUp.volume++;
 * System.out.println("in threadID == " +
 * Thread.currentThread().threadId()+" ; volume == " +StartUp.volume);
 * }
 * }
 * System.out.println("Thread with ID == " + Thread.currentThread().threadId() +
 * " finish run");
 * }
 * 
 * }
 * 
 * class Child {
 * private Car mCar;
 * private static Child mInstance;
 * 
 * public static Child getInstance() {
 * if (null == mInstance) {
 * mInstance = new Child(Car.getInstance(), "mewmew");
 * }
 * return mInstance;
 * }
 * 
 * private String name;
 * 
 * public Child(Car aCar, String aName) {
 * System.out.println("Child constructor");
 * name = aName;
 * if (null != aCar) {
 * mCar = aCar;
 * mCar.registerChild(this);
 * } else {
 * System.out.println("aCar is null");
 * }
 * 
 * }
 * 
 * void showName() {
 * System.out.println("Child name == " + name);
 * }
 * 
 * public Car getCar() {
 * return mCar;
 * }
 * 
 * }
 * 
 * class Car {
 * private static Car mInstance;
 * private Child mChild;
 * 
 * public static Car getInstance() {
 * if (null == mInstance) {
 * mInstance = new Car();
 * }
 * return mInstance;
 * }
 * 
 * public void registerChild(Child aChild) {
 * mChild = aChild;
 * }
 * 
 * private Car() {
 * System.out.println("Car constructor");
 * }
 * 
 * void display() {
 * mChild.showName();
 * }
 * }
 * 
 * class Count implements Runnable {
 * public void run() {
 * System.out.println("Count threadID == " + Thread.currentThread().threadId());
 * for (int i = 0; i < 1000; i++) {
 * System.out.println("i == " + i);
 * try {
 * Thread.sleep(1000);
 * } catch (InterruptedException e) {
 * }
 * }
 * }
 * }
 * 
 ===============================================================*/