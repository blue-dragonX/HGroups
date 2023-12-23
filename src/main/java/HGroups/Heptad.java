package HGroups;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldMayBeFinal", "unchecked", "unused"})
public class Heptad<S,T,U,V,W,X,Y> {
    private S data;
    private T data2;
    private U data3;
    private V data4;
    private W data5;
    private X data6;
    private Y data7;

    public Heptad(S data, T data2, U data3, V data4, W data5, X data6, Y data7) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7= data7;
    }
    public Heptad(Hexad<S,T,U,V,W,X> hexad, Y data7){
        this.data = hexad.retrieve(1);
        this.data2 =hexad.retrieve(2);
        this.data3 =hexad.retrieve(3);
        this.data4 =hexad.retrieve(1);
        this.data5 =hexad.retrieve(2);
        this.data6 =hexad.retrieve(3);
        this.data7 = data7;}

    public Heptad(Triad<S,T,U> triad1, Triad<V,W,X> triad2, Y data7) {
        this.data = triad1.retrieve(1);
        this.data2 =triad1.retrieve(2);
        this.data3 =triad1.retrieve(3);
        this.data4 =triad2.retrieve(1);
        this.data5 =triad2.retrieve(2);
        this.data6 =triad2.retrieve(3);
        this.data7 = data7;
    }
    public Heptad(Tetrad<S,T,U,V> tetrad, Pair<W,X> pair,Y data7 ) {
        this.data = tetrad.retrieve(1);
        this.data2 =tetrad.retrieve(2);
        this.data3 =tetrad.retrieve(3);
        this.data4 =tetrad.retrieve(4);
        this.data5 =pair.retrieve(1);
        this.data6 =pair.retrieve(2);
        this.data7 = data7;
    }
    public Heptad(@NotNull Pentad<S,T,U,V,W> pentad, Pair<X,Y> pair) {
        this.data = pentad.retrieve(1);
        this.data2 =pentad.retrieve(2);
        this.data3 =pentad.retrieve(3);
        this.data4 =pentad.retrieve(4);
        this.data5 =pentad.retrieve(5);
        this.data6 = pair.retrieve(1);
        this.data7 = pair.retrieve(2);
    }
    public<Z> Z retrieve(int i){
        return switch (i) {
            case 1->(Z) data;
            case 2-> (Z) data2;
            case 3->(Z) data3;
            case 4-> (Z) data4;
            case 5->(Z) data5;
            case 6->(Z) data6;
            case 7->(Z) data7;
            default-> throw new NullPointerException("\nInvalid entry: "+i);
        };
    }
    public<W1> Hexad get(W1 dataAsk){
        if(dataAsk!=null && dataAsk.equals(this.data))
            return new Hexad<>(this.data2,this.data3,this.data4,this.data5,this.data6,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data2))
            return new Hexad<>(this.data,this.data3,this.data4,this.data5,this.data6,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data3))
            return new Hexad<>(this.data,this.data2,this.data4,this.data5,this.data6,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data4))
            return new Hexad<>(this.data,this.data2,this.data3,this.data5, this.data6,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data5))
            return new Hexad<>(this.data,this.data2,this.data3,this.data4,this.data6,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data6))
           return new Hexad<>(this.data,this.data2,this.data3,this.data4,this.data5,this.data7);
        else if(dataAsk!=null && dataAsk.equals(this.data7))
        return new Hexad<>(this.data2,this.data3,this.data4,this.data5,this.data6,this.data7);

        else
            throw new NullPointerException("Invalid entry: "+dataAsk);
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s, %s, %s, %s, %s", data, data2,data3,data4,data5,data6,data7);
    }

}
