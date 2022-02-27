package Entities;

public class Campaign {
	
	private String campaignId;
	private String campaignName;
	private double discount;
	
	public Campaign() {
		
	}
	public Campaign(String campaignId, String campaignName, double discount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}
	
	public String getCompaignId() {
		return campaignId;
	}
	
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	

}
