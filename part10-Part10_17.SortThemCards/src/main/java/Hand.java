/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;



public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void sort() {
        Collections.sort(this.hand, (card1, card2) -> card1.compareTo(card2));
    }

    public int compareTo(Hand comparedHand) {
        int thisValue = this.hand.stream()
                .mapToInt(card -> card.getValue())
                .sum();
        int comparedValue = comparedHand.hand.stream()
                .mapToInt(card -> card.getValue())
                .sum();
        return thisValue - comparedValue;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new Card.BySuitInValueOrder());
    }


}
