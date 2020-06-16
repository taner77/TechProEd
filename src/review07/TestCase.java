package review07;

public class TestCase {
    public static void main(String[] args) {
        Case case1 = new Case();
        Hasta hasta1 =new Hasta();

        case1.setActualCase("Romatizma");
        case1.setEmercencey("normal");

//        System.out.println("Suanki durum: " + case1.getActualCase());
//        System.out.println("Emergencey durum: " + case1.getEmercencey());

        hasta1.setIsim("Ali");
        hasta1.setSoyIsim("Canik");
        hasta1.setActualCase(case1);

        System.out.println("Hsatanin ismi: "+hasta1.getIsim());
        System.out.println("Hastanin soy ismi: "+hasta1.getSoyIsim());
        System.out.println("Hastanin durumu: "+hasta1.getActualCase().getActualCase());//!!!!!!!!!
        System.out.println("Hastanin aciliyet durumu: "+hasta1.getActualCase().getEmercencey());//!!!!!!!!!



    }
}
