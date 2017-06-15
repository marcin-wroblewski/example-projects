package upwm.fun.myshop.basket;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by marci on 04.06.2017.
 */
public class BasketSerializer extends JsonSerializer {
    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        Basket b = (Basket) o;
        jsonGenerator.writeStartArray();
        for(Basket.Item item : b.getItems()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("name", item.getProduct().getName());
            jsonGenerator.writeNumberField("count", item.getCount());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();
    }
}
