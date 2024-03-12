package designmode.memento.template;

/**
 * 纪念品角色
 * 将Originator角色的内部信息整合并保存起来（保存在内存或者文件中）
 * 接口类型：
 * 1.宽接口API：使用protected描述，用于获取恢复对象状态信息的所有方法的集合。暴露信息比较多，因此只提供给Originator角色
 * 2.窄接口API：使用public描述，宽接口API的子集。暴露的信息有限,提供给Caretaker这样的类
 */
class Memento {
    /**
     * 使用default域向外部隐藏Memento的构造方法只要是包外的类都无法访问
     */
    Memento(){

    }
}
