package designmode.builder.template;

/**
 * 管理器：Director
 * 1.管理器持有生成器的引用以便于将具体的构造步骤委托给具体构造器
 * 2.管理器负责控制和组织相应步骤已完成相应的构造过程
 * 3.管理器可以有不同的construct()，对应不同的构建工序
 */
class Director {
    /**
     * 构造器持有和维护生成器的引用（类似于老板拥有员工，然后指示员工去做一些事情）
     */
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 构建目标:完成一次构建任务所需要生成器执行的步骤序列
     */
    public void construct(){
        System.out.println("Start the construct procedure");
        //construct procedure
        builder.buildPart1("procedure1");
        builder.buildPart2("procedure2");
        builder.buildPart3("procedure3");
        //more procedures;
        System.out.println("End the construct procedure");
    }

    //more constructs
}
