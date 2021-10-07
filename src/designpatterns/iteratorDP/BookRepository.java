package designpatterns.iteratorDP;

public class BookRepository implements Container {
    public String[] books = {"Java" , "Design pattern" ,"function programming" , "Collection framework"};

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < books.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return books[index++];
        }
    }
}
