package org.soapdemo.server.model;

/**
 * @author Pavel Karpukhin
 * @since 26.06.13
 */
public class Airport extends Entity {

    private String name;
    private long cityId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }
}
