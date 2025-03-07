package SerilizationDeserialization;

import POJO.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pojoToJsonObj {
    public static void main(String[] args) throws JsonProcessingException {
        Book book=new Book();
        book.setAuthorName("khjhjk");
        book.setBookName("gggg");

        ObjectMapper objectMapper=new ObjectMapper();

        String jsonStr=objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(book);
        System.out.println(jsonStr);

       Book book1= objectMapper.readValue(jsonStr,Book.class);

        System.out.println(book1.getAuthorName());
    }
}
