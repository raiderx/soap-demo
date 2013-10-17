package org.soapdemo.server.dao.jdbc;

import org.junit.*;
import org.soapdemo.server.dao.AircraftDao;
import org.soapdemo.server.model.Aircraft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public class AircraftDaoJdbcImplTest {

    public static final String JDBC_URL = "jdbc:firebirdsql:localhost/3050:/local/work/soap/db/INFO.fdb?encoding=WIN1251";
    public static final String JDBC_USERNAME = "sysdba";
    public static final String JDBC_PASSWORD = "masterkey";

    private static Connection connection;
    private static AircraftDao aircraftDao;

    @BeforeClass
    public static void testSetUp() throws SQLException {
        connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        aircraftDao = new AircraftDaoJdbcImpl(connection);
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
    public void testGetAllAircrafts() {
        List<Aircraft> result = aircraftDao.getAllAircrafts();
        assertNotNull(result);
        assertEquals(9, result.size());
    }
}
