import abstractfactory.factories.BigWindowFactory;
import abstractfactory.factories.SmallWindowFactory;
import abstractfactory.factories.WindowFactory;
import composite.Printer;
import composite.PrinterGroup;
import observer.User;
import state.Print;
import state.Type;

/**
 * Created by student on 02.04.2017.
 */
public class Main {

    private static int resolution;
    private static WindowFactory windowFactory;

    public static void main(String[] args) {
        //resolution = getResolution();

        if (resolution <  768){
            windowFactory = new SmallWindowFactory();
        }
        else{
            windowFactory = new BigWindowFactory();
        }

        windowFactory.createPrinterWindow();
        //windowFactory.createPrintWindow();

        Printer printer = new Printer();
        PrinterGroup printerGroup = new PrinterGroup();
        printerGroup.add(printer);
        printerGroup.setStatus(true);

        User user = new User();
        Print print = new Print (50, Type.MONOCHROMATIC, "drukuj mnie");
        user.createPrint(print);


    }

}
