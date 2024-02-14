package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.ReportManager;

import java.util.Collection;

public class DisplayPrinter implements ReportManager {
    public void output(Collection<ReportItem> items) {
        System.err.println("Output you display");
        for (ReportItem item : items) {
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
