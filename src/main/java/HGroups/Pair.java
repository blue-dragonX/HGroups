package HGroups;

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


}
