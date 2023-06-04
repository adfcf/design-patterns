import creation.abstractfactory.ClientFrame;
import creation.factorymethod.CnpjGenerator;
import creation.factorymethod.IDGenerator;

public final class Main {
    public static void main(String[] args) {

        ClientFrame f = new ClientFrame();

        IDGenerator gen = new CnpjGenerator();
        System.out.println(gen.create().getId());

    }
}