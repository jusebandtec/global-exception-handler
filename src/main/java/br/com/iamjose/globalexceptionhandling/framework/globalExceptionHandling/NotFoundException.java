package br.com.iamjose.globalexceptionhandling.framework.globalExceptionHandling;

public class NotFoundException extends ExceptionCustomized{
    public NotFoundException(String code, String message) {
        super(code, message);
    }
}

