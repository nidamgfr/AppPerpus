
package Model;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;


public class KeyValue {
    
    int key;
    String value;
    private int id;
    private String namaPetugas;

    @Override
    public String toString() {
        return value;
    }   

    public KeyValue(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(String value) {
        this.key = 0;
        this.value = value;
    }

    public KeyValue() {
        this.key = 0;
        this.value = "";
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    

}
    
    
    
