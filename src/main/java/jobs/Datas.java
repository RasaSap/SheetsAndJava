package jobs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jobs.Formula;
import jobs.Value;

import java.util.ArrayList;
import java.util.List;

public class Datas {
    @SerializedName("value")
    @Expose
    private Value value;
    @SerializedName("formula")
    @Expose
    private Formula formula;


    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "value=" + value +
                ", formula=" + formula +
                '}';
    }
}
