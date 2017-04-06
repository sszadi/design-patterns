package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 02.04.2017.
 */
public class PrinterGroup extends Printer{

    private List<Printer> printerList = new ArrayList<Printer>();

    public void add (Printer printer){
        printerList.add(printer);
    }

    public void remove (Printer printer){
        printerList.remove(printer);
    }

    public void setStatus(boolean status){
        for (Printer printer: printerList) {
            printer.setStatus(status);
        }

    }



}
