package com.virus.shopingcart.users.resource;
import org.springframework.stereotype.Component;
import com.virus.shopingcart.users.model.Users;

@Component
public class UserResourceMapper {

		public Users fromResource(UserDetailsResource userDetailsResource)
		{
			Users user=new Users();
			user.setName(userDetailsResource.getName());
			user.setEmail(userDetailsResource.getEmail());
			user.setGender(userDetailsResource.getGender());
			user.setPassword(userDetailsResource.getPassword());
			user.setMobileNo(userDetailsResource.getMobileNo());
			return user;
		}
}
