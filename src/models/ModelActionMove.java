package models;

import views.event.EventActionFormTach;

public class ModelActionMove {
    private ModelNhanKhau nhanKhau;
    private EventActionFormTach event;
    
    public ModelActionMove() {
    }

    public ModelActionMove(ModelNhanKhau nhanKhau, EventActionFormTach event) {
        this.nhanKhau = nhanKhau;
        this.event = event;
    }
    
    public ModelNhanKhau getNhanKhau() {
        return nhanKhau;
    }

    public void setNhanKhau(ModelNhanKhau nhanKhau) {
        this.nhanKhau = nhanKhau;
    }

    public EventActionFormTach getEventActionFormTach() {
        return event;
    }

    public void setEventActionFormTach(EventActionFormTach event) {
        this.event = event;
    }
}
