package com.chenuki;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        Image homepage = new Image("/images/homepage.png", "Home");
        homepage.setWidth("100%");

        Div container = new Div();

        container.setWidthFull();
        container.getStyle().set("position", "relative");

        Button exploreButton = new Button();

        exploreButton.getStyle().set("position", "absolute");
        exploreButton.getStyle().set("left", "22%");
        exploreButton.getStyle().set("top", "9%");
        exploreButton.getStyle().set("width", "12%");
        exploreButton.getStyle().set("height", "6%");
        exploreButton.getStyle().set("opacity", "15");

        exploreButton.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate("explore"));
        });

        container.add(homepage, exploreButton);

        setPadding(false);
        setSpacing(false);
        setWidthFull();

        add(container);
    }
}
