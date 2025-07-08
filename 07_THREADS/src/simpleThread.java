class simpleThread {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }

}

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("The Thread value of A =" + i);
        }
    }
}