package injection;

public class BookWormOracle implements Oracle{
	private Encyclopedia encyclopedia;
	@Override
	public String defineMeaningOfLife() {
		// TODO Auto-generated method stub
		return "Encyclopedias are waste of money - go see the world instead";
	}
	
	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}
	
	

}
