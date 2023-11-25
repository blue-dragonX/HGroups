package HGroups;

public class Tetrad<S,T,U,V>  {
    private S data;
    private T data2;
    private U data3;
    private V data4;

    public Tetrad(S data, T data2, U data3, V data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }
    public Tetrad(Pair<S,T> pair1, Pair<U,V> pair2) {
        this.data = pair1.retrieve(1);
        this.data2 = pair1.retrieve(2);
        this.data3 = pair2.retrieve(1);
        this.data4 = pair2.retrieve(2);
    }
    public<Y,Z> Y retrieve(int i){

        if (i==1)
            return (Y)data;
        else if(i==2)
            return (Y)data2;
        else if (i==3)
            return (Y)data3;
        else if (i==4)
            return (Y)data4;
        else
            throw new NullPointerException("Invalid entry: "+i);
    }
    public<X> Triad get(X data) {
        if (data.equals(this.data))
            return  new Triad<>(this.data2, this.data3, this.data4);
        else if (data.equals(this.data2))
            return new Triad<>(this.data, this.data3, this.data4);
        else if (data.equals(this.data3))
            return new Triad<>(this.data, this.data2, this.data4);
        else if (data.equals(this.data4))
            return new Triad<>(this.data, this.data2, this.data3);
        else
            throw new NullPointerException("Invalid entry: "+data);
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s, %s", data, data2,data3,data4);
    }

}
