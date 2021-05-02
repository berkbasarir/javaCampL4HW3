package javaCampL4HW3;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setIdentityNumber("12345678910");
		customer1.setFirstName("Berk");
		customer1.setLastName("Başarır");
		customer1.setBirthYear(1989);
		customer1.setEmail("berk@basarir.com.tr");
		customer1.setPassword("1234");
		
		CustomerManager customerManager = new CustomerManager(new EStateUserValidationManager());
		customerManager.add(customer1);
		customerManager.update(customer1);
		customerManager.delete(customer1);
		
		System.out.println("-------------------------------------------");
		
		Campaign campaign1 = new Campaign(1, "Bahar Kampanyası", 10);
		Campaign campaign2 = new Campaign(2, "Özel Kampanya", 30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign1);

		System.out.println("-------------------------------------------");		
		
		Game game1 = new Game(1, "Age of Empires", 100);
		Game game2 = new Game(2, "World of Warcraft", 150);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.delete(game2);
		
		
		System.out.println("-------------------------------------------");		

		Sale sale1 = new Sale(1, 1, 2, 1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale1);
		saleManager.update(sale1);
		saleManager.delete(sale1);
		
		
		

	}

}
