package javaCampL4HW3;


public class CustomerManager implements CustomerService {

	private UserValidationService validator;

	public CustomerManager(UserValidationService validator) {
		this.validator = validator;
	}	
	
	@Override
	public void add(Customer customer) {		
		if(validator.Validate(customer) == true) {
			System.out.println("** Müşteri bilgileri E-Devlet sistemi tarafından doğrulandı.");
			System.out.println("Müşteri eklendi: " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Müşteri bilgileri doğrulanamadı!");
		}
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müşteri güncellendi: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi: " + customer.getFirstName() + " " + customer.getLastName());
		
	}


}
