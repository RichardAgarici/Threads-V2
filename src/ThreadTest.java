//        [============================================================================================================]
//        [============================================================================================================]
//        [============================================================================================================]
//        [======================================================]
//        [======================================================]
//public class ThreadTest {
//
//    public static void main(String[] args) throws Exception {
//        MyThread t = new MyThread("My Thread");
//        System.out.println("ID " + t.getId());
//        System.out.println("Name " + t.getName());
//        System.out.println("Priority " + t.getPriority());
//        System.out.println("State " + t.getState());
//        t.start();
//        System.out.println("State " + t.getState());
//        System.out.println("Alive " + t.isAlive());
//        MyThread f =new MyThread("Frodo");
//        System.out.println(f.getId());
//    }
//}
//        [======================================================]
//class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
////        setPriority(Thread.MAX_PRIORITY); // we set the priority in the constructor usually.
////        setPriority(Thread.MAX_PRIORITY+2); //another variant.
//    }
//
//    @Override
//    public void run() {
//        int count = 1;
//
//        while (true) {
//            System.out.println(count++);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//public class ThreadTest {
//
//    public static void main(String[] args) throws Exception {
//        MyThread t = new MyThread("My Thread");
//    }
//            }
//        t.start();
//        t.interrupt();
// IMPORTANT!
//        [============================================================================================================]
//class MyRun implements Runnable {
//    @Override
//    public void run() {
//
//    }
//}
//public class ThreadTest {
//    public static void main(String[] args) throws Exception {
//        Thread t = new Thread();
//        Thread t = new Thread("My name");
//        Thread t = new Thread(new MyRun());
//        Thread t = new Thread(new MyRun(), "My name");
//    }
//}
//        [============================================================================================================]
//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.println(i + "Hello");
//            i++;
//        }
//    }
//}
//
//public class ThreadTest {
//
//    public static void main(String[] args) {
//
//
//        MyRunnable t = new MyRunnable();
//        Thread th = new Thread(t);
//        th.start();
//        int i = 1;
//        while (true) {
//            System.out.println(i + "world");
//            i++;
//        }
//    }
//}
//    We have to implement the run() method.

//        [============================================================================================================]

//        [============]
//        ThreadGroup //must read class. Example = animation with multiple thread in a thread.
//        [============]

//        [============================================================================================================]
//        Methods :
//        th.getId(); //= returns id of a thread
//        th.getName(); //= returns a name of a thread, if it was initialized by a constructor with string parameter
//        th.getPriority(); //= returns a current priority of a thread.
//        th.getState(); //= returns a state of a thread. (waiting, blocked, timed wait)
//        th.getThreadGroup(); //= returns the name of the group which it has part of.

//        Setters:
//        th.setName(); //= setting the name of the current thread.
//        th.setPriority(); //= sets priority from 1-10; see notes.
//        th.setDaemon(); //= this is an on/off switcher which sets the priority. it's like the railway set for trains.
//        another example of Daemon = auto-save from word.
//
//        Enquiries:
//        boolean isAlive(); //= is the thread is still active or not.
//        boolean isDaemon(); //= if its in the low priority or not.
//        boolean isInterrupted(); //= if it's interrupted or not by another priority queue thread.
//        [============================================================================================================]
//======================================================================================================================
//        Instance Methods :
//        void interrupt(); //= interrupts the current thread.
//        void join(); //= join can be called when a task needs to be completed after another task. ex : can't save without type.
//        void join(long millis); //= same thing but with making a miliseconds
//        void run(); //= this have to be overwritted.
//        void start(); //= obvious one.

//        Static Methods :
//    int activeCount(); //= tells how many threads are in a group.

//    Thread currentThread(); //= reference of a current thread.

//    void yeild(); //= remember the restaurant example. With the water.

//    void dumpStack(); //= dumps the current stack trace of the Thread it is invoked on

//======================================================================================================================
//public class ThreadTest extends Thread{
//    @Override
//    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.println(i + "Hello");
//            i++;
//        }
//    }
//
//    public static void main(String[] args) {
//        ThreadTest t = new ThreadTest();
//        t.start();
//        int i =1;
//        while (true){
//            System.out.println(i+"world");
//            i++;
//        }
//    }
//}
//======================================================================================================================
//public class ThreadTest implements Runnable{
//    @Override
//    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.println(i + "Hello");
//            i++;
//        }
//    }
//    We have to implement the run() method.
//
//    public static void main(String[] args) {
//        ThreadTest t = new ThreadTest();
//        Thread th = new Thread(t);
//        th.start();
//        int i =1;
//        while (true){
//            System.out.println(i+"world");
//            i++;
//        }
//    }
//}
//======================================================================================================================

//======================================================================================================================
