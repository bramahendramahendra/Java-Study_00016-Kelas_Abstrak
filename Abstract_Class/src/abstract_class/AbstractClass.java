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
public abstract class AbstractClass {
    abstract protected String getValue();
    abstract protected String prefixValue(String prefix);
    abstract protected String gabung();
    public void printOut() {
        System.out.println(this.getValue());
    }
}
