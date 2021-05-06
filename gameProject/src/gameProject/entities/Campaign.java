package gameProject.entities;

import gameProject.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
    private String campaignName;
    private double discountRate;

    public Campaign(){

    }

    public Campaign(int id, String campaignName, double discountRate){
        this();
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setDiscountRate(discountRate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}

