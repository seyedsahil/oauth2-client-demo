package org.sydlabz.demo.oauth2client;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OAuth2ClientController {

	@GetMapping("/")
	public String index(@AuthenticationPrincipal OAuth2User user, Model model) {
		model.addAttribute("username", user.getAttribute("name"));
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
