package com.chenuki;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("explore")
public class Explore extends VerticalLayout {
    public Explore() {
        Image exploreImage = new Image("/images/explore.png", "Explore");
        exploreImage.setWidth("100%");
        exploreImage.setHeight("auto");

        setPadding(false);
        setSpacing(false);
        setWidthFull();

        add(exploreImage);
    }
}
