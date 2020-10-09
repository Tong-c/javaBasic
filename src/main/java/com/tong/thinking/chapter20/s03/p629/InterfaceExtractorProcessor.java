package com.tong.thinking.chapter20.s03.p629;

import javax.annotation.processing.*;
import javax.lang.model.element.TypeElement;
import java.util.Set;

public class InterfaceExtractorProcessor extends AbstractProcessor {


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }

}
