package cn.dengdezhao;

import javax.faces.component.UIComponent;
import javax.faces.event.ComponentSystemEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

public class View1Bean {
    private  boolean popupLanched=false;

    public View1Bean() {
    }

    public void invokePopup(ComponentSystemEvent componentSystemEvent) {
        // Add event code here...
        if(!popupLanched){
            UIComponent pageFragmentRoot=componentSystemEvent.getComponent();
            RichPopup p1 = (RichPopup) pageFragmentRoot.findComponent("p1");
            RichPopup.PopupHints hints=new RichPopup.PopupHints();
            p1.show(hints);  
            System.out.println("call popup...");
            
        }
        this.popupLanched=true;
        
    }
}
