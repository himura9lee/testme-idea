package com.example.services.impl;

import com.example.foes.Fear;
import com.example.foes.Ice;
import com.example.warriers.FooFighter;
import com.example.foes.Fire;

import java.util.*;

public class Foo{

    private List<FooFighter> fooFighter;

    public List<Fire> fight(List<Fire> fires, Set<Fire> flames, Map<String, Ice> icebergs, Collection<String> strings,Collection<List<String>> collOfLists, Queue<List<Fear>> mindTheGap) {
        System.out.println("" + fires.get(0) + flames.iterator().next() + icebergs.get("") + strings.iterator().next() + collOfLists.iterator().next().iterator().next() +mindTheGap.poll());
        return fires;
    }
}