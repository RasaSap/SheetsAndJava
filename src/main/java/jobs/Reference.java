package jobs;

import java.util.List;

public class Reference {
    String reference;

    public Reference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "reference='" + reference + '\'' +
                '}';
    }
}

