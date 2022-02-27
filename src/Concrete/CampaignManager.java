package Concrete;

import Abstract.ICampaignService;

import Entities.Campaign;


public class CampaignManager implements ICampaignService{


	

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası eklendi");		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası silindi");		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyası güncellendi");
				
	}

}
