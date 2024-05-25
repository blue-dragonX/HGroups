package HGroups;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Triad<S,T,U> {
   private S data;
    private T data2;
    private U data3;

    public Triad(S data, T data2, U data3){
        this.data= data;
       this.data2= data2;
       this.data3= data3;
    }

    public<X> Pair get(X data) {
        if (data.equals(this.data))
            return  new Pair<>(this.data2, this.data3);
        else if (data.equals(this.data2))
            return new Pair<>(this.data, this.data3);
        else if (data.equals(this.data3))
            return new Pair<>(this.data, this.data2);
        else
            throw new NullPointerException("Invalid entry: "+data);
    }

    public <Y> Y retrieve(int i){
        return switch (i) {
            case 1->  (Y)data;
            case 2-> (Y) data2;
            case 3->(Y)data3;
            default->throw new NullPointerException("Invalid entry: "+i);
        };
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s", data, data2,data3);
    }
    public<Y> void getInfo(Y query){
        Method[] methods = query.getClass().getMethods();
        Field[] fields = query.getClass().getFields();
        System.out.printf("%s \n Fields(Public):", query.getClass());
        for (Field field: fields) {
            System.out.printf(" %s,",field);
        }
        System.out.println();
        System.out.println("Methods(Public):");
        for (Method method: methods) {
            System.out.printf(" %s,",method);
        }
    }

}

