package com.ryx.others.dataStructure;

import java.util.Objects;

public class TreeNode {

    private Object mData;   //存储的数据
    private int mParent;   //父亲节点的下标

    public TreeNode(Object data, int parent) {
        mData = data;
        mParent = parent;
    }

    public Object getData() {
        return mData;
    }

    public void setData(Object data) {
        mData = data;
    }

    public int getParent() {
        return mParent;
    }

    public void setParent(int parent) {
        mParent = parent;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "mData=" + mData +
                ", mParent=" + mParent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return mParent == treeNode.mParent &&
                Objects.equals(mData, treeNode.mData);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mData, mParent);
    }

    public static void main(String[] args) {
        TreeNode[] arrayTree = new TreeNode[10];
        System.out.println(arrayTree.toString());
    }
}