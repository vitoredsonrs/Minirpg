class Arma{

  String nome;
  int pontosDano;

Arma(String name, int pntsDano){
  //System.out.println("Construtor da arma");

  nome = name;
  pontosDano = pntsDano;
}
  
  int causarDanos(){
    return pontosDano;
  }
  String exibirStatus(){
    String status ="Nome: " + nome + " Dano: " + pontosDano;
    return status;
  }
}