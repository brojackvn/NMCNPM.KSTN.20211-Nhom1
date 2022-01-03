package views.swing.table;

import views.model.ModelStudent;

public interface EventAction {
    public void delete(ModelStudent student);
    
    public void update(ModelStudent student);
}
