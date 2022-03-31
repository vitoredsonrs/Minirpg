class Monstro{

  String nome;
  int forca;
  int pontosVida;

  int causarDanos(){
    return forca * 3;
  }

  String grunhir(){
    return "I'M GOOING TO KILL YOU!!!";
  }

  void receberDano(int dano){
    pontosVida-=dano; 
    if(pontosVida <= 0){
      morrer();
    }
  }
  void morrer(){
    System.out.println("O monstro está morto.");
  }
}