class Monstro{

  String nome;
  int pontosVida;
  int forca;

Monstro(String name, int pntsVida, int force){
    System.out.println("Construtor do monstro");

    nome = name;
    forca = force;
    pontosVida = pntsVida;
  }
  
  
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
  String exibirStatus(){
    String status ="Nome: " + nome + " Vida: " + pontosVida;
    return status;
  }
}