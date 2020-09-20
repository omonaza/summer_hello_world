package OOP;

public class bookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();

        System.out.println(book1.getPrice("regular"));
        System.out.println(book1.getPrice("student"));
    }

}
