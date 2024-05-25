package HGroups;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Hexad<S,T,U,V,W,X> {
    private S data;
    private T data2;
    private U data3;
    private V data4;
    private W data5;
    private X data6;

    public Hexad(S data, T data2, U data3, V data4, W data5, X data6) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
    }

    public Hexad(Triad<S,T,U> triad1, Triad<V,W,X> triad2) {
        this.data = triad1.retrieve(1);
        this.data2 =triad1.retrieve(2);
        this.data3 =triad1.retrieve(3);
        this.data4 =triad2.retrieve(1);
        this.data5 =triad2.retrieve(2);
        this.data6 =triad2.retrieve(3);
    }
    public Hexad(Tetrad<S,T,U,V> tetrad, Pair<W,X> pair) {
        this.data = tetrad.retrieve(1);
        this.data2 =tetrad.retrieve(2);
        this.data3 =tetrad.retrieve(3);
        this.data4 =tetrad.retrieve(4);
        this.data5 =pair.retrieve(1);
        this.data6 =pair.retrieve(2);
    }
    public Hexad(Pentad<S,T,U,V,W> pentad,X data) {
        this.data = pentad.retrieve(1);
        this.data2 =pentad.retrieve(2);
        this.data3 =pentad.retrieve(3);
        this.data4 =pentad.retrieve(4);
        this.data5 =pentad.retrieve(5);
        this.data6 = data;
    }
    public<Y> Y retrieve(int i){
        return switch (i) {
            case 1->(Y) data;
            case 2-> (Y) data2;
            case 3->(Y) data3;
            case 4-> (Y) data4;
            case 5->(Y) data5;
            case 6->(Y) data6;
            default-> throw new NullPointerException("Invalid entry: "+i);
        };
    }
    public<W1> Pentad get(W1 dataAsk){
        if(dataAsk!=null && dataAsk.equals(this.data))
            return new Pentad<>(this.data2,this.data3,this.data4,this.data5,this.data6);
        else if(dataAsk!=null && dataAsk.equals(this.data2))
            return new Pentad<>(this.data,this.data3,this.data4,this.data5,this.data6);
        else if(dataAsk!=null && dataAsk.equals(this.data3))
            return new Pentad<>(this.data,this.data2,this.data4,this.data5,this.data6);
        else if(dataAsk!=null && dataAsk.equals(this.data4))
            return new Pentad<>(this.data,this.data2,this.data3,this.data5, this.data6);
        else if(dataAsk!=null && dataAsk.equals(this.data5))
            return new Pentad<>(this.data,this.data2,this.data3,this.data4,this.data6);
        else if(dataAsk!=null && dataAsk.equals(this.data6))
           return new Pentad<>(this.data,this.data2,this.data3,this.data4,this.data5);

        else
            throw new NullPointerException("Invalid entry: "+dataAsk);
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s, %s, %s, %s", data, data2,data3,data4,data5,data6);
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
