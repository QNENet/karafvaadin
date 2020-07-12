package com.example.karafvaadin.website.osgi;

import com.vaadin.flow.osgi.support.OsgiVaadinStaticResource;
import org.osgi.service.component.annotations.Component;

/**
 * Registers icon as a web resource available via HTTP.
 *
 * @author Vaadin Ltd
 *
 */
@Component(immediate = true, service = OsgiVaadinStaticResource.class)
public class MyViewResource implements OsgiVaadinStaticResource {

    @Override
    public String getPath() {
        return "/META-INF/resources/frontend/my-view.html";
    }

    @Override
    public String getAlias() {
        return "/frontend/my-view.html";
    }

}
