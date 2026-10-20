class ZeroEvenOdd {
    private int n;
    Semaphore z=new Semaphore(1);
    Semaphore e=new Semaphore(0);
    Semaphore o=new Semaphore(0);
    int count=1;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(true){
            z.acquire();
            if(count>n){
                e.release();
                o.release();
                break;
            }
            printNumber.accept(0);
            if(count%2==0){

            e.release();
            }
            else{

            o.release();
            }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while(true){
            e.acquire();
            if(count>n)break;
            printNumber.accept(count);
            count++;
            z.release();
        }
        
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
         while(true){
            o.acquire();
            if(count>n)break;
            printNumber.accept(count);
            count++;
            z.release();
        }
    }
}