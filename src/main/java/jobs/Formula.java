package jobs;

import java.util.List;
import java.util.Map;

public class Formula {

    private Map<String, List<Reference>> references = null;

    public Map<String, List<Reference>> getReferences() {
        return references;
    }

    public void setReferences(Map<String, List<Reference>> references) {
        this.references = references;

    }

    @Override
    public String toString() {
        return "Formula{" +
                "references=" + references +
                '}';
    }
}

