package com.integrated.center.model;

import java.util.List;

public class Choices {
    private List<Choice> choices;

    public Choices() {
    }

    public Choices(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
