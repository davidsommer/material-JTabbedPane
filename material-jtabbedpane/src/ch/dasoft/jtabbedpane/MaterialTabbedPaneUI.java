package ch.dasoft.jtabbedpane;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

class MaterialTabbedPaneUI extends BasicTabbedPaneUI {

  @Override
  protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
    y = y + 30; // TODO in Variable
    Graphics2D g2D = (Graphics2D) g;
    int xp[];
    int yp[];
    switch (tabPlacement) {
      case LEFT: // TODO TEST
        xp = new int[]{x, x, x, x + w, x + w, x + w, x + w, x};
        yp = new int[]{y + h, y, y, y, y, y, y + h, y + h};
        break;
      case RIGHT: // TODO TEST
        xp = new int[]{x, x, x, x + w, x + w, x + w, x + w, x};
        yp = new int[]{y + h, y, y, y, y, y, y + h, y + h};
        break;
      case BOTTOM: // TODO TEST
        xp = new int[]{x, x, x, x + w, x + w, x + w, x + w, x};
        yp = new int[]{y + h, y, y, y, y, y, y + h, y + h};
        break;
      case TOP:
      default:
        xp = new int[]{x, x, x, x + w, x + w, x + w, x + w, x};
        yp = new int[]{y + h, y, y, y, y, y, y + h, y + h};
        break;
    }

    final Polygon shape = new Polygon(xp, yp, xp.length);

    if (isSelected) {
      g2D.setColor(new Color(108, 151, 213)); // TODO auslagern
      g2D.setPaint(new Color(108, 151, 213));
    } else {
      if (tabPane.isEnabled() && tabPane.isEnabledAt(tabIndex)) {
        g2D.setColor(new Color(131, 143, 157)); // TODO auslagern
        g2D.setPaint(new Color(232, 232, 232));
      } else {
        g2D.setColor(new Color(232, 232, 232)); // TODO auslagern
        g2D.setPaint(new Color(232, 232, 232));
      }
    }

    g2D.fill(shape);
  }

  @Override
  protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
    if (tabPlacement == LEFT || tabPlacement == RIGHT) {
      return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
    } else {
      return 18 + super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
    }
  }

  @Override
  protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) { }

  @Override
  protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) { }

  @Override
  protected void paintContentBorder(Graphics graphics, int i, int i1) { }
}