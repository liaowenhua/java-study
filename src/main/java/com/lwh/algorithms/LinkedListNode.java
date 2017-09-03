package com.lwh.algorithms;


public class LinkedListNode {
	private LinkedListNode next;
	private Integer val;
	
	public LinkedListNode (Integer val) {
		
		this.val = val;
	}
	
	public LinkedListNode appendTail (Integer val) {
		LinkedListNode node = new LinkedListNode(val);
		LinkedListNode current = this;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		return this;
	}
	
	/**
	 * 删除重复的元素
	 */
	public void deleteDups () {
		LinkedListNode current = this;
		
		while (current != null) {
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (current.val == runner.next.val) {
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
			}
			
			current =  current.next;
		}
	}
	
	/**
	 * 查找倒数第k个结点的值
	 * @param k
	 * @return
	 */
	public int findKFromTail (int k) {
		LinkedListNode node = this;
		//找到顺数第k个
		
		return 0;
	}
	
	public int head () {
		return this.val;
	}
	
	@Override
	public String toString() {
		LinkedListNode node = this;
		String result = "value:";
		while (node != null) {
			result = result + node.val + " ";
			node = node.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(1);
		list
		.appendTail(2)
		.appendTail(3)
		.appendTail(3)
		.appendTail(2);
		System.out.println(list.toString());
		list.deleteDups();
		System.out.println(list.toString());
	}
	
}
