package sdkPlayground;

import com.splunk.*;

/**
 * Created by rdimri on 2/21/17.
 */
public class SplunkServiceFactory {
    public Service getSplukService() {
        return getSplunkService("admin", "changeme");
    }

    public Service getSplunkService(String username, String password) {

        ServiceArgs serviceArgs = new ServiceArgs();
        serviceArgs.setHost("perf007.sv.splunk.com");
        serviceArgs.setUsername(username);
        serviceArgs.setPassword(password);
        serviceArgs.setPort(8089);

        return new Service(serviceArgs);
    }
}

