public class BackgroundJobExecution {
    public static void main(String[] args) {

        // Step 1: Create a Runnable (using lambda expression)
        Runnable backgroundJob = () -> {
            System.out.println("Background job started...");
            try {
                // Simulate some work
                Thread.sleep(2000);
                System.out.println("Processing data in background...");
                Thread.sleep(2000);
                System.out.println("Background job completed!");
            } catch (InterruptedException e) {
                System.out.println("Background job interrupted.");
            }
        };

        // Step 2: Execute the job asynchronously in a new thread
        Thread workerThread = new Thread(backgroundJob);
        workerThread.start();

        // Step 3: Main thread continues without waiting
        System.out.println("Main thread is free to do other work...");

        // Simulate other work in the main thread
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread working... step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
