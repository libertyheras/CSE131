package exercises8;

import java.util.HashSet;
import java.util.Set;

public class StockHolding {
	final String code;
	final String owner;
	final int  numShares;
	private double pricePerShare;
	
	
	 

	public StockHolding(String code, String owner, double pricePerShare) {
		super();
		this.code = code;
		this.owner = owner;
		this.pricePerShare = pricePerShare;
		this.numShares = 0;
	}




	public double getPricePerShare() {
		return pricePerShare;
	}




	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}




	public String getCode() {
		return code;
	}




	public String getOwner() {
		return owner;
	}




	public int getNumShares() {
		return numShares;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockHolding other = (StockHolding) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "StockHolding [code=" + code + ", owner=" + owner + ", numShares=" + numShares + ", pricePerShare="
				+ pricePerShare + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<StockHolding> set = new HashSet<StockHolding>();
		
		StockHolding s1 = new StockHolding("IBM","PM",10);
		s1.setPricePerShare(100);;
		set.add(s1);
		System.out.println(set);
		
	}

}
