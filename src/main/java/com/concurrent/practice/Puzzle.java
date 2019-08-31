package com.concurrent.practice;

import java.util.Set;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-26 09:13
 * @Version 1.0
 * @Description 表示"搬箱子"之类谜题的抽象类
 */
public interface Puzzle<P, M> {
    P initialPosition();

    boolean isGoal(P position);

    Set<M> legalMoves(P position);

    P move(P position, M move);
}
