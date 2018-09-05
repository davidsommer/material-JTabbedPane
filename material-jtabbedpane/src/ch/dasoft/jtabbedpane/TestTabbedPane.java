package ch.dasoft.jtabbedpane;

import javax.swing.*;
import java.awt.*;

public class TestTabbedPane extends JPanel {

  private static final long serialVersionUID = 1L;

  private TestTabbedPane() {
    setLayout(new BorderLayout());
    JPanel jp = new JPanel();
    jp.setLayout(new BorderLayout());
    JTabbedPane tb = new JTabbedPane();
    tb.setUI(new MaterialTabbedPaneUI());

    tb.add("Tab1", new JTextArea("1"));
    tb.add("Tab2", new JTextArea("2"));
    tb.add("Tab3", new JTextArea("3"));
    tb.add("Tab4", new JTextArea("4"));
    tb.add("Tab5", new JTextArea("5"));

    jp.add(tb, BorderLayout.CENTER);
    add(jp, BorderLayout.CENTER);
    tb.setEnabledAt(1, false);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new TestTabbedPane());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 200);
    frame.setVisible(true);
  }

}