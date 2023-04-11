class Pointer {
    public int sum;
}


class Task extends Thread {
    
    private int[] pointer;
    private int startIndex = 0;
    private int filler = 0;

    public Task(int[] pointer, int startIndex, int filler) {
        this.pointer = pointer;
        this.startIndex = startIndex;
        this.filler = filler;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            this.pointer[startIndex + i] = filler;
        }
    }
}

// class Task2 implements Runnable {
//     public Integer sum;
    
//     public Task2(Integer sum) {
//         this.sum = sum;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             this.sum += i;
//         }
//         System.out.println("In Task2 " + this.sum);
//     }
// }


public class MultiThread1 {

    static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Integer sum = 0;
        // Pointer pointer = new Pointer();
        int[] sharedArray = {0, 0, 0, 0, 0, 0};

        Task thread1 = new Task(sharedArray, 0, 2);
        thread1.start();


        Task thread2 = new Task(sharedArray, 3, -2);
        thread2.start();

        // Task2 task2 = new Task2(sum);
        // Thread thread2 = new Thread(task2);
        // thread2.start();

        // try {
        //     thread1.join();
        //     thread2.join();            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        printArray(sharedArray);
    }
}