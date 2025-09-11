package ExceptionsTraining;

import java.io.IOException;

public class ExceptionsDemo {

    static class MyResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new IllegalStateException("Exception from close()");
        }
    }

    public static void suppressedExample() throws Exception {
        try (MyResource res = new MyResource()) {
            throw new IOException("Main exception from try" + res);
        }
    }

    // --- Task 2: Hidden exception (try-finally) ---
public static void hiddenExample() throws Exception {
         try {
         throw new java.io.IOException("Exception from try block");
         } finally {
             throw new RunTimeException("Exception from finally block");
         }
}

}

    // --- Tests in main ---
    //public static void main(String[] args) {
      //  System.out.println("=== Task 1: Suppressed exception ===");
       // try {
        //    suppressedExample();
        //} catch (Exception e) {
         //   System.out.println("Caught: " + e);
           // for (Throwable sup : e.getSuppressed()) {
             //   System.out.println("  Suppressed: " + sup);
           // }
            // Проверка
        //    assert e.getSuppressed().length == 1 : "Expected exactly 1 suppressed exception";
        //}

        //System.out.println("\n=== Task 2: Hidden exception ===");
        //try {
          //  hiddenExample();
       // } catch (Exception e) {
         //   System.out.println("Caught: " + e);
            // Проверка: suppressed нет
           // assert e.getSuppressed().length == 0 : "No suppressed expected here";
       // }
   // }
// }
