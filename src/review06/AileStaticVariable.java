package review06;

public class AileStaticVariable {
    static int ailePizza = 8;
    int bireyselPizza = 8;

    public static void main(String[] args) {
        AileStaticVariable cocuk = new AileStaticVariable();

        cocuk.ailePizza -= 2;
        cocuk.bireyselPizza -=2;

      // System.out.println(cocuk.ailePizza); //6
      // System.out.println(cocuk.bireyselPizza); //6

        AileStaticVariable anne = new AileStaticVariable();
        anne.ailePizza -= 2;
        anne.bireyselPizza -= 2;
        System.out.println(anne.ailePizza);//4
        System.out.println(anne.bireyselPizza);//6

        AileStaticVariable baba = new AileStaticVariable();
        baba.ailePizza -= 2;
        baba.bireyselPizza -= 2;
        System.out.println(baba.ailePizza);//2
        System.out.println(baba.bireyselPizza);//6

    }
}
