package sdkPlayground;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by rdimri on 2/21/17.
 */


public class Main {


    public static void main(String[] args){
        SplunkServiceFactory splunkServiceFactory = new SplunkServiceFactory();
        //List<BrowserEmulator> browserEmulators = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(100);
        int numUsersToEmulate = 3;

        for (int i = 1; i <= numUsersToEmulate; i++ ) {
            StringBuilder sb = new StringBuilder();
            sb.append("admin");
            sb.append(i);
            BrowserEmulator browserEmulator = new BrowserEmulator(sb.toString(), "changeme");
            Runnable worker = new Thread(browserEmulator);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }

    }
}
