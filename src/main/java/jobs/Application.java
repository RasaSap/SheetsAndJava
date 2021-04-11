package jobs;

import jobs.Job;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private String submissionUrl;
    ArrayList<Job> jobs;

    public String getSubmissionUrl() {
        return submissionUrl;
    }

    public void setSubmissionUrl(String submissionUrl) {
        this.submissionUrl = submissionUrl;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Application{" +
                "submissionUrl='" + submissionUrl + '\'' +
                ", jobs=" + jobs +
                '}';
    }
}