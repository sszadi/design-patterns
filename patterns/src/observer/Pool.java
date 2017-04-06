package observer;

import composite.Printer;
import singleton.PrintManager;
import state.Print;
import state.Type;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by student on 02.04.2017.
 */
public class Pool {


    private Queue<Print> printList = new PriorityQueue<Print>();

    public void addPrint(User user, Print print) {
        payForPrint(user, print);
        printList.add(print);
    }

    private void payForPrint(User user, Print print) {
        double account = user.getAccount();
        double paidForPage = getPaidForPage(print.getPrintType());
        double paid = print.getPageAmount() * paidForPage;
        user.setAccount(account - paid);
    }

    private double getPaidForPage(Type printType) {
        PrintManager printManager = PrintManager.getInstance();
        switch (printType) {
            case COLOR:
                return printManager.getColorPrice();
            case MONOCHROMATIC:
                return printManager.getDarkPrice();
        }
        return 1;
    }

    public void notifyPool(Printer printer) {
        Print toPrint = printList.peek();
        printer.print(toPrint.getContent());
        printList.remove(toPrint);
    }
}
