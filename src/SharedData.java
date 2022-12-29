import java.util.ArrayList;

/**
 * @author benjy
 * class to share the data
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
/**
 * constructor
 * @param array array of the input integers
 * @param b value of integer to find
 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
/**
 * The function to get the winArray
 * @return the current value of array.
 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
/**
 * The function set the winArray 
 * @param winArray this array set the array with given value
 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
/**
 * The function get the array from class
 * @return the array
 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
/**
 * This function get the b value
 * @return the value of b
 */
	public int getB() 
	{
		return b;
	}
/**
 * This function get the flag 
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
