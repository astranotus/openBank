package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:creds.properties")
public interface SelenoidCreds extends Config {
    String login();
    String password();
}
