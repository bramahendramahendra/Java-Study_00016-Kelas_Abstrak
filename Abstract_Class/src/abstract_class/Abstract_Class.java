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
public class Abstract_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteClass1 class1 = new ConcreteClass1();
        class1.printOut();
        System.out.println(class1.prefixValue("Mr."));
        System.out.println(class1.gabung());
  
        ConcreteClass2 class2 = new ConcreteClass2();
        class2.printOut();
        System.out.println(class2.prefixValue("Mrs."));
        System.out.println(class2.gabung());
    }
    
}
