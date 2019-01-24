package book.book;
import java.util.Arrays;

public class customBookList<T>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 1;
    private Object elements[];

    public customBookList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
 
    public void add(T e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public Book get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (Book) elements[i];
    }
    public void search(T s) {
    	//delete
    	for(int i=0;i<elements.length;i++) {
			if(s.equals(elements[i])) {
				remove(i);
				break;
			}
		}
    }
    
    public int searchByobject(T s) {
    	for(int i=0;i<elements.length;i++) {
			if(s.equals(elements[i])) {
				return i;
			}
		}
    	return -1;
    }
    
    public int replaceByobject(T s,T s1) {
    	for(int i=0;i<elements.length;i++) {
			if(s.equals(elements[i])) {
				elements[i] = s1;
				break;
			}
		}
    	return -1;
    }
    
    public void removeAll() {
    	int i = 0;
		while(size>0) {
			remove(i);
			size--;
		}
    }
    
    public void addAll(customBookList<T>Obj) {
    	int j=0;
    	for(int i=size;i<this.size + Obj.size;i++) {
    		ensureCapacity();
    		elements[i]=Obj.elements[j];
    		j++;
    	}
    	size=size+Obj.size;
    }
    
    @SuppressWarnings("unchecked")
    public Book remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (Book) item;
    }
     
    public int size() {
        return size;
    }
     
    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = elements.length  +1;
        elements = Arrays.copyOf(elements, newSize);
    }
}
