package com.liumeng.designpattern.java.others;
public interface Visitor {
    //���ʹ���ʦ����
    public void visit(Engineer engineer);
    //���ʾ�������
    public void visit(Manager leader);
}

//CEO�����ߣ�ֻ��עҵ��