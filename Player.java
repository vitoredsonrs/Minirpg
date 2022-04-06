class Player{

  float posicaoX;
  float posicaoY;
  int pontosVida;
  int danoArma;
  int forca;
  String nome;

  //Costrutor
  Player(String name, int pntsVida, float posicaoInicialX, float posicaoInicialY){
    //System.out.println("Construtor do player");

    nome = name;
    pontosVida = pntsVida;

    posicaoX = posicaoInicialX;
    posicaoY = posicaoInicialY;
    
  }
  int causarDano(){
    return forca;
  }

  void mover(float posX, float posY){
    posicaoX += 5;
    posicaoY += 5;
    
  }
  float exibirPosicaoX(){
    return posicaoX;
  }
  
  float exibirPosicaoY(){
    return posicaoY;
  }

  void receberDano (int dano){
    pontosVida -= dano;
    
  }

  int exibirPontosDeVida(){
    return pontosVida;
    
  }


  String exibirStatus(){
    String status ="Nome: " + nome + " Vida: " + pontosVida;
    return status;
    
  }
  
}