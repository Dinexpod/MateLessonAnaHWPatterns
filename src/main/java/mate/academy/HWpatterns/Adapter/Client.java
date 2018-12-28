package mate.academy.HWpatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Phone iPhone = new AdapterToSmartphone();

        iPhone.pushToCall();
        iPhone.pushToPlay();
        iPhone.pushToClose();
    }
}
