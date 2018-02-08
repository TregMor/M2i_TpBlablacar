package blablacar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import blablacar.domain.Booking;
import blablacar.form.BookRideForm;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;
import blablacar.services.BookingService;
import blablacar.services.RideService;

@Controller
@RequestMapping("/booking")
public class BookingController {
	
    @Autowired
    private RideService rideService;
    @Autowired
    private RideRepository rideRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    BookingService bookingService;

    @PostMapping
    public String bookARide(@Valid BookRideForm form, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
    	System.out.println("----- On vient de passer ds le BookingController------");
        if (bindingResult.hasErrors()) {
            return "redirect:/ride/list";
        }

        Booking booking = bookingService.bookARide(form.getUserId(), form.getRideId());
//		Booking booking = null;        
//        try {
//            booking = bookingService.bookARide(form.getUserId(), form.getRideId());
//        } catch (RideIsFullBusinessException e) {
//            redirectAttributes.addFlashAttribute("message", "Ce trajet est déjà complet.");
//            return "redirect:/ride/list";
//        }
        model.addAttribute("book", booking);
        return "/booked";
    }
}
