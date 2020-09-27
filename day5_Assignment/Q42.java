class Tile{
	int Length=4;
}
class Floor extends Tile{
	private int Length=12;
	private int Width=13;
	int totalNoTiles;
	boolean totalTile(Tile T) {
		
	if(this.Width % super.Length==0)
	{
		this.Width=this.Width/super.Length;
		
	}
	else {
		this.Width=(this.Width/super.Length)+1;
	}
	if(this.Length%super.Length==0) {
		this.Length=this.Length/super.Length;
	}
	else {
		this.Length=(this.Length/super.Length)+1;
	}
	totalNoTiles = this.Length*this.Width;
	System.out.println("total no of tiles: "+totalNoTiles);
	return true;

	}
}
public class Q42 {

	public static void main(String args[]) {
		
	Floor f =new Floor();
	Tile T = new Tile();
	System.out.println("object pass as argu : "+f.totalTile(T));
		
	}
}
