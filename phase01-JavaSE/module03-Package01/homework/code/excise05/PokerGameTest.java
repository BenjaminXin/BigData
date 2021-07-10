package com.lagou.phase01.module03.homework.excise05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PokerGameTest {

    public static void main(String[] args) {

        // 1. 生成扑克牌
        PokerGame pokerGame = new PokerGame();
        List<PokerCard> pokerCards = pokerGame.getPokerCards();
        //  打印当前扑克牌
//        pokerGame.printPokerCards(pokerCards);

        System.out.println("----------");
        // 2. 洗牌
        pokerGame.shuffle();
        //  打印洗牌后的扑克牌
        System.out.println("洗牌完成：");
        pokerGame.printPokerCards(pokerCards);

//        System.out.println("----------");
        // 3. 玩家拿牌
        List<PokerCard> player1 = new LinkedList<>();
        List<PokerCard> player2 = new LinkedList<>();
        List<PokerCard> player3 = new LinkedList<>();
        List<PokerCard> reminds = new LinkedList<>();

        ArrayList<List<PokerCard>> pokerCardsGroup = pokerGame.toDeal();
        player1.addAll(pokerCardsGroup.get(0));
        player2.addAll(pokerCardsGroup.get(1));
        player3.addAll(pokerCardsGroup.get(2));
        reminds.addAll(pokerCardsGroup.get(3));

        System.out.println("----------");
        // 4. 排序, 打印
        pokerGame.sort(player1);
        pokerGame.sort(player2);
        pokerGame.sort(player3);
        pokerGame.sort(reminds);

        System.out.println("排序后：");

        System.out.println("玩家 1 的牌：" + player1.toString());
        System.out.println("玩家 2 的牌：" + player2.toString());
        System.out.println("玩家 3 的牌：" + player3.toString());
        System.out.println("底牌：" + reminds.toString());


    }
}
