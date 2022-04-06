class Main {
  public static void main(String[] args){
    
    Player player01 = new Player("FoxTrot", 100, 10,10);
    Monstro monstro01 = new Monstro("Gugu", 100, 2);
    Arma arma01 = new Arma("Fuzil", 4);

    
    
    String playerStatus = player01.exibirStatus();
    System.out.println(playerStatus);
    
    String monstroStatus = monstro01.exibirStatus();
    System.out.println(monstroStatus);
    
    String armaStatus = arma01.exibirStatus();
    System.out.println(armaStatus);
    
  }
}