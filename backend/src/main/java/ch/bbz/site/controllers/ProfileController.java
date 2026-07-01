package ch.bbz.site.controllers;

import ch.bbz.site.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    @GetMapping()
    public List<Profile> getAll()  {
        return List.of(new Profile(), new Profile());
    }
}
