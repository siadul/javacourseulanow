import java.util.*;

public class Zajecia10 {
    public static void main(String[] args) {
        // kontenery II
//        lists2();
//        ex1();
//        sets1();
//        ex2();
        // iterator, concurent exception
        // foreach
//        ex3();
//        arraysAsList();
//        ex4();
        // Arrays.asList, Array.indexOf, Array.sort, copyOf
//        arraysUtils();

        // Map
//        maps();

        // łańcuchy znaków
        strings();
    }

    private static void strings() {
        // substring
        String s1 = "tekst abc abc abc Jakiś dłuGI tekst";
        System.out.println(s1.substring(6, 11));
        System.out.println(s1.substring(6));
        System.out.println(s1.charAt(6));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(s1.indexOf("tekst"));
        System.out.println(s1.lastIndexOf("tekst"));
        System.out.println(s1.startsWith("tekst"));
        // Uwaga!
        // Stringi porównujemy za pomocą metody equals!!!
        System.out.println(s1.equals("tekst Jakiś dłuGI tekst"));
        System.out.println(Arrays.toString(s1.toCharArray())); // Ważne
        System.out.println(s1.replace("tekst", "test")); // Ważne
        // Uwaga!
        // Stringi są niemutowalne (Immutable) tzn. metody operujące na nich zawsze
        // zwracają nowy ciąg znaków

        System.out.println(s1.replaceAll("abc", "xyz")); // Ważne
        System.out.println(s1.replaceFirst("abc", "xyz")); // Ważne
        System.out.println(s1.length()); // Ważne


    }

    private static void maps() {
        //     Collection                  Map
        // List          Set               - HashMap
        // - LinkedList  - HashSet         - LinkedHashMap
        // - ArrayList   - LinkedHashSet   - TreeMap
        //               - TreeSet

        Map<String, String> map1 = new HashMap<>();
        map1.put("word1", "definition of word1");
        map1.put("word2", "definition of word2");
        map1.put("word3", "definition of word3");
        map1.put("word0", "definition of word0");
        System.out.println(map1);
        System.out.println(map1.keySet()); // nie mamy zachowanej kolejności
        // jeżeli nam na tym zależy musimy przejść na LinkedHashMap

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("word1", "definition of word1");
        map2.put("word2", "definition of word2");
        map2.put("word3", "definition of word3");
        map2.put("word0", "definition of word0");
        System.out.println(map2);
        System.out.println(map2.keySet()); // tutaj zachowaną kolejność

        Map<String, String> map3 = new TreeMap<>();
        map3.put("word1", "definition of word1");
        map3.put("word2", "definition of word2");
        map3.put("word3", "definition of word3");
        map3.put("word0", "definition of word0");
        System.out.println(map3);
        System.out.println(map3.keySet()); // tutaj zachowaną kolejność
        String s = map3.get("word3");
        System.out.println(s);
//        map3.clear();
        map3.remove("word2");
        System.out.println(map3.size());
        System.out.println(map3.containsKey("word0"));
        System.out.println(map3.containsValue("definition of word2"));
        System.out.println(map3.values());

    }

