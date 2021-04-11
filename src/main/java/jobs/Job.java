package jobs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Job {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("data")
    @Expose
    private ArrayList<DatasWrapper> datasWrapper;

    public Job(String id, ArrayList<DatasWrapper> datasWrapper) {
        this.id = id;
        this.datasWrapper = datasWrapper;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<DatasWrapper> getData() {
        return datasWrapper;
    }

    public void setData(ArrayList<DatasWrapper> datas) {
        this.datasWrapper = datasWrapper;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", dataWrapper=" + datasWrapper +
                '}';
    }
}
