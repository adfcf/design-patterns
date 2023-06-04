package creation.abstractfactory;

import javax.swing.*;
import java.awt.*;

public final class AnnoyingButton extends JButton {

    public AnnoyingButton() {
        super("This is annoying button");
        this.setBackground(Color.YELLOW);
        this.setForeground(Color.CYAN);
    }

}
