package com.dogcarereviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogCareReviewsController {
	
	@Resource
	DogCareRepository repository = new DogCareRepository();
	
	@RequestMapping("/daycares")
	public String getAllReviews(Model model) {
		model.addAttribute("daycares", repository.findAll());
		return "daycares";
	}

	@RequestMapping("/daycare")
	public String getOneReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("daycares", repository.findOne(id));
		return "daycare";
	}

}
