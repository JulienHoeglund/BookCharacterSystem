//----------Packages & Imports----------//
package controllers;

/**
 * @author Daniel Quinlan
 * @studentNumber 01133940
 * @course Entertainment Systems Yr 2
 * 
 * @param <T>
 */
public class SortedMap<A,B> {
	private Pair head=null;
	
	/**
	 * Inner Pair Class
	 */
	private class Pair {
		//Pair Elements
		public A key;
		public B value;
		Pair next = null;
		
		//Pair Constructor
		public Pair(A key, B value){
			this.key = key;
			this.value = value;
		}
	}
	
	/**
	 * Create pair
	 * 
	 * @param data
	 */
	public void add(A key,B value){
		if(get(key)!=null) remove(key); //No duplicates found
		Pair e = new Pair(key,value);
		e.next = head;
		head = e;
	}
	
	/**
	 * Get value from key
	 * 
	 * @param data
	 */
	public B get(A key){
		Pair temp = head;
		while(temp!=null && !temp.key.equals(key)) temp = temp.next;
		return temp == null ? null : temp.value;
	}
	
	/**
	 * Remove Pairing
	 * 
	 * @param data
	 */
	public B remove(A key){
		Pair temp = head, prev = null;
		while(temp!=null && !temp.key.equals(key)){
			prev = temp;
			temp = temp.next;
		}
		if(temp != null){
			if(prev == null) head = temp.next;
			else prev.next = temp.next;
			return temp.value;
		}
		return null;
	}
	
	/**
	 * Clear all Pairs
	 * 
	 * @param data
	 */
	public void clear(){
		head = null;
	}
	
	/**
	 * Checks for Pairs
	 * 
	 * @param data
	 */
	public boolean isEmpty(){
		return head == null;
	}
	
	/**
	 * Number of Pairs
	 * 
	 * @param data
	 */
	public int size(){
		Pair temp = head;
		int count = 0;
		while(temp != null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	/* public SortedLinkedList<String> getLinkedList(){
		SortedLinkedList<String> sll = new SortedLinkedList<>();
		Entry temp = head;
		while(temp != null){
			sll.push(temp.key);
			temp = temp.next;
		}
		return sll;
	} */
	
	
}
