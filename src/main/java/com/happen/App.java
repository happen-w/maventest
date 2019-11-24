package com.happen;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a,int b){
        return a + b;
    }


    public int adds(int ... a){
        return redu_add(1, a);
    }

    private int redu_add(int index,int ...a){
        if(a.length<index){
            return 0;
        }
        if(index == a.length){
            return a[index-1];
        }else{
            a[index]=a[index]+a[index-1];
            return redu_add(index+1, a);
        }
    }
}
