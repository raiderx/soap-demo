package org.soapdemo.server.dao;

import org.soapdemo.server.model.Airport;

import java.util.List;

/**
 * @author Pavel Karpukhin
 * @since 26.06.13
 */
public interface AirportDao {

    List<Airport> getAllAirports();
}
