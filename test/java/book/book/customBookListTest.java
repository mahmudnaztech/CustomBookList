package book.book;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class customBookListTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		customBookList<Book> list = new customBookList<>();
		Book b=new Book("Harry potter",12,"G.K. rowline");
        list.add(b);
        assertTrue(list.size() == 1 && list.get(0).equals(b));
	}


	@Test
	public void testSearch() {
		//delete function
		customBookList<Book> list = new customBookList<>();
		list.add(new Book("Harry potter",12,"G.K. rowline"));
        list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
        list.add(new Book("1984",14,"George Orwell"));
        list.add(new Book("Pride and Prejudice",15,"Jane Austone"));
        list.add(new Book("The Da Vinci Code",16,"Dan brown"));
		Book b=new Book("Pride and Prejudice",15,"Jane Austone");
		list.search(b);
		assertTrue(list.size() == 4 && list.searchByobject(b) == -1);
	}

	@Test
	public void testSearchByobject() {
		customBookList<Book> list = new customBookList<>();
		list.add(new Book("Harry potter",12,"G.K. rowline"));
        list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
        list.add(new Book("1984",14,"George Orwell"));
        Book d=new Book("Pride and Prejudice",15,"Jane Austone");
        list.add(new Book("The Da Vinci Code",16,"Dan brown"));
		//fail("Not yet implemented");
		Book c=new Book("Pride and Prejudice",15,"Jane Austone");
		int k=list.searchByobject(c);
		assertTrue(list.searchByobject(c) == k);
	}

	@Test
	public void testReplaceByobject() {
		//fail("Not yet implemented");
	customBookList<Book> list = new customBookList<>();
	list.add(new Book("Harry potter",12,"G.K. rowline"));
    list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
    list.add(new Book("1984",14,"George Orwell"));
    list.add(new Book("Pride and Prejudice",15,"Jane Austone"));
    list.add(new Book("The Da Vinci Code",16,"Dan brown"));
    Book d=new Book("Pride and Prejudice",15,"Jane Austone");
	Book e=new Book("Pride",15,"Jane Austone");
	int l=list.replaceByobject(d,e);
	assertEquals(e,list.get(3));
	}

	@Test
	public void testRemoveAll() {
		//fail("Not yet implemented");
    customBookList<Book> list = new customBookList<>();
	list.add(new Book("Harry potter",12,"G.K. rowline"));
    list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
    list.add(new Book("1984",14,"George Orwell"));
    list.add(new Book("Pride and Prejudice",15,"Jane Austone"));
    list.add(new Book("The Da Vinci Code",16,"Dan brown"));
    list.removeAll();
    assertTrue(list.size() == -1);
	}

	@Test
	public void testAddAll() {
		//fail("Not yet implemented");
    customBookList<Book> list = new customBookList<>();
    customBookList<Book> list1 = new customBookList<>();
	list.add(new Book("Harry potter",12,"G.K. rowline"));
    list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
    list.add(new Book("1984",14,"George Orwell"));
    list.add(new Book("Pride and Prejudice",15,"Jane Austone"));
    list.add(new Book("The Da Vinci Code",16,"Dan brown"));
    list1.add(new Book("Harry",12,"G.K. rowline"));
    list1.add(new Book("hobbit",13,"J. R. R. Tolkien"));
    list.addAll(list1);
    assertTrue(list.size()==7);
	}

}
