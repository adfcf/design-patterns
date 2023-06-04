package creation.factorymethod;

public final class CpfGenerator implements IDGenerator {
    @Override
    public Cpf create() {
        return new Cpf("xxx.xxx.xxx-xx");
    }
}
