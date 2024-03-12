package designmode.abstractfactory.example.factory;

public abstract class Factory {
    /**
     * 获取抽象工厂
     * @param classname 具体工厂的类名（利用反射动态加载类）
     * @return 返回抽象工厂的引用
     */
    public static Factory getFactory(String classname){
        Factory factory = null;
        try{
            factory = (Factory) Class.forName(classname).newInstance();

        } catch (ClassNotFoundException e){
            System.err.println("没有找到 "+classname+" 类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
