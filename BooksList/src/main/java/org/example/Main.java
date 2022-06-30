package org.example;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
public class Main {

        public static void main(String[] args) {

            // StreamAPI'ler functional programingden sonra ortaya çıkan işimizi baya kolaylaştıran yapılar

            ArrayList<Integer> list = new ArrayList<>();
            list.add(15);
            list.add(23);
            list.add(45);
            list.add(17);
            list.add(90);
            list.add(90);
            list.add(90);

            System.out.println("ForEach");
            //ForEach
            list.stream().forEach(i->System.out.println(i));

            System.out.println("Filter");
            //Filter (60 dan büyük olanları yazdır.)
            list.stream().filter(num -> num >60).forEach(num ->System.out.println(num));

            System.out.println("Distance");
            //Distance (tekrar eden sayıları yazmaz.)
            list.stream().distinct().forEach(i->System.out.println(i));

            System.out.println("Sorted");
            //Sorted (sıralama yapar) (reverseOrder() unutma lazım olcak)
            list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

            System.out.println("Limit");
            //Limit (Belirli sayıda eleman alma fonksiyonu)
            list.stream().limit(5).forEach(i->System.out.println(i));

            System.out.println("Skip");
            //Skip (Belir sayıda elemanı atlar)
            list.stream().skip(3).limit(5).distinct().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));

            System.out.println("Count");
            //Count (Eleman sayısını söyler)
            long c = list.stream().skip(1).limit(5).count();
            System.out.println(c);

            System.out.println("AnyMatch");
            //AnyMatch (Eşleşen koşul varsa ture yoksa false döndürür)
            boolean control = list.stream().anyMatch(i -> i < 10);
            System.out.println(control);

            System.out.println("AllMatch");
            //allMatch (Bütün koşular eşleşiyorsa ture yoksa false döndürür)
            boolean control2 = list.stream().allMatch(i -> i  < 100);
            System.out.println(control2);

            System.out.println("NoneMatch");
            //noneMatch (Eşleşmeyen koşul varsa ture yoksa false döndürür)
            boolean control3 = list.stream().noneMatch(i -> i < 10);
            System.out.println(control3);

            System.out.println("Map");
            // map (liste içindeki elemanlar üzerinde işlemler yapmamızı sağlıyor)
            list.stream().map(i->i*2).forEach(i -> System.out.println(i));


        }

    }