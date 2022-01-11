package models;

import views.event.EventActionFormTach;

public class ModelMove {
    ModelNhanKhau nhanKhau;
    EventActionFormTach event;

    public ModelMove() {
    }

    public ModelMove(ModelNhanKhau nhanKhau, EventActionFormTach event) {
        this.nhanKhau = nhanKhau;
        this.event = event;
    }

    public ModelNhanKhau getNhanKhau() {
        return nhanKhau;
    }

    public void setNhanKhau(ModelNhanKhau nhanKhau) {
        this.nhanKhau = nhanKhau;
    }

    public EventActionFormTach getEvent() {
        return event;
    }

    public void setEvent(EventActionFormTach event) {
        this.event = event;
    }
}
