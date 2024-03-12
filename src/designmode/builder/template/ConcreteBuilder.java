package designmode.builder.template;

/**
 * 具体生成器：ConcreteBuilder
 * 具体实现了生成器Builder所声明的功能
 */
class ConcreteBuilder extends Builder{
    /**
     * 具体构造器可能需要借助StringBuffer,TempFile,数组，链表等暂存构造步骤中的数据
     */
    private StringBuffer buffer;
    public ConcreteBuilder(){
        buffer = new StringBuffer();
    }

    @Override
    void buildPart1(String attr) {
        //concrete build steps
        buffer.append(attr).append("\n");
    }

    @Override
    void buildPart2(String attr) {
        //concrete build steps
        buffer.append(attr).append("\n");
    }

    @Override
    void buildPart3(String attr) {
        //concrete build steps
        buffer.append(attr).append("\n");
    }

    /**
     * 获取经过一系列步骤之后的构造结果
     * @return 构造结果
     */
    public String getResult(){
        return buffer.toString();
    }
}
