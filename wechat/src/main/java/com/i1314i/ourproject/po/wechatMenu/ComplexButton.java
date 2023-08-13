package com.i1314i.ourproject.po.wechatMenu;

import java.util.List;

/**
 * 复杂按钮（父按钮）
 *
 *@author Engineer-Jsp 
 *@date 2014.06.23
 */
public class ComplexButton extends Button {
    private List<Button> sub_button;

    public List<Button> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<Button> sub_button) {
        this.sub_button = sub_button;
    }
}
