package designmode.memento.template;

/**
 * 生成者角色
 * 职责：生成和恢复快照
 * 功能：生成着角色会在指定的时间生成Memento角色来保存自己的信息
 * 注意：
 *  Caretaker和Originator的角色职责是不一样的，Originator负责生成和恢复快照，因此他需要知道更多的Memento信息，所以使用了宽接口API
 *  而Caretaker是负责管理快照，他的对象是一个个快照，并不需要知道太多Memento的内部信息，所以使用窄接口API
 */
class Originator {

}
