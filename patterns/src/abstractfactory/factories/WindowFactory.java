package abstractfactory.factories;

import abstractfactory.products.print.PrintWindow;
import abstractfactory.products.printer.PrinterWindow;

/**
 * Created by student on 02.04.2017.
 */
public interface WindowFactory {

    PrinterWindow createPrinterWindow();

    PrintWindow createPrintWindow();


}
