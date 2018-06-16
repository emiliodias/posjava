package br.com.unitri.posjava.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationGoogleAPI {


	@RequestMapping("/authorize")
	public void authorize(HttpServletRequest request, HttpServletResponse response) {
		
		String url = "https://accounts.google.com/o/oauth2/auth?"
				+ "scope=https://mail.google.com/&"
				+ "redirect_uri=" + APICONSTANTS.REDIRECT_URI + "&"
				+ "response_type=code&"
				+ "client_id=" + APICONSTANTS.CLIENT_ID + "&"
				+ "approval_prompt=force";
		
		
		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}