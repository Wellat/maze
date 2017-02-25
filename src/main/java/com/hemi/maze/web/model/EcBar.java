package com.hemi.maze.web.model;

public class EcBar {
    private Integer cid;

    private Integer years;

    private Integer monthes;

    private Float evaporation;

    private Float rainfall;

    private Float avgtemp;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getMonthes() {
        return monthes;
    }

    public void setMonthes(Integer monthes) {
        this.monthes = monthes;
    }

    public Float getEvaporation() {
        return evaporation;
    }

    public void setEvaporation(Float evaporation) {
        this.evaporation = evaporation;
    }

    public Float getRainfall() {
        return rainfall;
    }

    public void setRainfall(Float rainfall) {
        this.rainfall = rainfall;
    }

    public Float getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(Float avgtemp) {
        this.avgtemp = avgtemp;
    }
}