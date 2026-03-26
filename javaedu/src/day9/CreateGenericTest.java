package day9;

import java.util.Date;

public class CreateGenericTest {
    public static void main(String[] args) {
        Value1 v1 = new Value1();
        v1.put("듀크"); 
        String name = (String) v1.get(); 
        System.out.println("v1: " + name);

        Value2 v2 = new Value2();
        v2.put("듀크2"); 
        name = (String) v2.get(); 
        System.out.println("v2: " + name);
        v2.put(new Date());
        Date now = (Date)v2.get();
        System.out.println(now);
        
        Value3<String> v3 = new Value3<String>();
        Value3<Date> v4 = new Value3<Date>();
        v3.put("듀크3");
        name = v3.get();
        System.out.println(name);
        v4.put(new Date());
        now = v4.get();
        System.out.println(now);
    }
}

class Value1 {
    Object obj;
    void put(Object obj) {
        this.obj = obj;
    }
    Object get() {
        return obj;
    }
}

class Value2 {
    Object obj;
    void put(Object obj) {
        this.obj = obj;
    }
    Object get() {
        return obj;
    }
}

class Value3<T> {
    T obj;
    void put(T obj) {
        this.obj = obj;
    }
    T get() {
        return obj;
    }
}