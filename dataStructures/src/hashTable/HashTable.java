package hashTable;

import java.lang.reflect.Array;

import doublyLinkedList.DoublyLinkedList;

public class HashTable {

	private static int SIZE = 11;
	private DoublyLinkedList<String>[] array;

	@SuppressWarnings("unchecked")
	public HashTable(@SuppressWarnings("rawtypes") Class<DoublyLinkedList> c) {
		final DoublyLinkedList<String>[] a = (DoublyLinkedList<String>[]) Array.newInstance(c, SIZE);
		array = a;
	}

	public void insert(String newElement) {
		int hashCodeOfNewElement = Math.abs(newElement.hashCode());

		array[hashCodeOfNewElement % SIZE] = chainedHashInsert(array[hashCodeOfNewElement % SIZE], newElement);
	}

	private DoublyLinkedList<String> chainedHashInsert(DoublyLinkedList<String> list, String newElement) {
		if (list == null) {
			list = new DoublyLinkedList<>(newElement);
			return list;
		}
		
		list.addAsFirst(newElement);
		return list;
	}
	
	public String delete(String element) {
		int hashCodeOfElement = Math.abs(element.hashCode());
		
		return chainedHashDelete(array[hashCodeOfElement % SIZE], element);
	}

	private String chainedHashDelete(DoublyLinkedList<String> list, String element) {
		if (list != null) {
			return list.remove(element);
		}
		
		return null;
	}

	public String search(String element) {
		int hashCodeOfElement = Math.abs(element.hashCode());

		return chainedHashSearch(array[hashCodeOfElement % SIZE], element);
	}
	
	private String chainedHashSearch(DoublyLinkedList<String> list, String element) {
		if (list != null) {
			if (list.find(element) > -1) {
				return element;
			}
		}
		
		return null;
	}

}
