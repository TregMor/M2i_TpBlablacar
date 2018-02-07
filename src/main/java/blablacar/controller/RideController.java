package blablacar.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import blablacar.domain.Ride;
import blablacar.domain.User;
import blablacar.form.OfferARideForm;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;
import blablacar.services.RideService;
import blablacar.utils.DateUtils;

@Controller
@RequestMapping("/ride")
public class RideController {

	@Autowired
	private RideService rideService;
	@Autowired
	private RideRepository rideRepository;
	@Autowired
	private UserRepository userRepository;

	@PostMapping
	public String offerARide(@Valid OfferARideForm form, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		System.out.println("--------------**************** Passage ds le rideController ****************-----------------");
		
		if (bindingResult.hasErrors()) {
			return "rideCreation";
		}
		Date convertedDatePrecision = DateUtils.convert(form.getDepartureDate(), form.getStartHour(),
				form.getStartMinutes());
		Ride ride = rideService.offerARide(convertedDatePrecision, form.getFromCity(), form.getToCity(), form.getPrice(),
				form.getSeats(), form.getUserId());
		redirectAttributes.addAttribute("ride", ride.getId());
		return "redirect:/ride";
	}
	
	@GetMapping
	public String showForm(User user, OfferARideForm form, @RequestParam(name = "ride", required = false) String rideId,
			Model model) {
		System.out.println("-------------->>>>>>>>>>>>>>> Passage ds le rideController <<<<<<<<<<<<<<<-----------------");
		
		if (rideId != null && !rideId.isEmpty()) {
			Ride ride = rideRepository.findOne(Integer.valueOf(rideId));
			model.addAttribute("ride", ride);
		}
		Iterable<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "rideCreation";
	}

}
