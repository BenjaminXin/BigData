package com.lagou.phase01.module03.homework.excise05;

import java.util.*;

public class PokerGame {

    private int numPlayer;
    private static List<PokerCard> pokerCards = new LinkedList<>();

    public PokerGame() {
        this.numPlayer = 3;
        this.setPokerCards();
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public List<PokerCard> getPokerCards() {
        return pokerCards;
    }

    // 生成一副 54 张的扑克牌
    public void setPokerCards() {
        String[] colors = {"heart", "diamond", "spade", "club"};
        for (String color : colors) {
            for (int i = 1; i < 14; i++) {
                if (i == 1) {
                    pokerCards.add(new PokerCard(color, "A", i+20));
                } else if (i == 2) {
                    pokerCards.add(new PokerCard(color, "2", i+20));
                } else if (i == 13) {
                    pokerCards.add(new PokerCard(color, "king", i));
                } else if (i == 12) {
                    pokerCards.add(new PokerCard(color, "queen", i));
                } else if (i == 11) {
                    pokerCards.add(new PokerCard(color, "jack", i));
                } else {
                    pokerCards.add(new PokerCard(color, Integer.toString(i), i));
                }
            }
        }
        pokerCards.add(new PokerCard("joker", "red joker", 100));
        pokerCards.add(new PokerCard("joker", "black joker", 101));
    }

    // 洗牌
    public void shuffle() {
        Collections.shuffle(pokerCards);
    }

    // 打印扑克牌
    public void printPokerCards(List<PokerCard> pokerCards) {
        for (PokerCard pokerCard : pokerCards) {
            System.out.println(pokerCard);
        }
    }

    // 发牌
    public ArrayList<List<PokerCard>> toDeal() {
        ArrayList<List<PokerCard>> pokerCardsGroup = new ArrayList<List<PokerCard>>(4);
        List<PokerCard> player1 = new LinkedList<>();
        List<PokerCard> player2 = new LinkedList<>();
        List<PokerCard> player3 = new LinkedList<>();
        List<PokerCard> remainds = new LinkedList<>();
        for (int i = 0; i < 54; i+=3) {
            player1.add(pokerCards.get(i));
            player2.add(pokerCards.get(i+1));
            player3.add(pokerCards.get(i+2));
        }
        remainds.add(pokerCards.get(51));
        remainds.add(pokerCards.get(51));
        remainds.add(pokerCards.get(53));

        pokerCardsGroup.add(player1);
        pokerCardsGroup.add(player2);
        pokerCardsGroup.add(player3);
        pokerCardsGroup.add(remainds);

        return pokerCardsGroup;
    }

    // 自定义比较器
    Comparator<PokerCard> comparator = new Comparator<PokerCard>() {
        @Override
        public int compare(PokerCard o1, PokerCard o2) {
            return o2.getNumber() - o1.getNumber();
        }
    };

    // 排序
    public void sort(List<PokerCard> pokerCards) {
        pokerCards.sort(comparator);
    }


}
