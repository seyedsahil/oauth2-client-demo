package org.sydlabz.demo.oauth2client;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class OAuth2ClientSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/webjars/**", "/error", "/login");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http
		.authorizeRequests()
			.anyRequest().authenticated()
		.and()
		.oauth2Login()
			.loginPage("/login");
		// @formatter:on
	}

}
