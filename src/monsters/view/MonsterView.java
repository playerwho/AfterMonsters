package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController; 
	}

		public void displayInformation()
		{
			JOptionPane.showMessageDialog(null,  "Hiiiiiii");
			JOptionPane.showMessageDialog(null,  "I made a monster! his name is " + baseController.getMyMonster().getName());
			JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arm");
			JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
			JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getAmountOfHair() + " piecies of hair");
			JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getEyeCount() + " eyes");
			JOptionPane.showMessageDialog(null,  "And " + baseController.getMyMonster().getNoseCount() + " noses");
			
		}
}
