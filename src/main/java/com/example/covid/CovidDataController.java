package com.example.covid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/data") 
public class CovidDataController {
 @Autowired 
 private UserRepository userRepository;
  
@Autowired
private CovidRepository covidRepository;
  
  @GetMapping(path="/covidData")
  public @ResponseBody Iterable<Covid> getCovidData() {
  // This returns a JSON or XML with the users 
	  return covidRepository.findAll();
  } 
  
  @GetMapping("/covid")
  public String getData(Model model) {
	  
	  Iterable<Covid> covidList  = covidRepository.findAll();
      model.addAttribute("covidList", covidList);

      return "covid"; //view
  }

  @GetMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

	
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	  // This returns a JSON or XML with the users 
		  return userRepository.findAll();
	  }
	  
	 
	 
}