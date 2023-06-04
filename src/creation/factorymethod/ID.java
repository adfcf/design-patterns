package creation.factorymethod;

public abstract class ID {

    private String id;

    public ID(String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

}
