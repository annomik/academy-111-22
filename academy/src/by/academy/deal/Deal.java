package by.academy.deal;

import java.time.LocalDateTime;

public class Deal {
	
	private User seller;
	private User buyer;
	private LocalDateTime buyTime;
	private Product [] backet;
			
	
	public Deal(User seller, User buyer, Product product, LocalDateTime buyTime) {
					
		System.out.println(seller.getMoney() ) ;
	}
		
		//full price
		//bill- чек   метод
		//deal - высчитывает фулпрайс, запомнили дату
		
		//alt shift s 
	
	protected double fullPrice(Product product) {
		return product.getPrice() *  product.getQuantity() *  product.getTax();
	}
		
		
		public static void BillPrint(String... backet) {
			for (String number : backet) {
				System.out.print(number + "  "  );
				}
			
			//System.out.println("Banana: 1.523 x 100$ = 152.3$");
		//	System.out.println("Banana: 1.523 x 100$ = 152.3$");
		//	System.out.println("=============================");
		//	System.out.println("Full price: 1234$");	
		}
	

	public Deal(User seller, User buyer, Product[] backet, LocalDateTime buyTime) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.backet = backet;
		this.buyTime = buyTime;
	}

	public User getSeller() {
		return seller;
	}


	public void setSeller(User seller) {
		this.seller = seller;
	}


	public User getBuyer() {
		return buyer;
	}


	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}


	public LocalDateTime getBuyTime() {
		return buyTime;
	}


	public void setBuyTime(LocalDateTime buyTime) {
		this.buyTime = buyTime;
	}


	public Product[] getBacket() {
		return backet;
	}


	public void setBacket(Product[] backet) {
		this.backet = backet;
	}
	
}
	
	
	