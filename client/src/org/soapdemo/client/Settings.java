package org.soapdemo.client;

/**
 * @author Pavel Karpukhin
 * @since 26.06.13
 */
public class Settings {

    public static final int DEFAULT_PORT = 8080;
    public static final String DEFAULT_HOST = "localhost";

    private int port = DEFAULT_PORT;
    private String host = DEFAULT_HOST;
    private boolean succeed = true;
    private String message;

    public static Settings parseSettings(String[] args) {
        Settings settings = new Settings();

        for (int i = 0; i < args.length; ) {
            if ("-p".equals(args[i]) || "-port".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires port specification");
                }
                try {
                    settings.setPort(Integer.parseInt(args[i + 1]));
                } catch (NumberFormatException e) {
                    return Failed(args[i + 1] + " is not a port number");
                }
                i = i + 2;
                continue;
            }
            if ("-h".equals(args[i]) || "-host".equals(args[i])) {
                if (i + 1 > args.length - 1) {
                    return Failed(args[i] + " requires host specification");
                }
                settings.setHost(args[i + 1]);
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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
