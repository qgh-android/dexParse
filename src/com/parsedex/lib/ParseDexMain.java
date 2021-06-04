package com.parsedex.lib;

import com.parsedex.lib.struct.ClassDefItem;
import com.parsedex.lib.struct.CodeItem;

import java.util.Arrays;
import java.util.List;


public class ParseDexMain {

    private static String dexpath = "C:\\Users\\xxx\\Desktop\\dex\\classes.dex";

    public static void main(String[] args) {

        ParseDexUtils.parseDex(dexpath, new Callback() {
            @Override
            public void classInfo(int classId, String className, ClassDefItem classDefItem) {
                System.out.println("classId =" + classId + ",className=" + className);
            }

            @Override
            public void classFieldInfo(boolean isStatic, int fieldId, String className, String name, String type) {
                System.out.println("isStatic=" + isStatic + ", fieldId=" + fieldId + ", name=" + name + ", type=" + type);
            }

            @Override
            public void classMethodInfo(boolean isStatic, int methodId, String className, String methodName, String returnName, List<String> params, CodeItem codeItem) {
                System.out.println("isStatic=" + isStatic + ", methodId=" + methodId + ", methodName=" + methodName + ", returnName=" + returnName + ", params=" + Arrays.toString(params.toArray()));
                if (codeItem != null) {
                    System.out.println("codeItem.insns=" + Arrays.toString(codeItem.insns));
                }
            }
        });

    }
}

