package week01.ws.service;

import javax.jws.WebService;

// full name vermemiz gerekli!
@WebService(endpointInterface = "week01.ws.service.HelloMyService")
public class HelloMyServiceImpl implements HelloMyService {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "Welcome !!!" + name + " " + surname + " !!! This is first example!";
	}

}

// Service Implementation Bean (SIB)