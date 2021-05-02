package javaCampL4HW3;

public class SaleManager  implements SaleService {

	@Override
	public void add(Sale sale) {
		System.out.println(
							"Satış eklendi: (" 
							+ sale.getCustomerId() + ")id numaralı müşteri (" 
							+ sale.getGameId() + ")id numaralı oyununu (" 
							+ sale.getCampaignId() + ")id numaralı kampanya ile ("  
							+ sale.getSaleDate() + " tarihinde satın aldı"
						  );		
	}

	@Override
	public void update(Sale sale) {
		System.out.println("Satış güncellendi");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Satış silindi");
		
	}



}
