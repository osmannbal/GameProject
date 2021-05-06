package gameProject.entities;

import gameProject.abstracts.Entity;

public class Sale implements Entity{
	private int id;
    private String creditCardNumber;

    public Sale(){

    }

    public Sale(int id, String creditCard){
        this.setId(id);
        this.setCreditCard(creditCard);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCard() {
        return creditCardNumber;
    }

    public void setCreditCard(String creditCard) {
        this.creditCardNumber = creditCard;
    }

    public double getSalePrice(Campaign campaign, Game game){
        return game.getPrice() - (game.getPrice() * (campaign.getDiscountRate() / 100));
    }
}

