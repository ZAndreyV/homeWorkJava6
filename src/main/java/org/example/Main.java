package org.example;


import task1.Notebooks;
import java.util.Map.Entry;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebooks notebooks = new Notebooks(2, 32, "Windows",
                "Черный", "Intel Atom Z3735F", "Intel HD Graphics", "Ноутбук Irbis NB77", 15000, 13.3);
        Notebooks notebooks1 = new Notebooks(4, 256, "Linux", "Синий", "Intel Core i3-10110U",
                 "Intel UHD Graphics", "ASUS VivoBook X415FA-EB014", 35000, 14);
        Notebooks notebooks2 = new Notebooks(8, 256, "Windows",
                "Серый", "Intel Core i3-1115G4", "Intel UHD Graphics", "HUAWEI MateBook D 15 BOD-WDI9",
                45000, 15.6);
        Notebooks notebooks3 = new Notebooks(16, 512, "macOS",
                "Черный", "Intel Core i7-1255U", "Intel Iris Xe Graphics", "MSI Modern 15 B12M-208RU",
                62999, 15.6);
        Notebooks notebooks4 = new Notebooks(2, 32, "Windows",
                "Черный", "Intel Atom Z3735F", "Intel HD Graphics", "Ноутбук Irbis NB77", 15000, 13.3);

        Set<Notebooks> notebooksSet = new HashSet<>();
        notebooksSet.add(notebooks);
        notebooksSet.add(notebooks1);
        notebooksSet.add(notebooks2);
        notebooksSet.add(notebooks3);
        notebooksSet.add(notebooks4);

        System.out.println(notebooksSet);
        System.out.println(notebooks.equals(notebooks4));

        HashSet <Notebooks> res = new HashSet<>();
        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
            if(n==1){
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if(n==2){
                System.out.println("Введите минимальный объем ЖД" );
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if(n==3){
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if(n==4){
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                for (Notebooks lap : notebooksSet) {
                    if (lap.getRam() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("HDD")){
                for (Notebooks lap : notebooksSet) {
                    if (lap.getVolumeHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("OS")){
                for (Notebooks lap : notebooksSet) {
                    if (lap.getOperatingSystem().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("color")){
                for (Notebooks lap : notebooksSet) {
                    if (lap.getColour().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        for (Notebooks lap : res) {
            System.out.println(lap.toString());
            System.out.println();
        }


    }
}