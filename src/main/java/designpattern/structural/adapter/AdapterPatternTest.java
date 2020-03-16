package designpattern.structural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImp();
        Volt v30 = sockAdapter.get30Volt();
        Volt v60 = sockAdapter.get60Volt();
        Volt v120 = sockAdapter.get120Volt();
        System.out.println(v30.getVolt());
        System.out.println(v60.getVolt());
        System.out.println(v120.getVolt());
    }
}
