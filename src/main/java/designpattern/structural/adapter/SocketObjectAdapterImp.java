package designpattern.structural.adapter;

public class SocketObjectAdapterImp implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get60Volt() {
        return convertVolt(socket.getVolt(), 2);
    }

    @Override
    public Volt get30Volt() {
        return convertVolt(socket.getVolt(), 4);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolt()/i);
    }
}
