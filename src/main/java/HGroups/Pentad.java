package HGroups;



@SuppressWarnings({"FieldMayBeFinal", "unchecked", "unused"})
public class Pentad<S,T,U,W,X> {
    private S data;
    private T data2;
    private U data3;
    private W data4;
    private X data5;

    public Pentad(S data, T data2, U data3, W data4, X data5) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
    }

    public Pentad(Triad<S,T,U> triad, Pair<W,X> pair) {
        this.data = triad.retrieve(1);
        this.data2 =triad.retrieve(2);
        this.data3 =triad.retrieve(3);
        this.data4 =pair.retrieve(1);
        this.data5 =pair.retrieve(2);
    }
    public<Y> Y retrieve(int i){
        return switch (i) {
            case 1->(Y) data;
            case 2-> (Y) data2;
            case 3->(Y) data3;
            case 4-> (Y) data4;
            case 5->(Y) data5;
            default-> throw new NullPointerException("Invalid entry: "+i);
        };
    }
    public Tetrad get(W dataAsk){
        if(dataAsk!=null && dataAsk.equals(this.data)) {
            return new Tetrad<>(this.data2,this.data3,this.data4,this.data5);
        } else if(dataAsk!=null && dataAsk.equals(this.data2))
            return new Tetrad<>(this.data,this.data3,this.data4,this.data5);
        else if(dataAsk!=null && dataAsk.equals(this.data3))
            return new Tetrad<>(this.data,this.data2,this.data4,this.data5);
        else if(dataAsk!=null && dataAsk.equals(this.data4))
            return new Tetrad<>(this.data,this.data2,this.data3,this.data5);
        else if(dataAsk!=null && dataAsk.equals(this.data5))
            return new Tetrad<>(this.data,this.data2,this.data3,this.data4);
        else
            throw new NullPointerException("Invalid entry: "+dataAsk);
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s,%s,%s", data, data2,data3,data4,data5);
    }
}
