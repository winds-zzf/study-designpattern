package designmode.adapter.object_adapter.example1;

class PrintBanner implements Print{
    private Banner banner;  //对象适配器；保持和维护被适配类或接口的引用

    public PrintBanner(Banner banner){
        this.banner = banner;
    }

    /**
     * 适配器将任务委托被被适配对象去执行
     * 当适配器调用printWeak()时，不是由适配器的printWeak()处理，而是将具体的处理委托给被支配对象的showWithParen()
     */

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
