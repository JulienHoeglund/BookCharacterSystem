package application;

public class ListElement<T> {
	private T object;
	private ListElement<T> next;
	private int ID;
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public ListElement(T ob) {
		this.object=ob;
	}
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public ListElement<T> getNext() {
		return (ListElement<T>)next;
	}

	public void setNext(ListElement<T> next) {
		this.next = next;
	}	
}
