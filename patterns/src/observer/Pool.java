package observer;

import composite.Printer;
import state.Print;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by student on 02.04.2017.
 */
public class Pool {

    private Queue<Print> printList = new PriorityQueue<Print>();

    public void addPrint(Print print){
        printList.add(print);
    }

    public void notifyPool(Printer printer) {
        Print toPrint = printList.peek();
        printer.print(toPrint.getContent());
        printList.remove(toPrint);
    }
}
