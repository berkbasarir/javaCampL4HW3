package javaCampL4HW3;

public class EStateUserValidationManager implements UserValidationService {

	@Override
	public boolean Validate(Customer customer) {
		 if (customer.getBirthYear() == 1989 && customer.getFirstName() == "Berk" && customer.getLastName() == "Başarır" && customer.getIdentityNumber() == "12345678910"){
             return true;
         } else{
             return false;
         }
	}

}
