package utility;

import model.User;

//Progression - 4

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{
	
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user)&&checkQuizAnswer("points"))
			return true;
		else
		   return false;
	
	}
	
	// Progression - 5
	public boolean checkUser(User user) {
		 int age=user.getAge();
		
		 int height=user.getHeight();
		 int weight=user.getWeight();
	     String country=user.getCountry();
		
		if((18<=age && age<=35)&&(155 <= height && height<=170)&&(55<=weight&&weight<=90)&&(country.equals("ProGrad")))
		return true;
		else
		return false;
	}

	
	
 // Progression - 6
	@Override
	public boolean checkQuizAnswer(String points) {
		int num = Integer.parseInt(points);
		
		if(num>80) 
			return true;
		else
		
		   return false;
	}


	
}














