package org.soapdemo.server.dao.jdbc;

import org.junit.*;
import org.soapdemo.server.dao.AirportDao;
import org.soapdemo.server.model.Airport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * @author Pavel Karpukhin
 * @since 26.06.13
 */
public class AirportDaoJdbcImplTest {

    public static final String JDBC_URL = "jdbc:firebirdsql:localhost/3050:/local/work/soap/db/INFO.fdb?encoding=WIN1251";
    public static final String JDBC_USERNAME = "sysdba";
    public static final String JDBC_PASSWORD = "masterkey";

    private static Connection connection;
    private static AirportDao airportDao;

    @BeforeClass
    public static void testSetUp() throws SQLException {
        connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        airportDao = new AirportDaoJdbcImpl(connection);
    }

    @Before
    public void setUp() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            fail(e.getMessage());
        }
    }

    @AfterClass
    public static void testTearDown() {
        try {
            connection.close();
        } catch (SQLException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testGetAllAirports() {
        List<Airport> result = airportDao.getAllAirports();
        assertNotNull(result);
        assertEquals(14, result.size());
    }
}
