package com.mlh.portify.backend.controller;

import com.mlh.portify.backend.entity.user.User;
import com.mlh.portify.backend.entity.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * RestController for the {@link User} entity.
 */
@RestController
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/list")
    public List<User> index() {
        return userRepository.findAll();
    }

    @GetMapping("/user/search/{id}")
    public Optional<User> searchById(@PathVariable final String id) {
        logger.info(id);
        final int userId = Integer.parseInt(id);
        return userRepository.findById(userId);
    }

    @GetMapping("/user/search/{name}")
    public Optional<User> searchByName(@PathVariable final String name) {
        logger.info(name);
        return userRepository.findByName(name);
    }

    @PostMapping("/user/create")
    public User create(@RequestBody final Map<String, String> body) {
        final String name = body.get("name");
        final String introduction = body.get("introduction");
        final String bio = body.get("bio");
        final String skill = body.get("skill");
        final String profilePic = body.get("profile_pic");
        final String linkedin = body.get("linkedin");
        final String github = body.get("github");
        final String resume = body.get("resume");
        return userRepository.save(new User(name, introduction, bio, skill, profilePic, linkedin,
                github, resume));
    }
}
