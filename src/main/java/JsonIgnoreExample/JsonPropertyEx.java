package JsonIgnoreExample;

import POJO.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyEx {
    public static void main(String[] args) throws JsonProcessingException {

        Book book=new Book();
        book.setBookName("kishasn");
        book.setAuthorName("msd" );

        ObjectMapper objectMapper =new ObjectMapper();

       String jsonBookObj= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);

        System.out.println(jsonBookObj);

       Book b1= objectMapper.readValue(jsonBookObj,Book.class);

        System.out.println(b1.getAuthorName());
    }
}
