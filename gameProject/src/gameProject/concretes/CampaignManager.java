package gameProject.concretes;

import gameProject.abstracts.CampaignService;
import gameProject.entities.Campaign;

public class CampaignManager implements CampaignService{
	@Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " gŁncellendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " silindi.");
    }
}
