package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Type;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        AdminUser admin = new AdminUser("Tarik");
        RegularUser user = new RegularUser("Skender");

        for(Annotation annotation : AdminUser.class.getAnnotations()){

            if(RegularUser.class.isAnnotationPresent(UserPermission.class)){
                int level = RegularUser.class.getAnnotation(UserPermission.class).level();
                if(level>1){
                    System.out.println("This user can send messages");
                }
                else {
                    System.out.println("This user can't send messages");
                }
            }
        }

    }
}
