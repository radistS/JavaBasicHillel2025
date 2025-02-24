package lec_10.ex;

/*
В N этажного жилом доме M квартир.
Определить, на каком этаже и в каком подъезде
находится квартира с заданным номером.
 4 квартиры на этаже
 */
// 9 этажей 108 квартир
public class FloorFlatCalculate {
    private static int florNumber = 9;
    private static int florCountFlat = 4;
    private static int flatNumber = 265;

    public static void main(String[] args) {
        int flatPerEntrance = florNumber * florCountFlat;

        int entrance = (flatNumber - 1) / flatPerEntrance + 1;
        int floor = ((flatNumber - 1) % flatPerEntrance) / flatPerEntrance + 1;
        System.out.println(entrance);
        System.out.println(floor);


    }
}
