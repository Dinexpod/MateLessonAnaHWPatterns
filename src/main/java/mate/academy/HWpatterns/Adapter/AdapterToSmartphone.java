package mate.academy.HWpatterns.Adapter;

public class AdapterToSmartphone extends Smartphone implements Phone {
    Smartphone myPhone = new Smartphone();

    @Override
    public void pushToCall() {
        myPhone.touchToCall();
    }

    @Override
    public void pushToClose() {
        myPhone.touchToClose();
    }

    @Override
    public void pushToPlay() {
        myPhone.touchToPlay();
    }
}
