package jobs;


import java.util.List;

public class DatasWrapper {

    private List<Datas> dataWrapperList;

    public List<Datas> getDataWrapperList() {
        return dataWrapperList;
    }

    public void setDataWrapperList(List<Datas> dataWrapperList) {
        this.dataWrapperList = dataWrapperList;
    }

    public DatasWrapper(List<Datas> dataWrapperList) {
        this.dataWrapperList = dataWrapperList;
    }

    @Override
    public String toString() {
        return "DatasWrapper{" +
                "dataWrapperList=" + dataWrapperList +
                '}';
    }
}
