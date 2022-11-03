import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
/**
 * 
 * @param array set array to array variable
 * @param b set value for b
 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
/**
 * 
 * @return the current value of winarray
 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
/**
 * 
 * @param winArray this function set the winarray with given value
 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
/**
 * 
 * @return the arrayList
 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
/**
 * 
 * @return the value of b
 */
	public int getB() 
	{
		return b;
	}
/**
 * 
 * @return the current status of the flag
 */
	public boolean getFlag() 
	{
		return flag;
	}
/**
 * 
 * @param flag this function set flag to value that set
 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
