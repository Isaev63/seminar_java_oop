package main.drugstore;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public String toString() {
        return "Pharmacy = " + components.size() + " components";
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.components.size(), o.components.size());
    }
}
