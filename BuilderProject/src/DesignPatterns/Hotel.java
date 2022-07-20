package DesignPatterns;

public class Hotel {
	
	private final String accommodation;
	private final String food;
	private final String beverages;
	private final Boolean etrans;
	
	
	
	@Override
	public String toString() {
		return "Hotel [accommodation=" + accommodation + ", food=" + food + ", beverages=" + beverages + ", etrans="
				+ etrans + "]";
	}

	public Hotel (Builder builder) {
		
		this.accommodation=builder.accommodation;
		this.food=builder.food;
		this.beverages=builder.beverages;
		this.etrans=builder.etrans;
		
	}
	
	static class Builder{
		
		private String accommodation;
		private String food;
		private String beverages;
		private Boolean etrans;
		
		public Hotel build() {
			// TODO Auto-generated method stub
			return new Hotel(this);
		}
		
		public Builder accommodation(String accommodation) {	
			this.accommodation=accommodation;
			return this;
		}
		
		public Builder food(String food) {
			this.food=food;
			return this;
		}
		
		public Builder beverages(String beverages) {	
			this.beverages=beverages;
			return this;
		}
		
		public Builder etrans(Boolean etrans) {
			this.etrans= etrans;
			return this;
		}

		
		
		
		
	}

}
