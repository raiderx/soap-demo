package org.soapdemo.server.dao.jdbc;

import org.soapdemo.server.ApplicationException;
import org.soapdemo.server.dao.AircraftDao;
import org.soapdemo.server.model.Aircraft;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public class AircraftDaoJdbcImpl implements AircraftDao {

    public static final String SQL_SELECT_ALL =
            "SELECT ID_AIRCRAFTTYPE_TBAT, NAME_TBAT, PRICE_HOUR_PLACE_TBAT, PLACES_TBAT, MARKUP1_TBAT, MARKUPB_TBAT " +
            "FROM TB_AIRCRAFTTYPE";

    private final Logger logger = Logger.getLogger(getClass().getName());

    private Connection connection;

    public AircraftDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Aircraft> getAllAircrafts() {
        List<Aircraft> result = new ArrayList<Aircraft>();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_SELECT_ALL);
            while (resultSet.next()) {
                result.add(map(resultSet));
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new ApplicationException(e.getMessage(), e);
        } finally {
            JdbcUtils.close(statement, resultSet);
        }
        return result;
    }

    public Aircraft map(ResultSet resultSet) throws SQLException {
        Aircraft result = new Aircraft();
        result.setId(resultSet.getLong("ID_AIRCRAFTTYPE_TBAT"));
        result.setName(resultSet.getString("NAME_TBAT"));
        result.setPriceHourPlace(resultSet.getBigDecimal("PRICE_HOUR_PLACE_TBAT"));
        result.setNumberOfPlaces(resultSet.getShort("PLACES_TBAT"));
        result.setMarkup1(resultSet.getBigDecimal("MARKUP1_TBAT"));
        result.setMarkupB(resultSet.getBigDecimal("MARKUPB_TBAT"));
        return result;
    }
}
