package ru.synq.smev.services.inn;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class InnNamingStrategy extends PropertyNamingStrategy.PascalCaseStrategy {
    @Override
    public String translate(String input) {
        return super.translate(input);
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return isUpper(method.getName().replace("set",""))
                ? translate(defaultName.toUpperCase())
                : super.nameForSetterMethod(config, method, defaultName);
    }

    public static boolean isUpper(String s) {
        for(char c : s.toCharArray()) {
            if(! Character.isUpperCase(c))
                return false;
        }
        return true;
    }
}
