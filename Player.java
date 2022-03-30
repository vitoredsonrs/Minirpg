class Player{

  float posicaoX;
  float posicaoY;
  int pontosVida;
  String nome;

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

  void exibirPontosDeVida(){
    
  }

  String exibirStatus(){
    
  }
  
}