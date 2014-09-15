package monsters.controller;

import monsters.model.MarshMallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshMallowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshMallowMonster("Bert", 2, 4, 1, 5, 1, true);
		
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshMallowMonster getMyMonster()
	{
		return myMonster; 
	}

}
