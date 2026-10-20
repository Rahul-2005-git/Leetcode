class FooBar {
    private int n;
    boolean one;
    boolean two;

    public FooBar(int n) {
        this.n = n;
        one=false;
        two=true;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        synchronized (this){
        for (int i = 0; i < n; i++) {
            while(!two){
            wait();
            }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            one=true;
            two=false;

            
            notifyAll();
        }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        synchronized(this){
        for (int i = 0; i < n; i++) {
            while(!one){
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();

            two=true;
            one =false;
            notifyAll();
        }
        }
    }
}