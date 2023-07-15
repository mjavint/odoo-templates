package org.mjavint.plugins.odootemplates;

import com.intellij.ide.highlighter.XmlFileType;
import com.intellij.openapi.util.IconLoader;
import com.jetbrains.python.PythonFileType;

import javax.swing.*;

/**
 * @author Amr Abd-Alkrim
 */
public class OdooIcons {
  private static Icon load(String path) {
    return IconLoader.getIcon(path, OdooIcons.class);
  }

  public static final Icon Odoo = load("/icons/odoo.svg");
  public static final Icon OdooIcon = load("/icons/odoo_icon.svg");

  public static final Icon PythonIcon = PythonFileType.INSTANCE.getIcon();
  public static final Icon XmlIcon = XmlFileType.INSTANCE.getIcon();
  public static final Icon CsvIcon = load("/icons/csv.png");
}
