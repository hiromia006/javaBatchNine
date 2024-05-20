package class8;

import class3.Pen;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("========= non Generic ==========");
        StringTest test=new StringTest("Hanif");
        System.out.println(test.getStr());

        IntegerTest integerTest=new IntegerTest(100);
        System.out.println(integerTest.getInteger());

        LongTest longTest=new LongTest(987l);
        System.out.println(longTest.getaLong());

        DoubleTest doubleTest=new DoubleTest(987.50);
        System.out.println(doubleTest.getaDouble());

        System.out.println("=========  Generic ==========");
        Generic<String> stringGeneric=new Generic<>("Sagor");
        System.out.println(stringGeneric.getObj());

        Generic<Integer> generic=new Generic<>(987);
        System.out.println(generic.getObj());

        Generic<Float> floatGeneric=new Generic<>(987.52f);
        System.out.println(floatGeneric.getObj());

        Generic<Long> longGeneric=new Generic<>(95421l);
        System.out.println(longGeneric.getObj());

    }
}
