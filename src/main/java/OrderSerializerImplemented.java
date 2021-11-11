import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/*
Some Jackson Object Mapper Code
https://www.youtube.com/watch?v=pv1VCFWTP-I&ab_channel=SwatechTalks
 */
public class OrderSerializerImplemented {
    public static void main(String[] args) {
        var order1 = new OrderSerializer("ID123", "Joey Mc Doughey");
        var order2 = new OrderSerializer("IDID1010", "Kevin Mc Douchy");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Writing files to files, same them for later.
            objectMapper.writeValue(new File("target/order1.json"), order1);
            objectMapper.writeValue(new File("target/order2.json"), order2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // load from a string literal
        try {
            ObjectMapper objectMapper1 = new ObjectMapper();
            String orderJson = "{\"id\":\"ID123\",\"name\":\"Joey Mc Doughey\"}";
            // Put the String data in objectMapper using OrderSerializer.class as the Class to use
            OrderSerializer coolOrder = objectMapper1.readValue(orderJson, OrderSerializer.class);
            System.out.println(coolOrder.getId());
        } catch (final Exception e){
            e.printStackTrace();
        } finally {
            System.out.printf("done with reading object from file");
        }

        // Using JsonNode to map string as an json object
        String orderJson = "{\"id\":\"ID123\",\"name\":\"Blaze Mc Weedy\"}";
        ObjectMapper objectMapper2 = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper2.readTree(orderJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("jsonNode.get(\"name\").asText() = " + jsonNode.get("name").asText());
        System.out.println("jsonNode.get(\"id\").asText() = " + jsonNode.get("id").asText());
        // now lets write it all out as a string through objectMapper
        ObjectMapper objectMapper3 = new ObjectMapper();
        try {
            System.out.println("Here's the whole Json String or an error: ");
            System.out.println(objectMapper3.writeValueAsString(jsonNode));
            System.out.println("Here's the same data, just nicer to look at.");
            System.out.println(jsonNode.toPrettyString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
