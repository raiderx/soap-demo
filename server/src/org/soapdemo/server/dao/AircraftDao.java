package org.soapdemo.server.dao;

import org.soapdemo.server.model.Aircraft;

import java.util.List;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public interface AircraftDao {

    List<Aircraft> getAllAircrafts();
}
