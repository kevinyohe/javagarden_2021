import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class OrderSerializer {
    private String id;
    private String name;

    public OrderSerializer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public OrderSerializer(){
        // not sure why it doesnt work without this.
        super();
    }
    public OrderSerializer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
