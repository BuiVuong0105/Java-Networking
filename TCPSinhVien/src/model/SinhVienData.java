/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class SinhVienData implements Serializable {

    private String action;

    private Object data;

    private boolean result;

    public SinhVienData() {
    }

    public SinhVienData(String action, Object data) {
        this.action = action;
        this.data = data;
    }

    public SinhVienData(String action, Object data, boolean result) {
        this.action = action;
        this.data = data;
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
