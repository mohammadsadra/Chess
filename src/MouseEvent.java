import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MouseEvent implements MouseListener {
    private JButton[][] bfield = new JButton[8][8];

    public MouseEvent(JButton[][] bfield) {
        this.bfield = bfield;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        if (e.getClickCount() == 2) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == 1)
                        if (j % 2 == 0) {
                            bfield[j][i].setBackground(Color.WHITE);

                        } else
                            bfield[j][i].setBackground(Color.BLACK);
                    else {
                        if (j % 2 == 0)
                            bfield[j][i].setBackground(Color.BLACK);
                        else
                            bfield[j][i].setBackground(Color.WHITE);
                    }
                }
            }
        }

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }


}
