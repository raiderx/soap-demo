package org.soapdemo.server.dao.jdbc;

import org.soapdemo.server.ApplicationException;
import org.soapdemo.server.dao.AirportDao;
import org.soapdemo.server.model.Airport;

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
 * @since 26.06.13
 */
public class AirportDaoJdbcImpl implements AirportDao {

    public static final String SQL_SELECT_ALL =
            "SELECT ID_AIRPORTS_TBAP, NAME_TBAP, ID_CITY_TBAP " +
            "FROM TB_AIRPORTS";

    private final Logger logger = Logger.getLogger(getClass().getName());

    private Connection connection;

    public AirportDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Airport> getAllAirports() {
        List<Airport> result = new ArrayList<Airport>();
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
            close(statement, resultSet);
        }
        return result;
    }

    public Airport map(ResultSet resultSet) throws SQLException {
        Airport result = new Airport();
        result.setId(resultSet.getLong("ID_AIRPORTS_TBAP"));
        result.setName(resultSet.getString("NAME_TBAP"));
        result.setCityId(resultSet.getLong("ID_CITY_TBAP"));
        return result;
    }

    private void close(Statement statement, ResultSet resultSet) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new ApplicationException(e.getMessage(), e);
        }
    }
}
