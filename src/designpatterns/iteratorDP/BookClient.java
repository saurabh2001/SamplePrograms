package designpatterns.iteratorDP;

public class BookClient {
    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        Iterator itr = repo.getIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
