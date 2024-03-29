'use strict';

/**
 * Definition for singly-linked list.
 *
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 *
 * @param { ListNode } node
 * @return { void } Do not return anything, modify node in-place instead.
 */
function deleteNode(node) {
    const temp = node.next;

    node.val = temp.val;
    node.next = temp.next;
}
