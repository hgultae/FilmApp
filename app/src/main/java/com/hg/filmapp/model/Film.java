
package com.hg.filmapp.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Film {

    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tabs")
    @Expose
    private Object tabs;
    @SerializedName("menu")
    @Expose
    private Object menu;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = new ArrayList<Section>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("icon")
    @Expose
    private String icon;

    /**
     * 
     * @return
     *     The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * 
     * @param layout
     *     The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The tabs
     */
    public Object getTabs() {
        return tabs;
    }

    /**
     * 
     * @param tabs
     *     The tabs
     */
    public void setTabs(Object tabs) {
        this.tabs = tabs;
    }

    /**
     * 
     * @return
     *     The menu
     */
    public Object getMenu() {
        return menu;
    }

    /**
     * 
     * @param menu
     *     The menu
     */
    public void setMenu(Object menu) {
        this.menu = menu;
    }

    /**
     * 
     * @return
     *     The sections
     */
    public List<Section> getSections() {
        return sections;
    }

    /**
     * 
     * @param sections
     *     The sections
     */
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

}
