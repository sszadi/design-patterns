package singleton;

/**
 * Created by student on 02.04.2017.
 */
public class PrintManager {
    private double darkPrice;
    private double colorPrice;
    private static PrintManager printManager;

    private PrintManager(){
        darkPrice = 2.00;
        colorPrice = 5.00;
    }

    public static PrintManager getInstance() {
        if (printManager == null){
            printManager = new PrintManager();
            return printManager;
        }
        return printManager;
    }

    public double getDarkPrice() {
        return darkPrice;
    }

    public void setDarkPrice(double darkPrice) {
        this.darkPrice = darkPrice;
    }

    public double getColorPrice() {
        return colorPrice;
    }

    public void setColorPrice(double colorPrice) {
        this.colorPrice = colorPrice;
    }
}
