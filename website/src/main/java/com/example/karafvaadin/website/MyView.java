package com.example.karafvaadin.website;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the my-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("my-view")
@HtmlImport("my-view.html")
@Route("myview")
public class MyView extends PolymerTemplate<MyView.MyViewModel> {

    /**
     * Creates a new MyView.
     */
    public MyView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between MyView and my-view
     */
    public interface MyViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
