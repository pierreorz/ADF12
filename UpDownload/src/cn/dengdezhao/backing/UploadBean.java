package cn.dengdezhao.backing;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputFile;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class UploadBean {
    private UploadedFile uploadfile;

    public void setUploadfile(UploadedFile uploadfile) {
        this.uploadfile = uploadfile;
    }

    public UploadedFile getUploadfile() {
        return uploadfile;
    }

    public UploadBean() {
    }

    public String uploadAction() {
        // Add event code here...
        if(this.uploadfile==null){
            System.out.println("file is null...");
            return null;
        }else{
            System.out.println("filename is:"+this.uploadfile.getFilename());
        }     
        
        
        return null;
    }

    public void valueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        UploadedFile file=(UploadedFile)valueChangeEvent.getSource();
        this.uploadfile=file;
        System.out.println("valuechange:"+file.getFilename());
    }
}
