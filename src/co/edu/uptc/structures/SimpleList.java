package co.edu.uptc.structures;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SimpleList<T> implements List<T> {
    private Node<T> head;

    public SimpleList() {
    	head = null;
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public boolean add(T e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        return true;
    }

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		int currentPos = 0;
		Node<V> current = head;
		while (current != null) {
			if (current.data != null && current.data.equals(element) ||
					current.data == element) {
				index = currentPos;
			}
			current = current.next;
			currentPos++;
		}
		return index;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof SimpleList) {
            SimpleList<?> that = (SimpleList<?>) o;
            if (this.size() != that.size()) return false;
            for (int i = 0; i < this.size(); i++) {
                T thisElem = this.get(i);
                Object thatElem = that.get(i);
                if (thisElem == null) {
                    if (thatElem != null) return false;
                } else {
                    if (!thisElem.equals(thatElem)) return false;
                }
            }
            return true;
        }
        if (o instanceof List) {
            List<?> thatList = (List<?>) o;
            if (this.size() != thatList.size()) return false;
            for (int i = 0; i < this.size(); i++) {
                T thisElem = this.get(i);
                Object thatElem = thatList.get(i);
                if (thisElem == null) {
                    if (thatElem != null) return false;
                } else {
                    if (!thisElem.equals(thatElem)) return false;
                }
            }
            return true;
        }
        return false;
    }

}
