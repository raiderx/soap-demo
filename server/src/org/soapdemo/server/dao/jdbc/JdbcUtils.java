package org.soapdemo.server.dao.jdbc;

import org.soapdemo.server.ApplicationException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pavel Karpukhin
 * @since 17.10.13
 */
public class JdbcUtils {

    private static final Logger logger = Logger.getLogger(JdbcUtils.class.getName());

    public static void close(Statement statement, ResultSet resultSet) {
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
