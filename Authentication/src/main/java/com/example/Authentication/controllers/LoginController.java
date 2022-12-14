package com.example.Authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;


@RestController
public class LoginController {

	@Autowired
	UserRepository userRepository;
	

	@GetMapping(value="/")
    public String showIndexPage1(ModelMap model){   
		 return "<html>\n"
		 		+ "<head>\n"
		 		+ "</head>\n"
		 		+ "		<h1>User Manager</h1>\n"
		 		+ "		\n"
		 		+ "		<h2 class=\"hello-title\">Welcome</h2>\n"
		 		+ "		\n"
		 		+ "		<a href=\"/allusers\">View all users</a>\n"
		 		+ "		<br><br>\n"
				+ "     <form method=\"get\" action=\"login\">\n"
				+ "			<br><h3>Login below:</h3>\n"
				+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name\" required>\n"
				+ "			<input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Email\" required>\n"
				+ "			<input type=\"text\" id=\"password\" name=\"password\" placeholder=\"Password\" required>	\n"
				+ "			<input type=\"submit\" value=\"Enter\" />\n"
				+ "		</form>"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }

    @GetMapping("/login")
    public String showLogin(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap map) {
        User u = new User(name,email,password);
        userRepository.save(u); 
        
        return "<html>\n"
 		+ "<head>\n"
 		+ "</head>\n"
 		+ "		\n"
 		+ "		<h2 class=\"hello-title\">Successfully Added Your Information</h2>\n"
 		+ "	</div>\n"
 		+ "</body>\n"
 		+ "</html>";
    }

    @GetMapping("/allusers")
	public @ResponseBody String getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        Iterable<User> allUser = userRepository.findAll();
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "<style>\n"
		 		+ "table, th, td\n"
		 		+ "border: 1px solid black\n"
		 		+ "margin: auto\n"
		 		+ "</style>\r\n"
		 		+ "</head>\n"
		 		+ "<h1>Users</h1>\n"
        		+ allUser.toString()
		        + "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
    
    @PostMapping("/login")
    public String submitLogin(@RequestParam String username, @RequestParam String password){

        //TODO:

        return "Success";



    }
}