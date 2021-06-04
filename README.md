### This is a java project that parses android dex

#### How to use?
```
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
```

### logcat
```
classId =10,className=Lcom/test_dex/Test;
isStatic=true, fieldId=5, name=black, type=I
isStatic=true, fieldId=11, name=white, type=I
isStatic=true, methodId=6, methodName=<init>, returnName=V, params=[]
```
