package class8;

public class NumberTest<N extends Number> {
    private N obj;
    public NumberTest(N obj){
        this.obj=obj;
    }

    public N getObj(){
        return obj;
    }
}
