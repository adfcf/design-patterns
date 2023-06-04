package creation.factorymethod;

public class CnpjGenerator implements IDGenerator {
    @Override
    public Cnpj create() {
        return new Cnpj("xx.xxx.xxx/xxxx-xx");
    }
}
