package models;

import views.event.EventActionFormXoa;

public class ModelAction {
    private ModelNhanKhau nhanKhau;
    private EventActionFormXoa event;

    public ModelAction() {
    }

    public ModelAction(ModelNhanKhau nhanKhau, EventActionFormXoa event) {
        this.nhanKhau = nhanKhau;
        this.event = event;
    }
    
    public ModelNhanKhau getNhanKhau() {
        return nhanKhau;
    }

    public void setNhanKhau(ModelNhanKhau nhanKhau) {
        this.nhanKhau = nhanKhau;
    }

    public EventActionFormXoa getEvent() {
        return event;
    }

    public void setEvent(EventActionFormXoa event) {
        this.event = event;
    } 
}
