package org.mydotey.galaxy.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViewResponse<T> {
    
    private int errorCode;
    private String errorMessage;
    private T data;
    
    public static <T> ViewResponse<T> success(T data) {
        return new ViewResponse<>(0, null, data);
    }

    public static <T> ViewResponse<T> fail(int errorCode, String errorMessage) {
        return new ViewResponse<>(errorCode, errorMessage, null);
    }

}
