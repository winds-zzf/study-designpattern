package designmode.builder.template;

/**
 * 抽象生成器：Builder
 * 定义了生成器所能完成的功能
 */
abstract class Builder {
    abstract void buildPart1(String attr);
    abstract void buildPart2(String attr);
    abstract void buildPart3(String attr);
    //more build parts
}

/** 使用接口实现生成器
interface Builder{
    void buildPart1(String attr);
    void buildPart2(String attr);
    void buildPart3(String attr);
    //more build parts
}
*/
