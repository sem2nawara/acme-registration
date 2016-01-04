package io.acme.registration.domain.api.repo;

import io.acme.registration.domain.Profile;

import java.util.UUID;

/**
 * The repository interface of the profile entity
 */
public interface ProfileRepository {

    public Profile get(final UUID id);

    public void save(final Profile profile);

    public boolean exists(final UUID id);

    public boolean exists(final String username);

}
