package org.soapdemo.server.model;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public abstract class Entity {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
