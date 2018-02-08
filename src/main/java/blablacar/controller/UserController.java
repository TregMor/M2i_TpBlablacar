package blablacar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import blablacar.domain.User;
import blablacar.form.UserCreationForm;
import blablacar.repository.UserRepository;
import blablacar.services.UserService;

//Intégralement copié sur: https://spring.io/guides/gs/validating-form-input/
@Controller  //Controller Spring doit etre déclaré
public class UserController {   
	
	@Autowired
	private UserService userService;
    @Autowired
    private UserRepository userRepository;
	    
    @GetMapping("/")
    public String showHomePage() {
    	System.out.println("~~~~~~~~~~~~ Bienvenue ds la méthode homePage !~~~~~~~~~~");
        return "homePage";
    }
    
    @GetMapping
    public String showForm(UserCreationForm userForm) {
    	System.out.println("plop du UserController");
        return "userForm";
    }
    
    @GetMapping("/login")
    public String loginPage() {
    	System.out.println("~~~~~~~~~~~~ on vient de passer ds la méthode LoginPage !~~~~~~~~~~");
        return "login";
    }

    @PostMapping
    public String checkPersonInfo(@Valid UserCreationForm userForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()) {
        	System.out.println("Error");
            return "userForm";
        }
        
        //Persist New User
        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setLogin(userForm.getLogin());
        user.setPassword(userForm.getPassword());
        
        // enregistrer le user dans les entête HTTP pour
        // qu'il puisse être recupérer dans l'action suivante
        
        userService.save(user);
        redirectAttributes.addAttribute("user", user.getId());
        
        return "redirect:/creationResult";  												//--> Renvoi à une action
    }

    @GetMapping("/creationResult")
    public String creationResult(@RequestParam("user") int userId, Model model) {   		//--> Action renvoyée...ici redirection vers une page
    	System.out.println("redirect creationResult " + userId);
    	
    	// utilise le repository pour recup le user
    	//injecter cette objet dans le Model
    	
    	User userRegistered = userRepository.findOne(userId);
    	model.addAttribute("user", userRegistered); //changer le userId en user enregistré
        return "creationResult";															//--> Redirection vers une page
    }

}
