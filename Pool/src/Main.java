public class Main {

    public static void main(String[] args) {

        ObjectPool pool = ObjectPool.getInstance();

        User u1 = new User();
        User u2 = new User();

        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
        u1.takeFromPool(pool);
       //limit reached
        u2.takeFromPool(pool);
        u1.returnToPool(pool);
        u1.returnToPool(pool);
        u1.returnToPool(pool);

        u2.takeFromPool(pool);
        u2.takeFromPool(pool);
        u2.returnToPool(pool);


        System.out.println();
        System.out.println("User 1 objects: " + u1.getListSize());
        System.out.println("User 2 objects: " + u2.getListSize());
        System.out.println("Objects in pool: " + pool.getListSize());
        ObjectPool.printNumber();


    }

}


