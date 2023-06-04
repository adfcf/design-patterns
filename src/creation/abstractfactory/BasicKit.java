package creation.abstractfactory;

import javax.swing.*;

public final class BasicKit implements GUIKit {

    private static BasicKit instance;

    private BasicKit() {}

    public static BasicKit getInstance() {
        if (instance == null) {
            instance = new BasicKit();
        }
        return instance;
    }

    @Override
    public JButton createButton() {
        return new JButton("Basic button");
    }

    @Override
    public JTextField createTextField() {
        return new JTextField("Type here");
    }

}
