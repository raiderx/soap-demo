package org.soapdemo.server.model;

import java.math.BigDecimal;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public class Aircraft extends Entity {

    private String name;
    private BigDecimal priceHourPlace;
    private short numberOfPlaces;
    private BigDecimal markup1;
    private BigDecimal markupB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPriceHourPlace() {
        return priceHourPlace;
    }

    public void setPriceHourPlace(BigDecimal priceHourPlace) {
        this.priceHourPlace = priceHourPlace;
    }

    public short getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(short numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public BigDecimal getMarkup1() {
        return markup1;
    }

    public void setMarkup1(BigDecimal markup1) {
        this.markup1 = markup1;
    }

    public BigDecimal getMarkupB() {
        return markupB;
    }

    public void setMarkupB(BigDecimal markupB) {
        this.markupB = markupB;
    }
}
