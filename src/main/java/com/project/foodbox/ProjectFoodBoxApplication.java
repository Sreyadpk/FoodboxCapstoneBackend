package com.project.foodbox;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@ComponentScan ({"com.project.foodbox","com.project.foodbox.model","com.project.foodbox.services"})
@EnableJpaRepositories ("com.project.foodbox.repository")
public class ProjectFoodBoxApplication implements CommandLineRunner {
    /*
	@Autowired
    private UserService userService;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	*/
	public static void main(String[] args) {
		SpringApplication.run(ProjectFoodBoxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code..");
		/*
		User user = new User();
		user.setFirstName("Deepak");
		user.setLastName("A N");
		user.setEmail("deepunelliat@gmail.com");
		user.setPassword(this.bCryptPasswordEncoder.encode("deep123"));
		user.setUsername("deepsree");
		user.setPhone("9043281385");
		user.setEnabled(true);
		
		Role role=new Role();
		role.setRoleId(102);
		role.setRoleName("USER");
		
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user, userRoleSet);
		System.out.println("user name : " + user1.getUsername());
		*/
	}

}
