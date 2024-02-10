/**@author Nikhil Mangali
 * @version 3.0
 * @since 2002
 * 
 * 
 * */


/** 
 * Class for library book
 */

public class Book {

    /**
     * @value 10 default value
     */
    static int value=0;

    /**
     * 
     * @param s is Book Name
     */
    public Book(String s)
    {

    }
    /**
     * Issue a book to the student 
     * @param rollno is a student
     * @throws Exception if book not avaialable,throws exception
     */
    public void issue(int rollno) throws Exception
    {

    }

    /**
     * check if book if available,and return true if available
     * @param str Book name
     * @return return true if book is available
     */
    public boolean available(String str)
    {
        return true;
    }

    /**
     * Get bookk name
     * @param id Book id
     * @return Book name
     */
    public String getName(int id)
    {
        return "";
    }
    public static void main(String[] args) {
        
    }
}
