package com.yao.leetcode;

/**
 * @author Daniel:)
 *
 * 给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。
 *
 * 从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
 *
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 *
 * 示例 1：
 *
 * 输入："())"
 * 输出：1
 * 示例 2：
 *
 * 输入："((("
 * 输出：3
 * 示例 3：
 *
 * 输入："()"
 * 输出：0
 * 示例 4：
 *
 * 输入："()))(("
 * 输出：4
 */
public class Main921 {

    public int minAddToMakeValid(String S) {
        int unmatchedOpen = 0;
        int unmatchedClose = 0;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                unmatchedOpen++;
            } else if (unmatchedOpen > 0)
                unmatchedOpen--;
            else {
                unmatchedClose++;
            }
        }
        return unmatchedClose + unmatchedOpen;
    }

    public int test(String s) {
        int unmatchedOpen = 0;
        int unmatchedClose = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                unmatchedOpen++;
            } else if (unmatchedOpen > 0) {
                unmatchedOpen--;
            } else {
                unmatchedClose++;
            }
        }
        return unmatchedClose + unmatchedOpen;
    }
}
