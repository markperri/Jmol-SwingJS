package org.jmol.api;

import javajs.awt.SC;

public interface GenericMenuInterface {

  public void jpiDispose();
  public Object jpiGetMenuAsObject();
  public String jpiGetMenuAsString(String string);
  public void jpiInitialize(PlatformViewer vwr, String menu);
  public void jpiShow(int x, int y);
  public void jpiUpdateComputedMenus();
  
  public void menuClickCallback(SC source, String actionCommand);
  public void menuFocusCallback(String name, String actionCommand, boolean b);
  public void menuCheckBoxCallback(SC source);
  
  public Object jpiSetProperty(String name, Object value);

 
}
