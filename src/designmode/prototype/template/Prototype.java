package designmode.prototype.template;

/**
 * 原型接口：规定了使用原型模式的类的操作
 * 因为要保证具体类是可拷贝的，因此需要拓展java.lang.Cloneable接口
 */
interface Prototype extends Cloneable{
     /**
      * 注意：原型模式的拷贝需要区分深拷贝和浅拷贝
      */
     Prototype createClone();
}
