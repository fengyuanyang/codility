package designpattern.structural.adapter;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get60Volt();

    Volt get30Volt();
}
