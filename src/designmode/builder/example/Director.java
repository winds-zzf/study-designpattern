package designmode.builder.example;

class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 构建文档:描述了构建文档的流程步骤
     */
    public void construct(){
        builder.makeTile("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{"早上好。","下午好。"});
        builder.makeString("晚上");
        builder.makeItems(new String[]{"晚上好。","晚安。","再见。"});
        builder.close();
    }
}
