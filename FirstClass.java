public class FirstClass {
  public static void main(String[] args) {
    int dadoDoTipoInt = 18;
    double dadoDoTipoDouble = 10;
    float dadoDoTipoFloat = 3.14f;
    String dadoDoTipoString = "Hello";
    boolean dadoDoTipoBoolear = true;
    // Long -> Valores muito grandes. Esse precisa de um L grande no final do número

    // if - else
    if (dadoDoTipoInt == 10) {
      System.out.println("Entrou no If");
    } else {
      System.out.println("entrou no Else");
    }

    // while

    // int valorWhile = 0;
    // while (valorWhile < 3) {
    // System.out.println(valorWhile + "valor inicial é ${valorWhile}");
    // valorWhile++;
    // }

    for (int i = 0; i < 4; i++) {
      System.out.println("O valor do I é: " + i);
    }
  }
}