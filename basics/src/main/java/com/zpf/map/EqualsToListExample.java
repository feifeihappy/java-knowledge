package com.zpf.map;

import java.util.HashSet;
import java.util.Objects;  
import java.util.Set;  
public class EqualsToListExample {  
    public static void main(String[] args) {  
        // 对象 1  
        Persion p1 = new Persion();  
        p1.setName("Java");  
        p1.setAge(18);  
        // 对象 2  
        Persion p2 = new Persion();  
        p2.setName("Java");  
        p2.setAge(18);  
        // 创建 Set 对象  
        Set<Persion> set = new HashSet<Persion>();  
        set.add(p1);  
        set.add(p2);  
        // 打印 Set 中的所有数据  
        set.forEach(p -> {  
            System.out.println(p);  
        });  
    }  
}  