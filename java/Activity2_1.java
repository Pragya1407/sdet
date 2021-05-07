package Activity3;

import Activity3.Book;
import Activity3.MyBook;


abstract class Book {
	String title;
    
    abstract void setTitle(String s);
   
    String getTitle()
    {
    return title;
    }

 
}
 
class MyBook extends Book{
	public void setTitle(String s) {
	    title = s;
	}
	
}

public class Activity2_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book newNovel = new MyBook();
		String title = "My Java Book";
		newNovel.setTitle(title);
		System.out.println(newNovel.getTitle());
		

	}

}
