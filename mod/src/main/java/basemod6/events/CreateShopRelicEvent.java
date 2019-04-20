package basemod6.events;

import com.megacrit.cardcrawl.shop.ShopScreen;
import com.megacrit.cardcrawl.shop.StoreRelic;

import java.util.ArrayList;

public class CreateShopRelicEvent extends Event
{
	private ShopScreen shopScreen;
	private ArrayList<StoreRelic> relics;

	public CreateShopRelicEvent(ShopScreen shopScreen, ArrayList<StoreRelic> relics)
	{
		this.shopScreen = shopScreen;
		this.relics = relics;
	}

	public ShopScreen getShopScreen()
	{
		return shopScreen;
	}

	public ArrayList<StoreRelic> getRelics()
	{
		return relics;
	}
}