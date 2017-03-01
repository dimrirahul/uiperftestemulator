package sdkPlayground;

import com.splunk.JobCollection;
import com.splunk.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdimri on 2/22/17.
 */
public class BrowserEmulator implements Runnable {
    private Service splunkService;
    private JobCollection jobCollection;

    private void makeSearchRequests(boolean runOnce) {
        while (true){
            List<JobArgSearchPair> searchesToRun = new DashboardSearches().getSearchesToRun();
            List<SearchRequestWrapper> searchRequestWrappers = new ArrayList<>();
            for (JobArgSearchPair searchPair : searchesToRun) {
                SearchRequestWrapper searchRequestWrapper = new SearchRequestWrapper(searchPair.getSearchString(), jobCollection, searchPair.getJobArg());
                searchRequestWrappers.add(searchRequestWrapper);
            }

            for (SearchRequestWrapper searchRequestWrapper : searchRequestWrappers) {
                searchRequestWrapper.addSearchJob();
            }

            for (SearchRequestWrapper searchRequestWrapper : searchRequestWrappers) {
                searchRequestWrapper.waitForJobToFinish();
                searchRequestWrapper.printExecutionStats();
            }
            if (runOnce)
                break;
        }

    }

    public void run() {
        makeSearchRequests(false);
    }

    public BrowserEmulator(String username, String password) {
        SplunkServiceFactory splunkServiceFactory = new SplunkServiceFactory();
        splunkService = splunkServiceFactory.getSplunkService(username, password);
        splunkService.login();
        jobCollection = splunkService.getJobs();

    }
}