    private static void arraysUtils() {
        // Arrays.asList, Array.indexOf, Array.sort525, copyOf
        int[] arr = {7, 2, 9, 5, 2, 5};
        System.out.println(Arrays.toString(arr));
        int c = Arrays.binarySearch(arr, 5);
        System.out.println("before sorting: " + c);
        Arrays.sort(arr);
        c = Arrays.binarySearch(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("after sorting: " + c);
        // Uwaga!!! przed użyciem binarySearch musimy posortować elementy

        // Jeżeli ważna jest kolejność elementów w tablicy musimy skorzystać z
        // kontenerów albo pętli.
        arr = new int[]{7, 2, 9, 5, 2, 5};
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 3, 5, 66);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = new Integer[3];
        arr2[0] = 3;
        arr2[1] = 12;
        arr2[2] = 333;

//        Arrays.sort(arr2, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2, (x, y) -> x > y ? 1: (x.equals(y) ? 0 : -1));
        System.out.println(Arrays.toString(arr2));

        int arr3[] = {3, 2, 1};
        int arr4[] = {3, 2, 1};
        int arr5[] = {3, 2, 1};
        int arr6[] = {3, 2, 1};
        arr3 = arr4; // UWAGA! przypisanie referencji, arr3 wskazuje na to samo co
        // arr4. Nie jest to kopiowanie tablic.
        arr4[1] = 1000;
        arr3[0] = 100;
        // porównywanie tablic
        System.out.println(arr3 == arr4); // true, porównywanie referencji!
        System.out.println(arr5 == arr6); // false, porównywanie referencji!
        System.out.println(arr5.equals(arr6)); // false, porównywanie referencji
        System.out.println(Arrays.equals(arr5, arr6)); // porównywanie zawartości
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
//        Arrays.equals();
        // WNIOSEK!
        // tablice porównujemy przy pomocy Arrays.equals

        // kopiowanie tablic
        int arr10[] = {5, 2, 9, 9};
        int arr11[];
//        arr11 = arr10; // Uwaga! w ten sposób nie kopiujemy tablic!
        arr11 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        arr11 = Arrays.copyOf(arr10, 20); // copyOf tworzy nową tablicę
        System.out.println(Arrays.toString(arr11));


        arr10[1] = 68;
        arr11[3] = 33;
        System.out.println(Arrays.toString(arr10));
        System.out.println(Arrays.toString(arr11));

        // wyszukiwanie bez sortowania - za pomocą kolekcji
        int[] arr12 = {3, 6, 1, 3};
        List list = Arrays.asList(arr12);
        System.out.println(list.indexOf(1));
        System.out.println(list);
        // uwaga! asList nie działa do końca tak jak byśmy się spodziewali dla
        // tablicy typów podstawowych, musimy przejść na typy obiektowe
        Integer[] arr12b = {3, 6, 1, 3};
        list = Arrays.asList(arr12b);
        System.out.println(list.indexOf(1)); // teraz działa
        System.out.println(list);

        // no dobrze, a jak przekształcić tablicę intów na tablicę obiektów Integer
        arr12b = new Integer[arr12.length];
        for (int i=0; i<arr12.length; i++) {
//            arr12b[i] = new Integer(arr12[i]); // I sposób
//            arr12b[i] = Integer.valueOf(arr12[i]); // II sposób
            arr12b[i] = arr12[i]; // III sposób
        }
        list = Arrays.asList(arr12b);
        System.out.println(list.indexOf(1)); // teraz działa
        System.out.println(list);

        // szybszy sposób na zamianę tablicy typów podstawowych
        arr12b = Arrays.stream(arr12).boxed().toArray(Integer[]::new);








//        arr11 = Arrays.copyOf(arr10, arr.length);
//        arr10[1] = 22;
//        System.out.println(Arrays.toString(arr10));
//        System.out.println(Arrays.toString(arr11));
//
//
//        arr2 = new Integer[3];
//        arr2[0] = 345;
//        arr2[1] = 12;
//        arr2[2] = 333;
//        List list = Arrays.asList(arr2);
////        c = new ArrayList<Integer>(Arrays.<Integer>asList(arr)).indexOf(5);
//        System.out.println(list.indexOf(12));
//        System.out.println(list);

    }

    private static void arraysAsList() {
        LinkedList<Character> ll1 = new LinkedList<>();
        ll1.addFirst('a');
        ll1.addFirst('b');
        ll1.addFirst('c');
        ll1.addFirst('d');
        ll1.addFirst('e');
        ll1.removeFirst();
        System.out.println(ll1);
        for(char c: ll1) {
//            ll1.removeFirst(); // ConcurrentModificationException
            System.out.println(c);
        }

        // przeglądamy liste za pomocą iteratora
        Iterator<Character> it = ll1.iterator();
        while(it.hasNext()) {
//            ll1.removeFirst(); // ConcurrentModificationException
            char c = it.next();
            System.out.println(c);
        }
        // Uwaga!!!
        // Nie powinniśmy modyfikować kontenera w trakcie iterowania po nim.
        // Najczęściej skończy się to błędem ConcurrentModificationException.

        // Arrays
        int[] arr = {4, 5, 1};
        System.out.println(
                Arrays.toString(arr)
//            Arrays.deepToString(arr) dla tablic wielowymiarowych
        );
        List<Integer> l2Unmodifiable = Arrays.asList(8, 11, 23);
        System.out.println(l2Unmodifiable);

//        l2Unmodifiable.add(4); Uwaga! UnsupportedOperationException - asList zwraca
        // niemodyfikowalną listę, musze utworzyć listę modyfkowalną np. w poniższy sposób
//        l3Modifiable.addAll(l2Unmodifiable); // lepiej skorzystać z konstruktora

        List<Integer> l3Modifiable = new LinkedList<>(l2Unmodifiable);
        l3Modifiable.add(65);
        System.out.println(l3Modifiable);
    }

    private static void ex4() {
        // Zadanie
        // Stworzyć listę 5 elementów nie używając metody add.
        // Następnie dodać element do tej listy.
        // Wskazówka: użyć Arrays.asList()
        List<Integer> l1 = Arrays.asList(4, 3, 4, 5, 2);
        List<Integer> l2 = new LinkedList<>(l1);
        l2.add(4);
        System.out.println(l2);

    }

