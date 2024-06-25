import Point.Point;
import ColorPoint.MyColor;

public class Main {

    public static void main(String args[]) {
        StartUp stu = new StartUp();
        stu.main();

    }
}

class StartUp {
    public static int volume = 0;

    public void main() {
        System.out.println("Main start with threadID == " + Thread.currentThread().threadId());
        // for (int j = 0; j < 2; j++) {
        CountUp cuThread1 = new CountUp(new StartUp());
        CountUp cuThread2 = new CountUp(new StartUp());
        cuThread1.start();
        cuThread2.start();
        //
        try {
            cuThread1.join();
            cuThread2.join();
        } catch (InterruptedException e) {

        }

        // }
        System.out.println("Main thread finish. Main.volume == " + volume);
    }
}

class CountUp extends Thread {
    private StartUp m;

    public CountUp(StartUp aStartUp) {
        m = aStartUp;
    }

    public void run() {
        System.out.println("Thread with ID == " + Thread.currentThread().threadId() + " start run");
        for (int i = 0; i < 1000; i++) {
            // System.out.println("in threadID == " + Thread.currentThread().threadId()+ " ,
            // value of local variable i == " + i);
            synchronized (m) {
                StartUp.volume++;
                System.out.println("in threadID == " + Thread.currentThread().threadId()+" ; volume == " +StartUp.volume);
            }
        }
        System.out.println("Thread with ID == " + Thread.currentThread().threadId() + " finish run");
    }

}

class Child {
    private Car mCar;
    private static Child mInstance;

    public static Child getInstance() {
        if (null == mInstance) {
            mInstance = new Child(Car.getInstance(), "mewmew");
        }
        return mInstance;
    }

    private String name;

    public Child(Car aCar, String aName) {
        System.out.println("Child constructor");
        name = aName;
        if (null != aCar) {
            mCar = aCar;
            mCar.registerChild(this);
        } else {
            System.out.println("aCar is null");
        }

    }

    void showName() {
        System.out.println("Child name == " + name);
    }

    public Car getCar() {
        return mCar;
    }

}

class Car {
    private static Car mInstance;
    private Child mChild;

    public static Car getInstance() {
        if (null == mInstance) {
            mInstance = new Car();
        }
        return mInstance;
    }

    public void registerChild(Child aChild) {
        mChild = aChild;
    }

    private Car() {
        System.out.println("Car constructor");
    }

    void display() {
        mChild.showName();
    }
}

class Count implements Runnable {
    public void run() {
        System.out.println("Count threadID == " + Thread.currentThread().threadId());
        for (int i = 0; i < 1000; i++) {
            System.out.println("i == " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}