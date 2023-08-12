import java.util.Date;

public class Block
{
	public String hash;
	public String previousHash;
	private String data;  //our data
	private long timeStamp; //number in milliseconds
	
	//Block Constructor 
	public Block(String data, String previousHash){
	    this.data = data;
	    this.previousHash = previousHash;
	    this.timeStamp = new Date().getTime();
	}
}
