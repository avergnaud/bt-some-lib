package some;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyUtility1 {
    
    public static String test(MyBean myBean) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(myBean);
        return jsonString;
    }
}
