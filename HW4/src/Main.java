import java.util.Arrays;

public class Main {

    static final int SIZE = 100000000;
    static final int HALFE = SIZE / 2;

    float[] arr = new float[SIZE];
    float[] arr2 = new float[SIZE];
    float[] a1 = new float[HALFE];
    float[] a2 = new float[HALFE];


    public static void main(String[] args) throws InterruptedException {
        Main m1 = new Main();
        m1.foo1();
        Main m2 = new Main();
        m2.foo2();
    }

    public void foo1() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < SIZE; i++) {
                    arr[i] = 1;
                }
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < SIZE; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            System.out.println(arr[i]);
                }
                System.out.println("Прошло времени (способ 1): " + (System.currentTimeMillis() - startTime));
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // -----Проверка значений-----
//        System.out.println(Arrays.toString(arr));
    }

    public void foo2() throws InterruptedException {

        for (int i = 0; i < SIZE; i++) {
            arr2[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        System.arraycopy(arr2, 0, a1, 0, HALFE);
        System.arraycopy(arr2, HALFE, a2, 0, HALFE);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//                    System.out.println(a1[i]);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float)(a2[i] * Math.sin(0.2f + (i+HALFE) / 5) * Math.cos(0.2f + (i+HALFE) / 5) * Math.cos(0.4f + (i+HALFE) / 2));
//                    System.out.println(a2[i]);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.arraycopy(a1, 0, arr2, 0, HALFE);
        System.arraycopy(a2, 0, arr2, HALFE, HALFE);
        // -----Проверка значений-----
//        System.out.println(Arrays.toString(arr2));
        System.out.println("Прошло времени (способ 2): " + (System.currentTimeMillis() - startTime));

    }


}
