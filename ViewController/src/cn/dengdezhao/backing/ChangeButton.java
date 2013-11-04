package cn.dengdezhao.backing;

import cn.dengdezhao.utils.JSFUtils;

import javax.faces.component.html.HtmlCommandButton;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;


import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.event.SelectionEvent;

public class ChangeButton {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
   private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    private RichMessages m1;
    private RichTable t1;
    private RichButton b1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }




    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void rowSelection(SelectionEvent selectionEvent) {
        // Add event code here...        
              
        JSFUtils.resloveMethodExpression("#{bindings.EmployeesVO1.collectionModel.makeCurrent}",null,
        new Class[] { SelectionEvent.class },
                                         new Object[] { selectionEvent });
        Row selectedRow =
        (Row)JSFUtils.resolveExpression("#{bindings.EmployeesVO1Iterator.currentRow}");
        
        Boolean flag =  (Integer)selectedRow.getAttribute("EmployeeId")>200?true:false;
        System.out.println("flag:"+flag);
        this.b1.setVisible(flag);
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.b1);
        
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
}
