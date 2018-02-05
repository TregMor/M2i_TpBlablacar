package blablacar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import blablacar.domain.User;
import blablacar.domain.UserCreationForm;
import blablacar.services.UserService;

//Intégralement copié sur: https://spring.io/guides/gs/validating-form-input/
@Controller  //Controller Spring dc doit etre déclaré
public class UserCreationController extends WebMvcConfigurerAdapter {   
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String next() {
		System.out.println("NEXT");
		return "results";
	}
    
    @GetMapping("/")
    public String showForm(UserCreationForm userForm) {
        return "userForm";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid UserCreationForm userForm, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "userForm";
        }
        
        //Persist New User
        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setLogin(userForm.getLogin());
        user.setPassword(userForm.getPassword());
        
        userService.save(user);
        
        return "redirect:/results";
    }

}
