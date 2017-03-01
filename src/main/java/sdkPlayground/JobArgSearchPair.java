package sdkPlayground;

import com.splunk.JobArgs;

/**
 * Created by rdimri on 2/22/17.
 */
public class JobArgSearchPair {

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public JobArgs getJobArg() {
        return jobArg;
    }

    public void setJobArg(JobArgs jobArg) {
        this.jobArg = jobArg;
    }

    private String searchString;
    private JobArgs jobArg;

    public JobArgSearchPair(String searchString, JobArgs jobArgs) {
        this.searchString = searchString;
        this.jobArg = jobArgs;
    }
}
