package com.i1314i.ourproject.po.wechatMenu;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-09-30 16:55
 **/
public class Menu {
    List<Button> button;

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "button=" + button +
                '}';
    }
}
