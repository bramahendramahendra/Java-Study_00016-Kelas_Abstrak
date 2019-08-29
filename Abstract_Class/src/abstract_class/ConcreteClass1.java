/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected String getValue() {
        return "Tatank";  
    }
    @Override
    public String gabung() {
        String a="Mr.tatank hoby meloncat";
        return a;
    }
    @Override
    public String prefixValue(String prefix) {
        return prefix + "Tatank";
    }
}
