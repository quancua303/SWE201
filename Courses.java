/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author ACER
 */
public class Courses implements Comparable<Courses>{
    String code,name;
    int credit;

    public Courses() {
    }

    public Courses(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return (code + " | " + name + " | " + credit +"\n");
    }

    @Override
    public int compareTo(Courses t) {
        int i = credit - t.credit;
        if (i<0) {
            return -1;
        }else if (i>0) {
            return 1;
        }
        return 0;
    }
    
    
}
