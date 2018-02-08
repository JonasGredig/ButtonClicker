package ch.baumink.buttonclicker.controller;

import ch.baumink.buttonclicker.model.ClickModel;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ManagedBean
public class ClickController {

    private ClickModel clickModel;

    public ClickController() {
        clickModel = new ClickModel();
    }

    public long getAmount() {
        return clickModel.getAmount();
    }

    public String increaseAmount() {
        clickModel.setNumber(clickModel.getAmount() + 1);
        return "/index.xhtml";
    }
}
