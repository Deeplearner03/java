interface Age {
    int x = 18;

    void getAge();

}

class AnonymosDemo {
    public static void main(String[] args) {
        // Age show = new Age() {
        // public void getAge() {
        // System.out.println("Your Age is: " + x);
        // }
        // };
        // show.getAge();

        // Anonymous inner class that extends another class
        // Thread t = new Thread() {
        // public void run() {
        // System.out.println("i am run method");
        // }
        // };
        // t.start();
        // System.out.println("I am main thread...hello");

        // Anonymous inner class that implements an interface
        // Runnable r = new Runnable() {
        // public void run() {
        // System.out.println("I am run method...");
        // }
        // };
        // Thread t = new Thread(r);
        // t.start();
        // System.out.println("I am main Thread....");

        // Anonymous inner class that defines method/constructor argument
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("I am run ....");
            }
        });
        t.start();
        System.out.println("I am main thread.hii");
    }
}