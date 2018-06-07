package com.integrated.center.model;

public class ChoiceModel {
    private String sId;
    private String cId;
    private String score;

    public ChoiceModel() {
    }

    public ChoiceModel(String sId, String cId, String score) {
        this.sId = sId;
        this.cId = cId;
        this.score = score;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
