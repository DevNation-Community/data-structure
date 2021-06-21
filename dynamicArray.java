@SuppressWarnings("unchecked")
public class Array <T> implements Iterable <T>{
	private T [] arr;
	private int len =0;  // length user thinks array is
	private int capacity = 0; // actual array size
	
	private Array() {this(16);} //initialises the size of the array to 16
	public Array(int capacity) {
	if (capacity < 0) throw new IllegalArugmentException("Illegal capacity:" + capacity);
	this.capacity = capacity;
	arr = (T[]) new Object[capacity]; 
	}
	public int size() {return len;}
	public boolean isEmpty() {return size() == 0;}

	public T gets (int index) {return arr[index];} //indexing into array to get element at index
	public  void set(int index, t elem) {arr[index] = elem;} //setting values at some index

	//clearing the array and making its length to 0
	public void clear() {
		for(int i = 0; i< capacity; i++)
			arr[i] = null;
		len= 0;
	}
	//adding a new element
	public void add(T elem) {
		if(len+1 >= capacity) {
			if (capacity == 0) capacity = 1;
			else capacity *= 2; //doubling the size of array
			T[] new_arr = (T[]) new Object[capacity];
			for (int i = 0; i<len; i++)
				new_arr[i] = arr[i];
			Arr = new_arr;
		}
	arr[len++] = elem;
	}
	//Remove element at nidex
	public T removeAT(int rm_index) {
		if (rm_index >= len&& rm_idenx < 0) throw new IndexOutOfBoundsException();
		T data = new arr[rm_index]; 
		T[] new_arr = (T[]) new Object[len-1];
		for (int i=0, j = 0; i< len; i++, j++)
		if (i == rm_index) j--;
		else new_arra[j] = arr[i];
		arr = new_arr;
		return data;
	}  
	//removes element
	public  boolean remove(Object obj) {
		for(int i = 0; i< len; i++){
			if(arr[i].equals(obj)){
				removeAt(i); return true;}} 
		return false;
	}
	//retuns the index of what ever element we are looking for
	public int indexOf(Object obj){
		for(int i = 0; i< len; i++)
			if (arr[i].equlas(obj))
				return i;
		return -1;
	}
	//checks if indexOf is not -1
	public boolean contains (Object obj) {
		return indexOf(obj) != -1;
	}
	//iterate in the array
	@Override public java.util.Iterator <T> iterator () {
		return new java.util.Iterator <T> () {
			int index = 0;
			public boolean hasNext() { return index < len; } //checks of the index has next element or not
			public T newt() {return arr[index++]; } //returns next element
		};
	}
	//get string representation fo array
	@Overrideoublic String toString() {
		if(len == 0) return "[]";
		else {
			StringBuilder sb = new StringBuilder (len).append("[");
			for (int i = 0; i<len-1; i++)
				sb.append(arr[i] + ",");
		return sb.append(arr[len-1] + "}").toString();
	}	
}
