package state;

/**
 * Created by student on 02.04.2017.
 */
public class Print {
    private int pageAmount;
    private Type printType;
    private String content;

    public Print(int pageAmount, Type printType, String content) {
        this.pageAmount = pageAmount;
        this.printType = printType;
        this.content = content;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public Type getPrintType() {
        return printType;
    }

    public void setPrintType(Type printType) {
        this.printType = printType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
