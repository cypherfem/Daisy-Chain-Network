package com.chenuki;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        Image homepage = new Image("/images/homepage.png", "Home");
        homepage.setWidth("100%");
        homepage.setHeight("auto");

        setPadding(false);
        setSpacing(false);
        setWidthFull();

        add(homepage);
    }
}
