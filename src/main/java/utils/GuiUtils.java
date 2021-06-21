package utils;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.function.Consumer;
import javax.swing.JFrame;

public class GuiUtils {
    public static void addWindowClosingListener(JFrame frame, Consumer<WindowEvent> callback) {
        frame.addWindowListener(
                new EmptyWindowListener() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        callback.accept(e);
                    }
                }
        );
    }
}

class EmptyWindowListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
