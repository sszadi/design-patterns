package composite;

import observer.Pool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 02.04.2017.
 */
public class Printer {

    private float id;
    private String model;
    private String sign;
    private boolean status;
    private List<Pool> poolList = new ArrayList();

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void register(Pool pool){
        poolList.add(pool);
    }

    public void deregister(Pool pool){
        poolList.remove(pool);
    }

    public void notifyAllPools(){
        for (Pool pool: poolList) {
            pool.notifyPool(this);
        }
    }

    public void print(String print){
        System.out.println("Drukuje" + print);
    }

}
