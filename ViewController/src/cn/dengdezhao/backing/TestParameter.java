package cn.dengdezhao.backing;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.ServletContext;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;

public class TestParameter {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputFormatted of1;
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

    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public String action() {
        FacesContext fctx=FacesContext.getCurrentInstance();
        ExternalContext ec=fctx.getExternalContext();
        ServletContext servletContext=(ServletContext)ec.getContext();
        String value=servletContext.getInitParameter("javax.faces.FACELETS_VIEW_MAPPINGS");
        System.out.println(value);
        return null;
    }
}
