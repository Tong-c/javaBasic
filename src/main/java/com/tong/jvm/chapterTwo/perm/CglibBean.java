package com.tong.jvm.chapterTwo.perm;

import com.tong.jvm.chapterTwo.perm.BeanGeneratorObj;
import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;
import net.sf.cglib.core.NamingPolicy;
import net.sf.cglib.core.Predicate;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CglibBean {
    /** 
     * ʵ��Object 
     */  
    public Object object = null;  
  
    /** 
     * ����map 
     */  
    public BeanMap beanMap = null;  
  
    public CglibBean() {  
        super();  
    }  
  
    @SuppressWarnings("unchecked")  
    public CglibBean(Map propertyMap) {  
        this.object = generateBean(propertyMap);  
        this.beanMap = BeanMap.create(this.object);  
    }  
      
    public CglibBean(String className,Map propertyMap) {  
        this.object = generateBean(className,propertyMap);  
        this.beanMap = BeanMap.create(this.object);  
    }  
  
    /** 
     * ��bean���Ը�ֵ 
     *  
     * @param property 
     *            ������ 
     * @param value 
     *            ֵ 
     */  
    public void setValue(String property, Object value) {  
        beanMap.put(property, value);  
    }  
  
    /** 
     * ͨ���������õ�����ֵ 
     *  
     * @param property 
     *            ������ 
     * @return ֵ 
     */  
    public Object getValue(String property) {  
        return beanMap.get(property);  
    }  
  
    /** 
     * �õ���ʵ��bean���� 
     *  
     * @return 
     */  
    public Object getObject() {  
        return this.object;  
    }  
  
    private Object generateBean(Map propertyMap) {  
        BeanGenerator generator = new BeanGenerator();  
        Set keySet = propertyMap.keySet();  
        for (Iterator i = keySet.iterator(); i.hasNext();) {  
            String key = (String) i.next();  
            generator.addProperty(key, (Class) propertyMap.get(key));  
        }  
        return generator.create();  
    }  
      
    private Object generateBean(final String className,Map propertyMap) {  
        BeanGeneratorObj generator = new BeanGeneratorObj();
        generator.setUseCache(false);
        generator.setNamingPolicy(new NamingPolicy() {  
            @Override  
            public String getClassName(String prefix, String source, Object key, Predicate names) {  
                return className;  
            }  
        });  
       
        Set keySet = propertyMap.keySet();  
        for (Iterator i = keySet.iterator(); i.hasNext();) {  
            String key = (String) i.next();  
            generator.addProperty(key, (Class) propertyMap.get(key));  
        }  
        return generator.create();  
    }  
}
