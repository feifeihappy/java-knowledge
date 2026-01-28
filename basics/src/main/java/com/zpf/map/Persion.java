package com.zpf.map;

import java.util.Objects;

class Persion {
    private String name;  
    private int age;  
    @Override  
    public boolean equals(Object o) {  
        if (this == o) return true; // 引用相等返回 true  
        // 如果等于 null，或者对象类型不同返回 false  
        if (o == null || getClass() != o.getClass()) return false;  
        // 强转为自定义 Persion 类型  
        Persion persion = (Persion) o;  
        // 如果 age 和 name 都相等，就返回 true  
        return age == persion.age &&  
                Objects.equals(name, persion.name);
    }  
    @Override  
    public int hashCode() {  
        // 对比 name 和 age 是否相等  
        return Objects.hash(name, age);  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }     
    @Override  
    public String toString() {  
        return "Persion{" +  
                "name='" + name + '\'' +  
                ", age=" + age +  
                '}';  
    }  
} 