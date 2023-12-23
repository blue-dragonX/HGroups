package HGroups;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldMayBeFinal", "unchecked", "unused"})
public class Ennead<R,S,T,U,V,W,X,Y,Z> {
    private S data;
    private T data2;
    private U data3;
    private V data4;
    private W data5;
    private X data6;
    private Y data7;
    private Z data8;
    private R data9;

    public Ennead(S data, T data2, U data3, V data4, W data5, X data6, Y data7, Z data8, R data9) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7= data7;
        this.data8 = data8;
        this.data9=data9;
    }
    public Ennead(Hexad<S,T,U,V,W,X> hexad, Triad<Y,Z,R> triad){
        this.data = hexad.retrieve(1);
        this.data2 =hexad.retrieve(2);
        this.data3 =hexad.retrieve(3);
        this.data4 =hexad.retrieve(1);
        this.data5 =hexad.retrieve(2);
        this.data6 =hexad.retrieve(3);
        this.data7 = triad.retrieve(1);
        this.data8 = triad.retrieve(2);
        this.data9= triad.retrieve(3);
    }
    public Ennead(Tetrad<S,T,U,V> tetrad1, Tetrad<V,W,X,Y> tetrad2, R data9) {
        this.data = tetrad1.retrieve(1);
        this.data2 =tetrad1.retrieve(2);
        this.data3 =tetrad1.retrieve(3);
        this.data4= tetrad1.retrieve(4);
        this.data5 =tetrad2.retrieve(1);
        this.data6 =tetrad2.retrieve(2);
        this.data7 =tetrad2.retrieve(3);
        this.data8 = tetrad2.retrieve(4);
        this.data9 = data9;
    }

    public Ennead(Triad<S,T,U> triad1, Triad<V,W,X> triad2, Triad<Y,Z,R> triad3) {
        this.data = triad1.retrieve(1);
        this.data2 =triad1.retrieve(2);
        this.data3 =triad1.retrieve(3);
        this.data4 =triad2.retrieve(1);
        this.data5 =triad2.retrieve(2);
        this.data6 =triad2.retrieve(3);
        this.data7 = triad3.retrieve(1);
        this.data8 = triad3.retrieve(2);
        this.data9 = triad3.retrieve(3);
    }
    public Ennead(Tetrad<S,T,U,V> tetrad, Pair<W,X> pair, Y data7 ) {
        this.data = tetrad.retrieve(1);
        this.data2 =tetrad.retrieve(2);
        this.data3 =tetrad.retrieve(3);
        this.data4 =tetrad.retrieve(4);
        this.data5 =pair.retrieve(1);
        this.data6 =pair.retrieve(2);
        this.data7 = data7;
    }
    public Ennead(@NotNull Pentad<S,T,U,V,W> pentad, Tetrad<X,Y,Z,R> tetrad) {
        this.data = pentad.retrieve(1);
        this.data2 =pentad.retrieve(2);
        this.data3 =pentad.retrieve(3);
        this.data4 =pentad.retrieve(4);
        this.data5 =pentad.retrieve(5);
        this.data6 = tetrad.retrieve(1);
        this.data7 = tetrad.retrieve(2);
        this.data8= tetrad.retrieve(3);
        this.data9= tetrad.retrieve(4);
    }
    public<A> A retrieve(int i){
        return switch (i) {
            case 1->(A) data;
            case 2-> (A) data2;
            case 3->(A) data3;
            case 4-> (A) data4;
            case 5->(A) data5;
            case 6->(A) data6;
            case 7->(A) data7;
            case 8 ->(A) data8;
            case 9-> (A) data9;
            default-> throw new NullPointerException("\nInvalid entry: "+i);
        };
    }
    public<W1> Octad get(W1 dataAsk){
        if(dataAsk!=null && dataAsk.equals(this.data))
            return new Octad<>(this.data2,this.data3,this.data4,this.data5,this.data6,this.data7, this.data8, this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data2))
            return new Octad<>(this.data,this.data3,this.data4,this.data5,this.data6,this.data7, this.data8,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data3))
            return new Octad<>(this.data,this.data2,this.data4,this.data5,this.data6,this.data7,this.data8, this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data4))
            return new Octad<>(this.data,this.data2,this.data3,this.data5, this.data6,this.data7,this.data8,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data5))
            return new Octad<>(this.data,this.data2,this.data3,this.data4,this.data6,this.data7,this.data8,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data6))
           return new Octad<>(this.data,this.data2,this.data3,this.data4,this.data5,this.data7,this.data8,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data7))
            return new Octad<>(this.data2,this.data3,this.data4,this.data5,this.data6,this.data7, this.data8,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data8))
            return new Octad<>(this.data, this.data2,this.data3,this.data4,this.data5,this.data6,this.data7,this.data9);
        else if(dataAsk!=null && dataAsk.equals(this.data9))
            return new Octad<>(this.data, this.data2,this.data3,this.data4,this.data5,this.data6,this.data7,this.data8);
        else
            throw new NullPointerException("Invalid entry: "+dataAsk);
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s, %s", data, data2,data3,data4,data5,data6,data7, data8, data9);
    }

}
