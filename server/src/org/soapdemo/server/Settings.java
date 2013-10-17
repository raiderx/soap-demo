package org.soapdemo.server;

/**
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public class Settings {

    public static final int DEFAULT_PORT = 8080;
    public static final String DEFAULT_ADDRESS = "localhost";
    public static final String DEFAULT_JDBC_URL = "jdbc:firebirdsql:localhost/3050:/local/work/soap/db/INFO.fdb?encoding=WIN1251";
    public static final String DEFAULT_JDBC_USERNAME = "sysdba";
    public static final String DEFAULT_JDBC_PASSWORD = "masterkey";

    private int port = DEFAULT_PORT;
    private String address = DEFAULT_ADDRESS;
    private String url = DEFAULT_JDBC_URL;
    private String username = DEFAULT_JDBC_USERNAME;
    private String password = DEFAULT_JDBC_PASSWORD;
    private boolean succeed = true;
    private String message;

    public static Settings parseSettings(String[] args) {
        Settings settings = new Settings();

        for (int i = 0; i < args.length; ) {
            if ("-p".equals(args[i]) || "-port".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires listen port specification");
                }
                try {
                    settings.setPort(Integer.parseInt(args[i + 1]));
                } catch (NumberFormatException e) {
                    return Failed(args[i + 1] + " is not a port number");
                }
                i = i + 2;
                continue;
            }
            if ("-l".equals(args[i]) || "-listen".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires listen address specification");
                }
                settings.setAddress(args[i + 1]);
                i = i + 2;
                continue;
            }
            if ("-url".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires JDBC URL specification");
                }
                settings.setUrl(args[i + 1]);
                i = i + 2;
                continue;
            }
            if ("-user".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires DB user specification");
                }
                settings.setUsername(args[i + 1]);
                i = i + 2;
                continue;
            }
            if ("-pass".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires DB password specification");
                }
                settings.setPassword(args[i + 1]);
                i = i + 2;
                continue;
            }
            return Failed("Unexpected option");
        }
        return settings;
    }

    public static Settings Failed(String message) {
        Settings settings = new Settings();
        settings.setSucceed(false);
        settings.setMessage(message);
        return settings;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
