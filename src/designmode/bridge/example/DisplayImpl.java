package designmode.bridge.example;

/**
 * 实现结构层次的顶层抽象DisplayImpl
 * DisplayImpl
 * |___StringDisplayImpl(使用字符串的形式实现)
 * |___CharDisplayImpl(使用字符的形式实现)
 * 拥有了顶层的抽象就能掌握他的各个实现了
 * 注意：DisplayImpl实现了Display的各个方法，这是Display的接口API就转换成了DisplayImpl的接口API
 * 也就是说实现功能层次的顶层类是功能层次结构顶层类的实现
 */
abstract class DisplayImpl {
    abstract void rawOpen();
    abstract void rawPrint();
    abstract void rawClose();
}
