package com.mlh.portify.backend.entity.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * {@link CrudRepository} for the {@link User} entity.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * Return a list with all the user actually in the DB.
     *
     * @return a list of {@link User}.
     */
    List<User> findAll();

    /**
     * Return an {@link Optional} containing, if present, the {@link User} with the id taken as input.
     * Else return an empty optional.
     *
     * @param id the id of the user to get.
     * @return an Optional containing the User if present, else an empty Optional.
     */
    Optional<User> findById(int id);

    /**
     * Return an {@link Optional} containing, if present, the {@link User} with the name (the name in the B is a unique value) taken as input.
     * Else return an empty optional.
     *
     * @param name the name of the user to get.
     * @return an Optional containing the User if present, else an empty Optional.
     */
    Optional<User> findByName(String name);
}
