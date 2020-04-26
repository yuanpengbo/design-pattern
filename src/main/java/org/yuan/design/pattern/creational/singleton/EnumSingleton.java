package org.yuan.design.pattern.creational.singleton;

import javax.xml.crypto.Data;
import java.util.Date;

public enum EnumSingleton {
    INTERFACE {
        public void print(){
            System.out.println("INTERFACE");
        }
    };

    protected abstract void print();
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
