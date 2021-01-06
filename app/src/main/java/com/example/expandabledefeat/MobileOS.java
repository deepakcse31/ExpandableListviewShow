package com.example.expandabledefeat;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class MobileOS  extends ExpandableGroup<Phone> {

    public MobileOS(String title, List<Phone> items) {
        super(title, items);
    }
}