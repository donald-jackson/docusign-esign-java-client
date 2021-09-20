package javax.ws.rs.core;

import java.lang.reflect.Type;

public class GenericType<T> extends com.sun.jersey.api.client.GenericType<T> {
    public GenericType() {
        super();
    }
    public GenericType(Type genericType) {
        super(genericType);
    }
}
