package com.company.Service;
@FunctionalInterface
public interface Converter<T,N>{
    T convert(N el);
    static <T> boolean isNotNull(T t){
        return t != null;
    }
}
