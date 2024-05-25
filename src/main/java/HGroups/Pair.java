package HGroups;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings({"unchecked", "FieldMayBeFinal"})
public class Pair<T, U> {
   private T data;
   private  U data2;


    public Pair(T data, U data2){
        this.data= data;
        this.data2= data2;
    }

    public<V,W> V get(W dataAsk){
        if(dataAsk!=null && dataAsk.equals(this.data))
                return (V) data2 ;
        else if(dataAsk!=null && dataAsk.equals(this.data2))
            return (V) data;

        else
            throw new NullPointerException("Invalid entry: "+dataAsk);
    }
    public<Y> Y retrieve(int i){
        return switch (i) {
            case 1 -> (Y) data;
            case 2 -> (Y) data2;
            default -> throw new NullPointerException("Invalid entry: " +
                    ""+i);
        };
    }

    public void printGroup(){
        System.out.printf("%s, %s", data, data2);
    }

    public <A> void getInfo(A query) {
        Method[] methods = query.getClass().getMethods();
        Field[] fields = query.getClass().getFields();
        System.out.printf("%s \n Fields(Public):", query.getClass());
        for (Field field : fields) {
            System.out.printf(" %s,", field);
        }
        System.out.println();
        System.out.println("Methods(Public):");
        for (Method method : methods) {
            System.out.printf(" %s,", method);
        }
    }
}
