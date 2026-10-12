class Foo {
    int one=0;
    int two=0;

    public Foo() {
        
    }

    public  synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        one=1;
        
        notifyAll();
     
    }

    public synchronized  void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (one!=1) {
            wait();
        }

        
        printSecond.run();
        two=1;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
      while (two==0) {
            wait();
        }
        printThird.run();
    }
}