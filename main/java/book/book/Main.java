package book.book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
    {
		Scanner in=new Scanner(System.in);
		Scanner in1=new Scanner(System.in);
		customBookList<Book> list = new customBookList<>();
		customBookList<Book> list1 = new customBookList<>();
 
        list.add(new Book("Harry potter",12,"G.K. rowline"));
        list.add(new Book("The hobbit",13,"J. R. R. Tolkien"));
        list.add(new Book("1984",14,"George Orwell"));
        list.add(new Book("Pride and Prejudice",15,"Jane Austone"));
        list.add(new Book("The Da Vinci Code",16,"Dan brown"));
        //System.out.println(list.size());
        list1.add(new Book("Harry",12,"G.K. rowline"));
        list1.add(new Book("hobbit",13,"J. R. R. Tolkien"));
        while(true) {
			
			System.out.println("press 1 for add book\n"
					+"press 2 for view full book list\n"
					+"press 3 for delete book\n"
					+"press 4 for search by object\n"
					+"press 5 for replace by object\n"
					+"press 6 for remove all\n"
					+"press 7 for addAll");
			int a=in.nextInt();
		switch(a) {
		case 1:
			System.out.println("Press book name:");
			String s=in1.next();
			System.out.println("Press book Id:");
			int s1=in.nextInt();
			System.out.println("Press author name:");
			String s2=in1.next();
			list.add(new Book(s,s1,s2));
			break;
		case 2:
			System.out.println(list);
			break;
		case 3:
			Book b=new Book("Pride and Prejudice",15,"Jane Austone");
			list.search(b);
			break;
		case 4:
			Book c=new Book("Pride and Prejudice",15,"Jane Austone");
			int k=list.searchByobject(c);
			if(k !=- 1)
				System.out.println(list.get(k));
			else
				System.out.println("not found");
			break;
		case 5:
			Book d=new Book("Pride and Prejudice",15,"Jane Austone");
			Book e=new Book("Pride",15,"Jane Austone");
			int l=list.replaceByobject(d,e);
			break;
		case 6:
			list.removeAll();
			break;
		case 7:
			list.addAll(list1);
			break;
			
    		}
		System.out.println("Press 8 for continue:\npress 9 for exit:");
		int dd=in.nextInt();
		if(dd==9)
			break;
        }
      }

          
//        //Get element with index
//        System.out.println( list.get(0) );
//        System.out.println( list.get(1) );
// 		  list.set(2, "New");
//        //List Size
//        System.out.println(list.size());
    
}

