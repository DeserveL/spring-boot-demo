/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author DeserveL
 * @date 2017/7/24 13:27
 * @since 1.0.0
 */
public class test {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("ar1");
        ar.add("ar2");
        ar.add("ar3");
        LinkedList<String> li = new LinkedList<>();
        li.add("li1");
        li.add("li2");
        li.add("li3");
        String[] ss = ar.toArray(new String[ar.size()]);
        IteratorTest<String> stringIteratorTest = new IteratorTest<>(ss);
        for (int i = 0; i < 3; i++) {
//            for (String s : ar) {
//                System.out.println(s);
//            }
//            for (String s : li) {
//                System.out.println(s);
//            }
            for (String s : ss) {
                System.out.println(s);
            }
        }
    }
}

class IteratorTest<T> implements Iterator {

    private T[] array = null;

    private int index = 0;

    public IteratorTest(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
