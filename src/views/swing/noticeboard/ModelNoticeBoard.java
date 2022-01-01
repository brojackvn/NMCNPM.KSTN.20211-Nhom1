package views.swing.noticeboard;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class ModelNoticeBoard {
    Color titleColor;
    String title;
    String time;
    String description;

    public ModelNoticeBoard() {
    }

    public ModelNoticeBoard(Color titleColor, String title, String time, String description) {
        this.titleColor = titleColor;
        this.title = title;
        this.time = time;
        this.description = description;
    }
    
    public Color getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 
}
