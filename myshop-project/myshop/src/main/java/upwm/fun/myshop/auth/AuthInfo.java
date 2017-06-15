package upwm.fun.myshop.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marci on 15.06.2017.
 */
public class AuthInfo {
    private String username;
    private String firstname;
    private String lastname;
    private String displayed;
    private List<String> roles;
    private boolean loggedIn;

    public AuthInfo(String username, String firstname, String lastname, String displayed, List<String> roles, boolean
            loggedIn) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.displayed = displayed;
        this.roles = roles;
        this.loggedIn = loggedIn;
    }

    public static class AuthInfoBuilder {
        private String username;
        private String firstname;
        private String lastname;
        private String displayed;
        private List<String> roles = new ArrayList<>();
        private boolean loggedIn;

        AuthInfoBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public AuthInfoBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public AuthInfoBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public AuthInfoBuilder setDisplayed(String displayed) {
            this.displayed = displayed;
            return this;
        }

        public AuthInfoBuilder addRole(String role) {
            this.roles.add(role);
            return this;
        }

        public AuthInfoBuilder addRoles(String... roles) {
            this.roles.addAll(Arrays.asList(roles));
            return this;
        }

        public AuthInfoBuilder setLoggedIn(boolean loggedIn) {
            this.loggedIn = loggedIn;
            return this;
        }

        public AuthInfo build() {
            return new AuthInfo(username, firstname, lastname, displayed, roles, loggedIn);
        }

    }
}
