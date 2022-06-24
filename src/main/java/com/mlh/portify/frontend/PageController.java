package com.mlh.portify.frontend;

import com.mlh.portify.backend.entity.user.User;
import com.mlh.portify.backend.entity.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

/**
 * Page {@link Controller} for the Portify frontend.
 */
@Controller
@Transactional
public class PageController {

    private final  UserRepository userRepository;
    private final Random rand = new Random();
    private final Logger logger = LoggerFactory.getLogger(PageController.class);

    @Autowired
    public PageController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/createpage")
    public String greetingForm(final Model model) {
        return this.createNewPage(model);
    }

    @PostMapping("/createpage")
    public String greetingSubmit(@ModelAttribute final Page page, final Model model) {
        model.addAttribute("createpage", page);

        /* Save the user on the db */
        userRepository.save(new User(
                page.getName(),
                page.getIntroduction(),
                page.getBio(),
                page.getSkill(),
                page.getPicture(),
                page.getLinkedin(),
                page.getGithub(),
                page.getResume()
                ));

        return "result";
    }

    @GetMapping("/page")
    public String page(@RequestParam(name = "name", required = false) final String name, final Model model) {

        /* The variable, name, comes from url. For example, if someone accesses localhost:8080/page?name=celina.
        the name variable here would be "celina". You use this name to query the database.
        to retrieve other information for the page such as education, experiences and etc.
         */
        Optional<User> user = Optional.empty();
        if (Objects.isNull(name)) {
            final List<User> usersList = userRepository.findAll();
            if (usersList.isEmpty()) {
                /* If no user present on the db redirect to createpage */
                logger.info("Redirect to createpage url");
                return this.createNewPage(model);
            }

            /* If no value is passed choose a random user to show (if present) */
            user = Optional.of(usersList.get(rand.nextInt(usersList.size())));
        } else {
            user = userRepository.findByName(name);
        }

        logger.info(user.toString());
        final String resume = "https://www.allthingsgrammar.com/uploads/2/3/2/9/23290220/atg-worksheet-so-because20.pdf";
        final String picture = "./images/picture.svg";

        /* You inject values to the page.html through model.addAttribute(<placeholder>, <value>) */
        model.addAttribute("name", user.get().getName());
        model.addAttribute("introduction", user.get().getIntroduction());
        model.addAttribute("picture", user.get().getProfilePic());
        model.addAttribute("bio", user.get().getBio());
        model.addAttribute("skill", user.get().getSkill());
        model.addAttribute("resume", user.get().getResume());
        model.addAttribute("linkedin", user.get().getLinkedin());
        model.addAttribute("github", user.get().getGithub());
        return "page";

    }

    private String createNewPage(final Model model) {
        model.addAttribute("createpage", new Page());
        return "createpage";
    }
}