    private static void ex3() {
        // Zrobić to samo co w ex1, z tym, że chcemy dodawać słowa na sam początek
        // Wskazówka: Skorzystać z LinkedList
        // Zadanie 1
        // W pętli wczytywać z klawiatury Stringi za pomocą klasy Scanner
        // i dorzucać je do wybranego kontenera.
        // a) jeżeli użytkownik wpisze "exit" kończymy wykonywanie pętli i wyświetlamy:
        // wszystkie wprowadzone przez użytkownika Stringi.
        // b) jeżeli użytkownik wpisze "show long strings" wyświetlamy wszystkie Stringi o
        // długości większej niż 5
        // c) jeżeli użytkownik wpisze "remove" usuwamy z kolekcji ostatnio dodany String
        // d) *jeżeli użytkownik wpisze "find {string}" wyświetlamy pozycję {string} w kontenerze
        // e) jeżeli użytkownik wpisze "remove all" usuwamy wszystko z kolekcji
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> inp = new LinkedList<>();
        while(true) {
            String s = scanner.nextLine();
            switch(s) {
                case "show":
                    System.out.println(inp);
                    break;
                case "exit":
                    System.out.println(inp);
                    System.exit(0);
                    break;
                case "show long strings":
                    for(String el: inp) {
                        if(el.length() > 5) {
                            System.out.println(el);
                        }
                    }
                    break;
                case "remove":
                    if(inp.size() > 0) {
                        inp.remove(inp.size() - 1);
                    }
                    break;
                case "remove all":
                    inp.clear();
                    break;
                default:
                    // s.charAt(0) = 'f' && ...; // I sp. bez użycia substring
                    if(s.length() > 5 && "find".equals(s.substring(0, 4))) {
                        String search = s.substring(5);
                        System.out.println(inp.indexOf(search));
                    } else {
                        inp.addFirst(s);
                    }
            }
        }
    }

    private static void ex2() {
        // Zrobić to samo co w ex1, z tym, że chcemy mieć zbiór unikalnych Stringów,
        // tzn. jeżeli użytkownik wpisze dwukrotnie słowo "ziemia" to po wypisaniu
        // zawartości kontenera powinna się wyświetlać tylko raz.
        // Wskazówka: Zmienić typ kontenera z ArrayList na np. HashSet
        // Zadanie 1
        // W pętli wczytywać z klawiatury Stringi za pomocą klasy Scanner
        // i dorzucać je do wybranego kontenera.
        // a) jeżeli użytkownik wpisze "exit" kończymy wykonywanie pętli i wyświetlamy:
        // wszystkie wprowadzone przez użytkownika Stringi.
        // b) jeżeli użytkownik wpisze "show long strings" wyświetlamy wszystkie Stringi o
        // długości większej niż 5
        // c) jeżeli użytkownik wpisze "remove" usuwamy z kolekcji ostatnio dodany String
        // d) *jeżeli użytkownik wpisze "find {string}" wyświetlamy pozycję {string} w kontenerze
        // e) jeżeli użytkownik wpisze "remove all" usuwamy wszystko z kolekcji
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> inp = new LinkedHashSet<>(); // UWAGA! HashSet nie zachowuje kolejności dodawania elementów
        while(true) {
            String s = scanner.nextLine();
            switch(s) {
                case "show":
                    System.out.println(inp);
                    break;
                case "exit":
                    System.out.println(inp);
                    System.exit(0);
                    break;
                case "show long strings":
                    for(String el: inp) {
                        if(el.length() > 5) {
                            System.out.println(el);
                        }
                    }
                    break;
                case "remove":
                    if(inp.size() > 0) {
                        Iterator iterator = inp.iterator();
                        while(iterator.hasNext()) {
                            iterator.next();
                            if(!iterator.hasNext()) {
                                iterator.remove();
                            }
                        }

//                        int i = 0;
//                        for (String el: inp) {
//                            if(i == inp.size() - 1) {
//                                inp.remove(el);
//                            }
//                            i++;
//                        }
                    }
                    break;
                case "remove all":
                    inp.clear();
                    break;
                default:
                    // s.charAt(0) = 'f' && ...; // I sp. bez użycia substring
                    if(s.length() > 5 && "find".equals(s.substring(0, 4))) {
//                        String search = s.substring(5);
//                        System.out.println(inp.indexOf(search));
                    } else {
                        inp.add(s);
                    }
            }
        }

    }

