package br.com.evergreenapi.Controllers;

import java.sql.Date;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evergreenapi.Domain.Profile;
import br.com.evergreenapi.Domain.User;
import br.com.evergreenapi.Exceptions.UserNotFoundException;
import br.com.evergreenapi.InputModel.UserInputModel;
import br.com.evergreenapi.Repositories.ProfileRepository;
import br.com.evergreenapi.Repositories.UserRepository;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {
    @Autowired
    UserRepository users;

    @Autowired
    ProfileRepository profiles;
    
    @RequestMapping(value = "")
    public List<User> findAll() {
        return (List<User>) users.findAll();
    }

    @RequestMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
        Optional<User> opt = users.findById(id);

        if (opt.isEmpty())
            throw new UserNotFoundException(id, MessageFormat.format("User id: {0} not found", id));

        return opt.get();
    }

    @PostMapping("")
    public void newUser(@RequestBody UserInputModel input) {
        User user = new User();

        user.setName(input.getName());
        user.setEmail(input.getEmail());
        user.setGender(input.getGender());
        user.setPassword(input.getPassword());
        user.setPasswordTips(input.getPasswordTips());

        user.setCreated(Date.valueOf(LocalDate.now()));
        
        Profile profile = new Profile();

        profile.setAvatar(input.getAvatar());
        profile.setNickname(input.getNickname());
        profile.setWhatYouThinking(input.getWhatYouThinking());
        profile.setSellProducts(input.getSupportRecycling());
        profile.setSellProducts(input.getSellProducts());

        user.setProfile(profile);

        /*
            private Date birthday;
        */

        users.save(user);

   }
  
}
