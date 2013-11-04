package cn.dengdezhao;

import oracle.adf.model.RegionContext;
import oracle.adf.model.RegionController;

public class myController implements RegionController {
    public myController() {
        super();
    }

    @Override
    public boolean refreshRegion(RegionContext regionContext) {
        // TODO Implement this method
        int flag=regionContext.getRefreshFlag();
        System.out.println("refreshRegion...");      
        
        return false;
    }

    @Override
    public boolean validateRegion(RegionContext regionContext) {
        // TODO Implement this method
        
        return false;
    }

    @Override
    public boolean isRegionViewable(RegionContext regionContext) {
        // TODO Implement this method
        
        return false;
    }

    @Override
    public String getName() {
        // TODO Implement this method
        
        return null;
    }
}
