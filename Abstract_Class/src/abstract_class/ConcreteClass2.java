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
public class ConcreteClass2 extends AbstractClass {
    @Override
    public String getValue() {
        return "kelly";
    }
    @Override
    public String gabung() {
        return "Mrs.kels hobi melet";
    }
    @Override
    public String prefixValue(String prefix) {
        return prefix + "kelly";
    }
}
