package application;

import java.util.Iterator;

public class LinkedList<T>{
	protected ListElement<T> head;
	protected ListElement<T> tail;
	protected int size;
	
	public boolean isEmpty() {
		boolean state = (head == null || tail == null) ? true : false;
		return state;
	}
	public ListElement<T> add(T object) {
		if(this.isEmpty()) {
			tail = new ListElement<T>(object);
			tail.setID(1);
			head = tail;
			size=1;
		}
		else {
			ListElement<T> newTail = new ListElement<T>(object);
			newTail.setID(getTail().getID()+1);
			tail.setNext(newTail);
			this.tail=newTail;
			size++;
		}
		
		return this.tail;
	}
	public ListElement<T> getHead(){
		return head;
	}
	public ListElement<T> getTail(){
		return tail;
	}
	public ListElement<T> getByIndex(int index) {
		ListElement<T> temp=this.head;
		for(int i=1;i<index;i++){
			temp=temp.getNext();
		}
		return temp;
	}
	public void remove(ListElement<T> elem) {
		if(elem.getID()==1 || elem.getID()==this.head.getID()) {
			if(elem.getNext()!=null) {
				this.head=elem.getNext();
			}else {
				this.head=null;
				this.tail=null;
			}
		}
		else {
			ListElement<T> temp=this.head; //searching for element with same ID in list
			try {
				for(int i=0; temp.getNext().getID()!=elem.getID(); i++) {
					temp=temp.getNext();
				}
				if(elem.getID()==this.getTail().getID()) { // new tail is previous element if removed was tail
					temp.getNext().setNext(null); 		   //old tail's Next set to null
					this.tail=temp;
				}
				temp.setNext(temp.getNext().getNext());
			}
			catch(Exception e) {
			}
		}
	}
	
}	
	

