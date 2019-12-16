package com.chen.dynamicProxy.jdk;

import com.chen.dao.CoustomInvocationHandler;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ProxyUtil {

    public static Object newInstance(Class targetInf,CoustomInvocationHandler h){
        Object proxy=null;
        Method methods[]=targetInf.getDeclaredMethods();
        String line="\n";
        String tab ="\t";
        String infName=targetInf.getSimpleName();
        String content ="";
        String packageContent = "package com.chen;"+line;
        String importContent = "import "+targetInf.getName()+";"+line
                +"import com.chen.dao.CoustomInvocationHandler;"+line
                +"import java.lang.Exception;"
                +"import java.lang.reflect.Method;"+line;
        String clazzFirstLineContent ="public class $Proxy implements "+infName+"{"+line;
        String filedContent  =tab+"private CoustomInvocationHandler h;"+line;
        String constructorContent =tab+"public $Proxy(CoustomInvocationHandler h){" +line
                                    +tab+tab+"this.h=h;"
                                    +line+tab+"}"+line;
        String methodContent = "";
        for(Method method:methods){
            String returnTypeName =  method.getReturnType().getSimpleName();
            String methodName =method.getName();
            Class args[]=method.getParameterTypes();
            String argsContent = "";
            int flag =0;
            for(Class arg:args){
                String temp = arg.getSimpleName();
                argsContent+=temp+" p"+flag+",";
                flag++;
            }
            if (argsContent.length()>0){
                argsContent=argsContent.substring(0,argsContent.lastIndexOf(",")-1);
            }
            methodContent+=tab+"public "+returnTypeName+" "+methodName+"("+argsContent+")throws Exception {"+line
                    +tab+tab+"Method method = Class.forName(\""+targetInf.getName()+"\").getDeclaredMethod(\""+methodName+"\");"+line
                    +tab+tab+"return ("+returnTypeName+")h.invoke(method);"+line;
            methodContent+=tab+"}"+line;
        }

        content=packageContent+importContent+clazzFirstLineContent+filedContent+constructorContent+methodContent+"}";

        File file =new File("C:\\workspace\\$Proxy.java");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();


            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileMgr.getJavaFileObjects(file);

            JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
            t.call();
            fileMgr.close();

            URL[] urls = new URL[]{new URL("file:c:\\workspace\\")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class clazz = urlClassLoader.loadClass("com.chen.$Proxy");

            Constructor constructor = clazz.getConstructor(CoustomInvocationHandler.class);
            proxy = constructor.newInstance(h);
            //clazz.newInstance();
            //Class.forName()
        }catch (Exception e){
            e.printStackTrace();
        }

        return proxy;
    }


}
