package GitHub.PTHTTH_NHOM1_HANG.tuan3java;

 class A extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
        }
    }

    
    
}
class B extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
        }
    }   
    
}
class D extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
        }
    }

        
}



class C {

public static void main(String[] args) {

    new A().start();
    new B().start();
    new D().start();
}
}
   