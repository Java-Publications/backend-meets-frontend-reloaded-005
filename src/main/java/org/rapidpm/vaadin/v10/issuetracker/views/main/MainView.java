package org.rapidpm.vaadin.v10.issuetracker.views.main;

import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route(MainView.NAV_MAIN_VIEW)
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainView extends Composite<Div> implements HasLogger {
  public static final String NAV_MAIN_VIEW = "main";

  public MainView() {
    getContent().add(new Span("Main View"));
  }
}
