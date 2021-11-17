package pt.iade.spotopark.models.exceptions;

public class Response {
    private final String message;
    private final Object object;

    public Response(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public Object getObject() {
        return object;
    }

}