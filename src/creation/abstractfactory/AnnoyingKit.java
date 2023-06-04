package creation.abstractfactory;

import javax.swing.*;

public final class AnnoyingKit implements GUIKit {

    private static AnnoyingKit instance;

    private AnnoyingKit() {}

    public static AnnoyingKit getInstance() {
        if (instance == null) {
            instance = new AnnoyingKit();
        }
        return instance;
    }

    @Override
    public JButton createButton() {
        return new AnnoyingButton();
    }

    @Override
    public JTextField createTextField() {
        return new AnnoyingTextField();
    }
}
