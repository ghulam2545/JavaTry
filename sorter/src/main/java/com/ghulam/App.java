package com.ghulam;

import java.util.Comparator;

public class App {
    public static void main( String[] args ) {
        String[] original_names = {"Xamarin", "Bloch", "Malik", "George", "James"};
        Swapper my_swapper = (idx_1, idx_2) -> {
            final var temp = original_names[idx_1];
            original_names[idx_1] = original_names[idx_2];
            original_names[idx_2] = temp;
        };

        Comparator<String> my_comparator = String::compareTo;

        BubbleSort<String> bs = new BubbleSort<>();
        bs.setSwapper(my_swapper);
        bs.setComparator(my_comparator);

        var names = new Sortable<String>() {
            @Override
            public String get(int idx) {
                return original_names[idx];
            }

            @Override
            public int size() {
                return original_names.length;
            }
        };
        bs.sort(names);
        for(var e:original_names) System.out.println(e);
    }
}
