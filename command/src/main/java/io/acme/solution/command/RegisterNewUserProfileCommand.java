package io.acme.solution.command;

import java.util.UUID;

/**
 * Register New User Profile Command.
 */
public class RegisterNewUserProfileCommand implements Command {

    private UUID id;
    private String username;
    private String email;
    private String password;

    public RegisterNewUserProfileCommand() {

    }

    public RegisterNewUserProfileCommand(final UUID id, final String username, final String email, final String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" + this.getClass().getSimpleName() + " : " + this.getId() + " : " + this.username + " : " + this.email + "}";
    }
}
