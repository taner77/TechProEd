package day08_ternary_operator;

public class TekAndCiftAnd {
    public static void main(String[] args) {
        System.out.println(3<2 && 5>4);
        // System.out.println(3<2 && 5>4 && 6>2 && 1>4 && 4>4);
        // && kullanirsaniz Java ilk false'u bulduktan sonra deger kuntrolleri yapmaz
        // Bu da Java'nin yukunu azaltir. Yukun azaltilmasi sure kazandirir ve Java hata yapma riskini azaltir



        System.out.println(3<2 & 5>4);
        //& kullanirsaniz Java ilk false'u bulduktan sonra diger kontrolleri yapar.
        //Bu da Java icin iyi degildir, cunku sonucu belli olan bir islem icin hala emek sarfediyor.

    }
}
