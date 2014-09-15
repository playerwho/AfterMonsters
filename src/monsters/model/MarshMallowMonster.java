package monsters.model;

public class MarshMallowMonster
{

	private String name;
	private double numberOfLegs;
	private double amountOfHair;
	private int armCount;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshMallowMonster()
	{
		
	}
	
	public MarshMallowMonster(String name, double numberOfLegs, double amountOfHair, int armCount, int eyeCount, int noseCount, boolean hasBellyButton  )
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.amountOfHair = amountOfHair;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public double getAmountOfHair()
	{
		return amountOfHair;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public boolean hasBellyButon()
	{
		return hasBellyButton;
	}
}
