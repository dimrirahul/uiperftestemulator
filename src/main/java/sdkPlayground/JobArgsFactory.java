package sdkPlayground;

import com.splunk.JobArgs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rdimri on 2/22/17.
 */
public class JobArgsFactory {
    public static final String EARLIEST_TIME = "earliestTime";
    public static final String LATEST_TIME = "latestTime";
    public JobArgs getJobArgs(Map<String, String> params) {
        JobArgs jobArgs = new JobArgs();
        jobArgs.setExecutionMode(JobArgs.ExecutionMode.NORMAL);

        if (params.containsKey(EARLIEST_TIME))
            jobArgs.setEarliestTime(params.get(EARLIEST_TIME));

        if (params.containsKey(LATEST_TIME))
            jobArgs.setLatestTime(params.get(LATEST_TIME));

        return jobArgs;
    }

    public JobArgsFactory() {

    }

    private void fillLatestTime(Map<String, String> params) {
        params.put(LATEST_TIME, "now");
    }

    private void fillEarliestTime(Map<String, String> params) {
        params.put(EARLIEST_TIME, "0");
    }

    public JobArgs getJobArgsWithLatestNow() {
        Map<String, String> params = new HashMap<>();
        fillLatestTime(params);
        return getJobArgs(params);
    }

    public JobArgs getJobArgsWithEarliestTimeAsZero() {
        Map<String, String> params = new HashMap<>();
        fillEarliestTime(params);
        return getJobArgs(params);
    }

    public JobArgs getJobArgsWithEarliestTimeAsZeroAndLatestNow() {
        Map<String, String> params = new HashMap<>();
        fillEarliestTime(params);
        fillLatestTime(params);
        return getJobArgs(params);
    }
}
