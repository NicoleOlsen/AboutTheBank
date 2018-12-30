package aboutTheBank.bonds;

import java.time.LocalDate;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "bonds")
public class Bond {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String buyer;
	private String seller;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate tradeDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate maturityDate;
	private double notional;
	private String rateType;
	private double fixedRate;
	private String floatingRate; // TODO enum
	private String schedule; // TODO enum
	
	public Bond() {	}
	
	public Bond(int id, String buyer, String seller, LocalDate tradeDate, LocalDate maturityDate, double notional, 
			String rateType, double fixedRate, String floatingRate, String schedule) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.seller = seller;
		this.tradeDate = tradeDate;
		this.maturityDate = maturityDate;
		this.notional = notional;
		this.rateType = rateType;
		this.fixedRate = fixedRate;
		this.floatingRate = floatingRate;
		this.schedule = schedule;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBuyer() {
		return buyer;
	}
	
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	
	public String getSeller() {
		return seller;
	}
	
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public LocalDate getTradeDate() {
		return tradeDate;
	}
	
	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}
	
	public LocalDate getMaturityDate() {
		return maturityDate;
	}
	
	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}
	
	public double getNotional() {
		return notional;
	}
	
	public void setNotional(double notional) {
		this.notional = notional;
	}
	
	public double getFixedRate() {
		return fixedRate;
	}
	
	public void setFixedRate(double fixedRate) {
		this.fixedRate = fixedRate;
	}
	
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getFloatingRate() {
		return floatingRate;
	}

	public void setFloatingRate(String floatingRate) {
		this.floatingRate = floatingRate;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fixedRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((floatingRate == null) ? 0 : floatingRate.hashCode());
		result = prime * result + id;
		result = prime * result + ((maturityDate == null) ? 0 : maturityDate.hashCode());
		temp = Double.doubleToLongBits(notional);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rateType == null) ? 0 : rateType.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		result = prime * result + ((tradeDate == null) ? 0 : tradeDate.hashCode());
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
		Bond other = (Bond) obj;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (Double.doubleToLongBits(fixedRate) != Double.doubleToLongBits(other.fixedRate))
			return false;
		if (floatingRate == null) {
			if (other.floatingRate != null)
				return false;
		} else if (!floatingRate.equals(other.floatingRate))
			return false;
		if (id != other.id)
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (Double.doubleToLongBits(notional) != Double.doubleToLongBits(other.notional))
			return false;
		if (rateType == null) {
			if (other.rateType != null)
				return false;
		} else if (!rateType.equals(other.rateType))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		if (tradeDate == null) {
			if (other.tradeDate != null)
				return false;
		} else if (!tradeDate.equals(other.tradeDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bond{" + "id=" + id + ", buyer=" + buyer + ", seller=" + seller + ", tradeDate=" + tradeDate + ", maturityDate=" 
				+ maturityDate + ", notional=" + notional + ", rateType=" + rateType + ", fixedRate=" + fixedRate + ", floatingRate=" 
				+ floatingRate + ", schedule=" + schedule + "}";
	}
	
}
