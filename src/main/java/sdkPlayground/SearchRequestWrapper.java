package sdkPlayground;

import com.splunk.Job;
import com.splunk.JobArgs;
import com.splunk.JobCollection;

import java.io.InputStream;
import java.util.HashMap;
import com.splunk.*;

/**
 * Created by rdimri on 2/21/17.
 */
public class SearchRequestWrapper {

    public static final long JOB_STATUS_QUERY_TIME = 1;

    private String searchString;
    private JobCollection jobCollection;
    private JobArgs jobArgs;
    private Job job;
    private long startTime;
    private long endTime;

    SearchRequestWrapper(String searchString, JobCollection jobCollection, JobArgs jobArgs) {
        this.searchString = searchString;
        this.jobCollection = jobCollection;
        this.jobArgs = jobArgs;
    }

    public void addSearchJob() {
        if (jobArgs != null) {
            job = jobCollection.create(searchString, jobArgs);
        } else {
            job = jobCollection.create(searchString);
        }
        startTime = System.nanoTime();
    }

    public void waitForJobToFinish() {
        while (!job.isDone()) {
            try {
                Thread.sleep(JOB_STATUS_QUERY_TIME);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted\n");
                e.printStackTrace();
            }

        }
        endTime = System.nanoTime();
    }

    public void printExecutionStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("Search=" + searchString);
        sb.append(" took time=");
        sb.append((endTime - startTime) / 1000000);
        sb.append('\n');
        parseOutResults(sb);
        System.out.println(sb.toString());

    }

    private void parseOutResults(StringBuilder sb) {

        InputStream resultsNormalSearch = job.getResults();

        ResultsReaderXml resultsReaderNormalSearch;

        try {
            resultsReaderNormalSearch = new ResultsReaderXml(resultsNormalSearch);
            HashMap<String, String> event;
            while ((event = resultsReaderNormalSearch.getNextEvent()) != null) {
                sb.append("\n****************EVENT****************\n");
                for (String key : event.keySet())
                    sb.append("   " + key + ":  " + event.get(key));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