    private static void sets1() {
        // kiedy chcemy mieć unikalność elementów w kolekcji...
        Set<Integer> set1 = new HashSet<Integer>(); // szybki dostęp, nie musi być zachowana kolejność dodawania elementów
        Set<Integer> set2 = new LinkedHashSet<Integer>(); // zachowana kolejność dodawania elementów
        Set<Integer> set3 = new TreeSet<Integer>(); // elementy są przechowywane w określonym porządku np. posortowane
        // dzięki temu operacje wyszukiwania są wykonywane bardzo szybko
        set1.add(7);
        set1.add(4);
        set1.add(10);
        set1.add(4);
        System.out.println(set1);

        set2.add(7);
        set2.add(4);
        set2.add(10);
        set2.add(4);
        System.out.println(set2);

        set3.add(7);
        set3.add(4);
        set3.add(10);
        set3.add(4);
        System.out.println(set3);
    }

    private static void ex1() {
        // Zadanie 1
        // W pętli wczytywać z klawiatury Stringi za pomocą klasy Scanner
        // i dorzucać je do wybranego kontenera.
        // a) jeżeli użytkownik wpisze "exit" kończymy wykonywanie pętli i wyświetlamy:
        // wszystkie wprowadzone przez użytkownika Stringi.
        // b) jeżeli użytkownik wpisze "show long strings" wyświetlamy wszystkie Stringi o
        // długości większej niż 5
        // c) jeżeli użytkownik wpisze "remove" usuwamy z kolekcji ostatnio dodany String
        // d) *jeżeli użytkownik wpisze "find {string}" wyświetlamy pozycję {string} w kontenerze
        // e) jeżeli użytkownik wpisze "remove all" usuwamy wszystko z kolekcji
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inp = new ArrayList<>();
        while(true) {
            String s = scanner.nextLine();
            switch(s) {
                case "show":
                    System.out.println(inp);
                    break;
                case "exit":
                    System.out.println(inp);
                    System.exit(0);
                    break;
                case "show long strings":
                    for(String el: inp) {
                        if(el.length() > 5) {
                            System.out.println(el);
                        }
                    }
                    break;
                case "remove":
                    if(inp.size() > 0) {
                        inp.remove(inp.size() - 1);
                    }
                    break;
                case "remove all":
                    inp.clear();
                    break;
                default:
                    // s.charAt(0) = 'f' && ...; // I sp. bez użycia substring
                    if(s.length() > 5 && "find".equals(s.substring(0, 4))) {
                        String search = s.substring(5);
                        System.out.println(inp.indexOf(search));
                    } else {
                        inp.add(s);
                    }
            }
        }

    }

    private static void lists2() {
//        ArrayList a1 = new ArrayList();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(4); // mechanizm opakowujący
        a1.add(5);
        a1.add(6);
        System.out.println(a1);
        System.out.println(a1.get(1));
        int a = a1.get(1);
        System.out.println(a);
        a1.clear();
        a1.add(7); // mechanizm opakowujący
        a1.add(8);
        a1.add(9);
        a1.remove(0);
        System.out.println(a1);
        a1.add(1, 10);
        System.out.println(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(11);
        a2.add(12);
        a2.add(13);
        a1.addAll(a2);
        System.out.println(a1);
        a1.addAll(0, a2);
        System.out.println(a1);
        a1.removeAll(a2);
        System.out.println(a1);
        System.out.println(
                a1.contains(13)
        );
        System.out.println(
                a1.contains(8)
        );
        System.out.println(
                a1.indexOf(13) // -1, oznacza to, że element nie istnieje w kontenerze
        );
        System.out.println(
                a1.indexOf(8)
        );

        a1.sort(null);
        System.out.println(a1);
        a1.sort(Collections.reverseOrder());
        System.out.println(a1);

        System.out.println(
                a1.isEmpty()
        );

        System.out.println(
                a1.size()
        );

        a1.add(10);
        System.out.println(a1);
        System.out.println(
                a1.indexOf(10)
        );
        System.out.println(
                a1.lastIndexOf(10) // wyszukujemy od końca
        );
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(8);
        a3.add(9);
        a3.add(10);
        a3.add(11);
        System.out.println(a3);
        a1.retainAll(a3);
        System.out.println(a1);

        a1.set(3, 11);
        System.out.println(a1);
        List<Integer> a4 = a1.subList(1,3); // uwaga, przedział prawostronnie otwarty tzn.
        // nie bierzemy elementu o indeksie 3
        System.out.println(a4);
        Object[] arr4 = a4.toArray();
        System.out.println(
                Arrays.toString(arr4)
        );
        System.out.println(arr4[1]);

        System.out.println(a1);
        System.out.println(a3);
        System.out.println(
            a1.containsAll(a3)
        );


    }
}
