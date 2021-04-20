package com.myapplicationdev.android.tw_listview;

public class Module {
    private String moduleName;
    private int imageIcon;

    public Module(String moduleName, int imageIcon) {
        this.moduleName = moduleName;
        this.imageIcon = imageIcon;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getImageIcon() {
        return imageIcon;
    }
}
