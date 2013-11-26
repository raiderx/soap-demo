package org.soapdemo.server;

import org.soapdemo.server.dao.AircraftDao;
import org.soapdemo.server.dao.AirportDao;
import org.soapdemo.server.model.Aircraft;
import org.soapdemo.server.model.Airport;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Web service
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
@WebService
public class SoapDemoWebService {

    private AircraftDao aircraftDao;
    private AirportDao airportDao;

    public SoapDemoWebService(AircraftDao aircraftDao, AirportDao airportDao) {
        this.aircraftDao = aircraftDao;
        this.airportDao = airportDao;
    }

    @WebMethod
    public List<Aircraft> getAllAircrafts() {
        return aircraftDao.getAllAircrafts();
    }

    @WebMethod
    public List<Airport> getAllAirports() {
        return airportDao.getAllAirports();
    }
}
