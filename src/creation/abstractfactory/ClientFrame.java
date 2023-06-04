package creation.abstractfactory;

import javax.swing.*;
import java.awt.*;

public final class ClientFrame {

    private final JFrame frame;

    public ClientFrame() {

        frame = new JFrame("Program");

        frame.setSize(250, 100);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents();

        frame.setVisible(true);

    }

    private GUIKit getCurrentKit() {
        return AnnoyingKit.getInstance();
        // return BasicKit.getInstance();
    }

    private void addComponents() {

        GUIKit kit = getCurrentKit();

        frame.setLayout(new FlowLayout());

        frame.add(kit.createTextField());
        frame.add(kit.createButton());

    }

}
