package com.parsedex.lib;

import com.parsedex.lib.struct.ClassDefItem;
import com.parsedex.lib.struct.CodeItem;

import java.util.List;

public interface Callback {
    void classInfo(int classId, String className, ClassDefItem classDefItem);

    void classFieldInfo(boolean isStatic, int fieldId, String className, String name, String type);


    void classMethodInfo(boolean isStatic, int methodId, String className, String methodName, String returnName, List<String> params, CodeItem codeItem);

}
