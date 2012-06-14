package org.vaadin.alump.distributionbar.widgetset.client.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.terminal.gwt.client.ComponentState;

public class DistributionBarState extends ComponentState {

    private List<Part> parts = new ArrayList<Part>();

    /**
     * Internal storage class for part details
     */
    public static class Part implements Serializable {

        private static final long serialVersionUID = 4009518719242009675L;
        private int size;
        private String title;
        private String tooltip;

        public Part() {
            title = new String();
            tooltip = new String();
        }

        public Part(int size) {
            setSize(size);
            title = new String();
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTooltip(String tooltip) {
            this.tooltip = tooltip;
        }

        public String getTooltip() {
            return tooltip;
        }
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}
